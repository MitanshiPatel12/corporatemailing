/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Master.City_Bean;
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
public class City_Controller extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try
        {
            ArrayList<City_Bean> CityData = DoMethods.getCity();
        
            ArrayList<State_Bean> StateData = DoMethods.getState();
            
            if(StateData !=null)
            {
                request.setAttribute("StateData",StateData);
                request.setAttribute("CityData",CityData);
            
            
                request.getRequestDispatcher("AddCityJsp.jsp").include(request, response);
                
            }
            
            else
            {
                out.println("Fill States first");
                request.getRequestDispatcher("Welcome.jsp").include(request, response);
            
            }
             
            
        } 
        catch(Exception e)
        {
            System.out.println("Exception in CITY_CONTROLLER :: "+e);
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
