package com.Controller;

import com.Model.DoMethods;
import com.Bean.Master.RegistrationEmployeeBean;
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
public class Employee_Registration_Controller extends HttpServlet {

   
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
       {
              RegistrationEmployeeBean re=new RegistrationEmployeeBean();
              
              
                String fn =request.getParameter("firstname");
                  String ln =request.getParameter("lastname");
                 String eml =request.getParameter("email");
                  String dat =request.getParameter("dateofbirth");
                 String gndr =request.getParameter("gender");
                 String add =request.getParameter("street");
                 String con=request.getParameter("contactno");
                 String post=request.getParameter("post");
                 String primaryskill=request.getParameter("primaryskill");
                 String secondaryskill=request.getParameter("secondaryskill");
                 String otherskill=request.getParameter("otherskill");
                 String username=request.getParameter("username");
                 String password=request.getParameter("password");
                 String citi =request.getParameter("city");
                 String sta =request.getParameter("state");
               
                 
                 
                re.setfirstname(fn);
                re.setlastname(ln);
                re.setemail(eml);
                re.setdateofbirth(dat);
                re.setgender(gndr);  
                re.setaddress(add);
                re.setcontactno(con);
                re.setcity(citi);
                re.setstate(sta);
                re.setpost(post);
                re.setprimaryskill(primaryskill);
                re.setsecondaryskill(secondaryskill);
                re.setotherskill(otherskill);
                re.setusername(username);
                re.setpassword(password);
                
                
               
          
                DoMethods.insertEmployeeRegistrationDetails(re);
                
                
                        RequestDispatcher rd=request.getRequestDispatcher("EmployeeRegistrationForm.jsp");
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
