
package com.Controller;

import com.Bean.Master.Project_Bean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Project_Controller extends HttpServlet {

   
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
            
            ArrayList<Project_Bean> ProjectData = DoMethods.getProject();
            request.setAttribute("ProjectData",ProjectData);
            /*
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Post_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Post_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            */
            request.getRequestDispatcher("ViewProjectJsp.jsp").include(request, response);
        } 
        catch(Exception e)
        {
            System.out.println("Exception in PROJECT_CONTROLLER  "+e);
        }
        finally {            
            out.close();
        }
    }
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
       doPost(request,response);
   }
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }
}
