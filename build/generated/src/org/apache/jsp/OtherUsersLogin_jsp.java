package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.Model.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import com.Bean.Master.Designation_Bean;

public final class OtherUsersLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\n");
      out.write("<!--[if !IE]><!--> \n");
      out.write("<html lang=\"en\"> <!--<![endif]-->\n");
      out.write("<!-- BEGIN HEAD -->\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<title>Corporate | User Login</title>\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("\t<meta content=\"\" name=\"description\" />\n");
      out.write("\t<meta content=\"\" name=\"author\" />\n");
      out.write("\t<!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("\t<link href=\"assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/plugins/bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/css/style-metro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link href=\"assets/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\n");
      out.write("\t<link href=\"assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/plugins/select2/select2_metro.css\" />\n");
      out.write("\t<!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("\t<!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("\t<link href=\"assets/css/pages/login-soft.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.css\"/>\n");
      out.write("\t<!-- END PAGE LEVEL STYLES -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\" />\n");
      out.write("</head>\n");
      out.write("<!-- END HEAD -->\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("<body class=\"login\">\n");
      out.write("\t<!-- BEGIN LOGO -->\n");
      out.write("\t<div class=\"logo\">\n");
      out.write("\t\t<img src=\"assets/img/logo-big.png\" alt=\"\" /> \n");
      out.write("\t</div>\n");
      out.write("\t<!-- END LOGO -->\n");
      out.write("\t<!-- BEGIN LOGIN -->\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<!-- BEGIN LOGIN FORM -->\n");
      out.write("\t\t<form class=\"form-vertical login-form\" action=\"./OtherUserLoginCheckServlet\" method=\"post\">\n");
      out.write("\t\t\t<h3 class=\"form-title\">Login to your account</h3>\n");
      out.write("\t\t\t<div class=\"alert alert-error hide\">\n");
      out.write("\t\t\t\t<button class=\"close\" data-dismiss=\"alert\"></button>\n");
      out.write("\t\t\t\t<span>Enter any username and password.</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Username</label>\n");
      out.write("\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user\"></i>\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"Username\" name=\"userid\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Password</label>\n");
      out.write("\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-lock\"></i>\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"password\" autocomplete=\"off\" placeholder=\"Password\" name=\"password\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <div class=\"control-group\">\n");
      out.write("                            ");

                                Connection con;
                                PreparedStatement ps;
                                ResultSet rs;
                            
      out.write("\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Designation</label>\n");
      out.write("\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\n");
      out.write("                                             <select name=\"designation\">\n");
      out.write("\t\t\t\t\t\t");

                                                    try{
                                                            con=DBConnection.getConnection();
                                                            String query="SELECT * from designations";

                                                            ps=con.prepareStatement(query);

                                                            rs=ps.executeQuery();
                                                       
                                                        while(rs.next())
                                                        {
                                                           
                                                           int id=rs.getInt("DesignationId");
                                                           String str=rs.getString("DesignationName");
                                                
      out.write("\n");
      out.write("                                                     <option>");
      out.print(str);
      out.write("</option>\n");
      out.write("                                                ");

                                                        }
                                                    } 
                                                    
                                                    catch(Exception e){}
                                                
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                </select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"remember\" value=\"1\"/> Remember me\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn blue pull-right\">\n");
      out.write("\t\t\t\tLogin <i class=\"m-icon-swapright m-icon-white\"></i>\n");
      out.write("\t\t\t\t</button>            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"forget-password\">\n");
      out.write("\t\t\t\t<h4>Forgot your password ?</h4>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tno worries, click <a href=\"javascript:;\"  id=\"forget-password\">here</a>\n");
      out.write("\t\t\t\t\tto reset your password.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- END LOGIN FORM -->        \n");
      out.write("\t\t<!-- BEGIN FORGOT PASSWORD FORM -->\n");
      out.write("\t\t<form class=\"form-vertical forget-form\" action=\"index.html\" method=\"post\">\n");
      out.write("\t\t\t<h3 >Forget Password ?</h3>\n");
      out.write("\t\t\t<p>Enter your e-mail address below to reset your password.</p>\n");
      out.write("\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"Email\" autocomplete=\"off\" name=\"email\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"back-btn\" class=\"btn\">\n");
      out.write("\t\t\t\t<i class=\"m-icon-swapleft\"></i> Back\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn blue pull-right\">\n");
      out.write("\t\t\t\tSubmit <i class=\"m-icon-swapright m-icon-white\"></i>\n");
      out.write("\t\t\t\t</button>            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- END FORGOT PASSWORD FORM -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END LOGIN -->\n");
      out.write("\t<!-- BEGIN COPYRIGHT -->\n");
      out.write("\t<div class=\"copyright\">\n");
      out.write("\t\t2013 &copy; Metronic - Admin Dashboard Template.\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END COPYRIGHT -->\n");
      out.write("\t<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\n");
      out.write("\t<!-- BEGIN CORE PLUGINS -->   <script src=\"assets/plugins/jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->\n");
      out.write("\t<script src=\"assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>      \n");
      out.write("\t<script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js\" type=\"text/javascript\" ></script>\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"assets/plugins/excanvas.min.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/respond.min.js\"></script>  \n");
      out.write("\t<![endif]-->   \n");
      out.write("\t<script src=\"assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>  \n");
      out.write("\t<script src=\"assets/plugins/jquery.cookie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\" ></script>\n");
      out.write("\t<!-- END CORE PLUGINS -->\n");
      out.write("\t<!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("\t<script src=\"assets/plugins/jquery-validation/dist/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/plugins/backstretch/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"assets/plugins/select2/select2.min.js\"></script>\n");
      out.write("\t<!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("\t<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("\t<script src=\"assets/scripts/app.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"assets/scripts/login-soft.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/scripts/ui-jqueryui.js\"></script>\n");
      out.write("\t<!-- END PAGE LEVEL SCRIPTS --> \n");
      out.write("\t<script>\n");
      out.write("\t\tjQuery(document).ready(function() {     \n");
      out.write("\t\t  App.init();\n");
      out.write("\t\t  Login.init();\n");
      out.write("                  UIJQueryUI.init();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- END JAVASCRIPTS -->\n");
      out.write("</body>\n");
      out.write("<!-- END BODY -->\n");
      out.write("</html>");
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
