/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Master.Admin_Sign_Up_Bean;
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
public class SignUp_Registration_Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            Admin_Sign_Up_Bean asub=new Admin_Sign_Up_Bean();
            
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            String gender=request.getParameter("gender");
            String address=request.getParameter("address");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String dob=request.getParameter("dateofbirth");
            String username=request.getParameter("username");
            
            asub.setName(name);
            asub.setEmail(email);
            asub.setPassword(password);
            asub.setGender(gender);
            asub.setAddress(address);
            asub.setCity(city);
            asub.setState(state);
            asub.setDOB(dob);
            asub.setUserName(username);
            
            DoMethods.insertAdminDetails(asub);
            
            /*
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp_Registration_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp_Registration_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            */
            
            request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
        
        
        } 
        
        catch(Exception e)
        {
            System.out.println("EXCEPTION IN SIGN_UP_REGISTRATION_CONTROLLER "+e);
        }
        
        finally 
        
        {            
            out.close();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
