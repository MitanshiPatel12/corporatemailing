package com.Controller;

import com.Bean.Master.ProjectAllocationBean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AllocateProjectController extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            ProjectAllocationBean pab=new ProjectAllocationBean();
            
            String projectid=request.getParameter("projectname");
            String employeeid=request.getParameter("teamleader");
            
            pab.setEmployeeId(employeeid);
            pab.setProjectId(projectid);
            
            DoMethods.insertProjectAllocationDetail(pab);
            
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AllocateProjectController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AllocateProjectController output:: " + request.getParameter("projectname") +"  " + request.getParameter("teamleader") +"</h1>");
            out.println("</body>");
            out.println("</html>");
             */
             request.setAttribute("projectid", projectid);
             request.setAttribute("employeeid", employeeid);
             
             request.getRequestDispatcher("ViewProjectAllocationDetailsJsp.jsp").include(request, response);

        } 
        catch (SQLException ex)
        {        
            Logger.getLogger(AllocateProjectController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AllocateProjectController.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally 
        {
            out.close();
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doPost(request, response);
    }

   
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }

}
