/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author abiolam
 */
public class userDatabaseManager implements UserManager{

    @Override
    public int addUser(User user)throws ClassNotFoundException, SQLException {
           CallableStatement insert = chatMeDatabase.connect().prepareCall("{call sp_addUser(?,?,?)}");
        insert.setString(1, user.getUsername());
        insert.setString(2, user.getFullname());
        insert.setString(3, user.getPassword());
        int rows = insert.executeUpdate();
        chatMeDatabase.disconnect();
        return rows;
    }
                
    

    @Override
    public boolean authenticate(String username, String password)throws ClassNotFoundException, SQLException {
               CallableStatement query = chatMeDatabase.connect().prepareCall("{call sp_authUser(?,?)}");
        query.setString(1, username);
        query.setString(2, password);
        ResultSet table = query.executeQuery();
        boolean valid = table.next();
        table.close();
        chatMeDatabase.disconnect();
        return valid;

    }

    @Override
    public User getUser(String username) throws ClassNotFoundException, SQLException{
        CallableStatement query = chatMeDatabase.connect().prepareCall("{call sp_getUser(?)}");
        query.setString(1, username);
        ResultSet table = query.executeQuery();
        User u = null;
        if (table.next()) {
            u = new User();
            u.setUsername(table.getString(1));
            u.setFullname(table.getString(2));
            u.setPassword(table.getString(3));
        }
        table.close();
        return u;
    }

    @Override
    public void login(String user) throws ClassNotFoundException, SQLException {
      CallableStatement insert = chatMeDatabase.connect().prepareCall("{call sp_login}");
      insert.setString(1, user);
      insert.executeUpdate();
      
    }

    @Override
    public void logout(String user) throws ClassNotFoundException, SQLException {
        CallableStatement insert = chatMeDatabase.connect().prepareCall("{call sp_logout}");
      insert.setString(1, user);
      insert.executeUpdate();
    }
}
