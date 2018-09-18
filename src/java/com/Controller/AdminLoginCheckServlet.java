
package com.Controller;

import com.Model.DBConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLoginCheckServlet extends HttpServlet
{
    public static Connection con;
    public static ResultSet rs;
    public static PreparedStatement ps;
    int x=0;
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
     {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            con=DBConnection.getConnection();
            System.out.println("DATABASE CONNECTED");
            
            String userid=request.getParameter("userid");
            //System.out.println("***************"+userid);
            String password=request.getParameter("password");
           // System.out.println("*****************"+password);
            
           
            ps=con.prepareStatement("SELECT * from admindetails");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               
                  String adminid=rs.getString("AdminId");
                //  System.out.println("#############"+adminid);
                  String pass=rs.getString("Password");
                 // System.out.println("###########"+pass);
        
                  if(userid.equals(adminid) && password.equals(pass))
                  {
                    x=1;
                  }
                  else
                  {
                     x=0;
                  }
            }
            
            if(x==1)
            {
                RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
                rd.forward(request,response);
            }
            
            else
            {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminLoginCheckServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Wrong Userid or password</h1>");
            out.println("</body>");
            out.println("</html>");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {            
            out.close();
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
