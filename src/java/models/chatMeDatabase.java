/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abiolam
 */
public class chatMeDatabase {
     private static Connection con;
   public static Connection connect() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chateMe","root","");
       return con;
   }
   public static void disconnect()throws SQLException{
       if (con != null){
               con.close();
         
       }
   }
   
}


