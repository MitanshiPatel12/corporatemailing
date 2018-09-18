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

/**
 *
 * @author Mazcon
 */
public class Add_Skill_Controller extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        try {
            
           
            MasterBean mb=new MasterBean();
            String skill=request.getParameter("addskill");
            System.out.println("SKILL INSERTED::"+skill);
            mb.setSkill(skill);
            
            DoMethods.insertSkill(mb);
            
            /*
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Add_Skill_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add_Skill_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
             request.getRequestDispatcher("Skill_Controller").forward(request, response);
        } 
        catch(Exception e)
        {
            System.out.println("Exception caught in ADD_SKILL_CONTROLLER"+e);
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
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
