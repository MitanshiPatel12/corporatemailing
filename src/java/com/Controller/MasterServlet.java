/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Master.MasterBean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MasterServlet extends HttpServlet 
{

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
            
            MasterBean mb=new MasterBean();
            
            String post=request.getParameter("addpost");
            mb.setPost(post);
            DoMethods.insertPost(mb);
            String skill=request.getParameter("skill");
            mb.setSkill(skill);
            String state=request.getParameter("state");
            mb.setState(state);
            String city=request.getParameter("city");
            mb.setCity(city);
            
            
            
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MasterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>");
            out.println("Post "+post+"has been inserted");
            out.println("<br>");
            out.println("Skill "+skill+"has been inserted");
            out.println("<br>");
            out.println("State "+state+"has been inserted");
            out.println("<br>");
            out.println("City "+city+"has been inserted");
            out.println("<br>");
            out.println("</h3>");
            out.println("</body>");
            out.println("</html>");
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
    }
}
