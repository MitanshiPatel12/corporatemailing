package com.Controller;

import com.Bean.Master.Project_Bean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mazcon
 */
public class DeleteProjectController extends HttpServlet 
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        
        try {
            
            Project_Bean pb=new Project_Bean();
            String projectid=request.getParameter("projectid");
            //String post=request.getParameter("addpost");
            //System.out.println("POST Updated::"+post);
           // pb.setPost(post);
            pb.setprojectid(projectid);
            
            DoMethods.deleteProject(pb);
            
             RequestDispatcher rd=request.getRequestDispatcher("./Project_Controller");
             rd.forward(request,response);
        } 
        catch(Exception e)
        {
            //System.out.println("Exception caught in ADD_POST_CONTROLLER"+e);
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
        doPost(request,response);
    }
    
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }

}
