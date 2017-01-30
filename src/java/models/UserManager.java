/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.SQLException;

/**
 *
 * @author abiolam
 */
public interface UserManager {
     int addUser(User user)throws ClassNotFoundException, SQLException;
     boolean authenticate (String username, String password)throws ClassNotFoundException, SQLException;
     User getUser(String username) throws ClassNotFoundException, SQLException;
     void login(String user)throws ClassNotFoundException, SQLException;
     void logout(String user) throws ClassNotFoundException, SQLException;
}
