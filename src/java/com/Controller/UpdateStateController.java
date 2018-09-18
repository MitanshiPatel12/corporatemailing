package com.Controller;

import com.Bean.Master.State_Bean;
import com.Model.DoMethods;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateStateController extends HttpServlet
{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        try {
            
                State_Bean sb=new State_Bean();
                String stateid=request.getParameter("stateid");
                String state=request.getParameter("addstate");
                //System.out.println("State Updated::"+state);
                sb.setState(state);
                sb.setStateId(stateid);

                DoMethods.updateState(sb);

                RequestDispatcher rd=request.getRequestDispatcher("./State_Controller");
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
