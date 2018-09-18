/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Master.State_Bean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mazcon
 */
public class State_Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            
            ArrayList<State_Bean> StateData = DoMethods.getState();
            request.setAttribute("StateData",StateData);
            /*
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet State_Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet State_Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            */
            request.getRequestDispatcher("AddStateJsp.jsp").include(request, response);
        } 
        catch(Exception e)
        {
            System.out.println("Exception in STATE_CONTROLLER"+e);
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