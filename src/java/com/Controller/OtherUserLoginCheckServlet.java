
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
import javax.servlet.http.HttpSession;


public class OtherUserLoginCheckServlet extends HttpServlet
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
            String password=request.getParameter("password");
            String designation=request.getParameter("designation");
            
           
            ps=con.prepareStatement("SELECT * from employee_details");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               
                  String employee_id=rs.getString("EmployeeId");
                  String pass=rs.getString("Password");
                  String post=rs.getString("Post");
                
        
                  if(userid.equals(employee_id) && password.equals(pass) && (post.equals("Manager") && designation.equals(post)))
                  {
                    HttpSession ses=request.getSession();
                    ses.setAttribute("userid", employee_id); 
                      
                    RequestDispatcher rd=request.getRequestDispatcher("ManagerWelcomeJsp.jsp");
                    rd.forward(request,response);
                    
                    
                   
                  }
                  
                  else if(userid.equals(employee_id) && password.equals(pass) && ( post.equals("Team Leader") && designation.equals(post)))
                  {
                    HttpSession ses=request.getSession();
                    ses.setAttribute("userid", employee_id); 
                      
                    
                    RequestDispatcher rd=request.getRequestDispatcher("TeamLeaderWelcomeJsp.jsp");
                    rd.forward(request,response);
                  }
                  
                  else if (userid.equals(employee_id) && password.equals(pass) && ( post.equals("Developer") && designation.equals(post)))
                  {
                     
                    HttpSession ses=request.getSession();
                    ses.setAttribute("userid", employee_id);
                      
                    RequestDispatcher rd=request.getRequestDispatcher("#");
                    rd.forward(request,response);
                  }
               
                  else
                  {
                      x=1;
                  }
            }
            
            if(x==1)
            {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet AdminLoginCheckServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Oops !! Wrong Userid or password or Designation !!</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {            
            out.close();
        }
    }
           
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
