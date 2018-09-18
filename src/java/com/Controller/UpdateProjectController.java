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
 * @author parth
 */
public class UpdateProjectController extends HttpServlet {

   
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
       {
              Project_Bean pb=new Project_Bean();
              
            String projectid=request.getParameter("projectid");
            String title=request.getParameter("projecttitle");
            String summary=request.getParameter("projectsummary");
            String startingdate=request.getParameter("startingdate");
            String endingdate=request.getParameter("endingdate");
            String language=request.getParameter("projectlanguage");
            String clientname=request.getParameter("clientname");
            String address=request.getParameter("street");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String contactno=request.getParameter("clientcontactno");
            String email=request.getParameter("clientemail");
          
            
                pb.setprojectid(projectid);
                pb.settitle(title);
                pb.setsummary(summary);
                pb.setstartingdate(startingdate);
                pb.setendingdate(endingdate);
                pb.setlanguage(language);
                pb.setclientname(clientname);
                pb.setaddress(address);
                pb.setcity(city);
                pb.setstate(state);
                pb.setcontactno(contactno);
                pb.setemail(email);

                
                DoMethods.updateProject(pb);
                
                
                        RequestDispatcher rd=request.getRequestDispatcher("ViewProjectJsp.jsp");
                        rd.forward(request,response);
       }
            catch (Exception e)
            {
                
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
