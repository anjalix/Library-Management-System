/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

/**
 *
 * @author Anjali
 */



import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    static Connection con=null;
    static{
        try
            {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver loaded Successfully");
        
            }
        catch(Exception e)
            {
                System.out.println("Exception occured while loading the Driver." + e);
            }
    
    
    }
    
    public static Connection getConnection() throws Exception
    {
     String dbUrl="jdbc:mysql://localhost:3306/Library_Management_System";
                String root="root";
                String password="password";
                con= DriverManager.getConnection(dbUrl, root, password);
                if(con==null){
                             System.out.println("Connection Not Established.");
                             }
                else{
                             System.out.println("Connection Established.");
                             }
                return con;
    }
    
    
    
    
    
}
