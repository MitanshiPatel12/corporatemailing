
package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
  public static Connection con;
  public static Connection getConnection() throws SQLException,ClassNotFoundException
  {
      try
      {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corporate-db","root","root");
          System.out.println("CONNECTED DB !!!!!");
      }
      catch(Exception e)
           
      {
          System.out.println(e);
      }
     return con; 
  }
}
