/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Master.Project_Bean;
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
public class AddProjectController extends HttpServlet
{

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        try {
            
           
            Project_Bean pb=new Project_Bean();
            
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
           
         /* System.out.println("#33333333333333333##########::"+title);
            System.out.println("#33333333333333333##########::"+summary);
            System.out.println("#33333333333333333##########::"+startingdate);
            System.out.println("#33333333333333333##########::"+endingdate);
            System.out.println("#33333333333333333##########::"+language);
            System.out.println("#33333333333333333##########::"+clientname);
            System.out.println("#33333333333333333##########::"+address);
            System.out.println("#33333333333333333##########::"+city);
            System.out.println("#33333333333333333##########::"+state);
            System.out.println("#33333333333333333##########::"+contactno);
            System.out.println("#33333333333333333##########::"+email);
         */


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
            
            
            DoMethods.insertProject(pb);
            
            
            /*out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Add_Post_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add_Project_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
             request.getRequestDispatcher("Project_Controller").forward(request, response);
        } 
        catch(Exception e)
        {
            System.out.println("Exception caught in ADD_PROJECT_CONTROLLER"+e);
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
