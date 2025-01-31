/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class ConnectionProviderPatient {
    public static Connection getCon(){
        try
       {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "loveblue7");
       return con;
       }
       catch(Exception e)
       {
           return null;
       }
      
    
   
      
       } 
}
