/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author iftia
 */
public class DBconnection {
    
    //connecting to Database.
    
    public static Connection con;
    
    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pass = "112358.mysql";
        
        try{
            con = DriverManager.getConnection(url, user, pass);
            if (con != null){
                JOptionPane.showMessageDialog(null, "Database connected");
            }else{
                 JOptionPane.showMessageDialog(null, "Database connection error");      
            }
            
                   
        }
        catch (Exception e){
             JOptionPane.showMessageDialog(null, "Connection Failed!");
        }
    }
     
    
}
