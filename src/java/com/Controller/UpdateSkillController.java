package com.Controller;

import com.Bean.Master.Skill_Bean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateSkillController extends HttpServlet
{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        try {
            
                Skill_Bean sb=new Skill_Bean();
                String skillid=request.getParameter("skillid");
                String skill=request.getParameter("addskill");
                System.out.println("Skill Updated::"+skill);
                sb.setSkill(skill);
                sb.setSkillId(skillid);

                DoMethods.updateSkill(sb);

                RequestDispatcher rd=request.getRequestDispatcher("./Skill_Controller");
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
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
