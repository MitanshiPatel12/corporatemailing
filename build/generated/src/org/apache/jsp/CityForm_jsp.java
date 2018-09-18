package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Bean.Master.State_Bean;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.Model.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import com.Bean.Master.City_Bean;

public final class CityForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String state_name; 
 public static Connection con;
             public static PreparedStatement ps;
             public static ResultSet rs;
             String statename=null;
         
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("        <form action=\"Add_City_Controller\" method=\"post\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("  Select State:\n");
      out.write("  \n");
      out.write("  <select name=\"statename\">\n");
      out.write("              \n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
 
     
     ArrayList<State_Bean> StateData= (ArrayList<State_Bean>) request.getAttribute("StateData");
    
        try
        {
            if(StateData!=null)
            {
                Iterator itr=StateData.iterator();
                while(itr.hasNext())
                {
                       State_Bean bean=(State_Bean)itr.next();
                       int state_id=bean.getStateId();
                       String state_name=bean.getState();
   
      out.write("\n");
      out.write("                 <option value=\"");
      out.print(state_id);
      out.write('"');
      out.write('>');
      out.print(state_name);
      out.write("</option>\n");
      out.write("   ");

                 }
            }
        }
      
     catch(Exception e)
        {
         System.out.println("Exception in DROPDOWNLIST"+e);
        }             
     
      out.write("\n");
      out.write("\n");
      out.write(" </select>\n");
      out.write("     <br><br>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("            \n");
      out.write("            Add City:\n");
      out.write("            <input type=\"text\" name=\"addcity\">\n");
      out.write("            <input type=\"submit\" value=\"Add\" name=\"submit\">\n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     <table>\n");
      out.write("         <tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t<th>City Id</th>\n");
      out.write("\t\t\t\t\t\t<th>City Name</th>\n");
      out.write("\t\t\t\t\t\t\t<th>State Name</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("         ");
      out.write("      \n");
      out.write("        ");

        
       
        ArrayList<City_Bean> CityData=(ArrayList<City_Bean>)request.getAttribute("CityData");
             if(CityData!=null)
             {
                 Iterator i= CityData.iterator();
                 while(i.hasNext())
                 {
                     City_Bean pb=(City_Bean)i.next();
                     int city_id=pb.getCityId();
                     String city_name=pb.getCity();
                     int state_id=pb.getStateId();
                     
                      con=DBConnection.getConnection();
                      ps=con.prepareStatement("SELECT StateName from states where StateId='"+state_id+"'");
                      rs=ps.executeQuery();
                      while(rs.next())
                      {
                       statename=rs.getString("StateName");
                      }
                      
                      
                  
      out.write("\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( city_id );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( city_name );
      out.write("</td>\n");
      out.write("\t\t\t\t\t        <td>");
      out.print( statename );
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                           <input type=\"button\" name=\"update\" value=\"Update\">\n");
      out.write("                                                           <input type=\"button\" name=\"delete\" value=\"Delete\">\n");
      out.write("                                                </td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                   ");
 
                        }
                     }
                    
      out.write("\n");
      out.write("       </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
