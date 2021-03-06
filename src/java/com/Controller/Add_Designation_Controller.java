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
public class Add_Designation_Controller extends HttpServlet {

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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        try {
            
           
            MasterBean mb=new MasterBean();
            String designation=request.getParameter("adddesignation");
            System.out.println("Designation INSERTED::"+designation);
            mb.setDesignation(designation);
            
            DoMethods.insertDesignation(mb);
            
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Add_Designation_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add_Designation_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
             request.getRequestDispatcher("Designation_Controller").forward(request, response);
        } 
        catch(Exception e)
        {
            System.out.println("Exception caught in ADD_Designation_CONTROLLER"+e);
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
