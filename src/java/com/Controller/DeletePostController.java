package com.Controller;

import com.Bean.Master.Post_Bean;
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
public class DeletePostController extends HttpServlet 
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        
        try {
            
            Post_Bean pb=new Post_Bean();
            String postid=request.getParameter("postid");
            //String post=request.getParameter("addpost");
            //System.out.println("POST Updated::"+post);
           // pb.setPost(post);
            pb.setPostId(postid);
            
            DoMethods.deletePost(pb);
            
             RequestDispatcher rd=request.getRequestDispatcher("./Post_Controller");
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
