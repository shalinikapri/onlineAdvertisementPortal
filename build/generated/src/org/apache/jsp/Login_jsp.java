package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.Database_Connection;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ADD PORTAL</title>\n");
      out.write("        <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: mistyrose\">\n");
      out.write("         \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- main section-->\n");
      out.write("            <div class=\"row\" style=\"height: 600px\">\n");
      out.write("                <div class=\"col-sm-1\" style=\"margin-top: 10px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-11\" style=\"margin-top: 10px;\">\n");
      out.write("                    <center>\n");
      out.write("                        <h1>Login</h1>\n");
      out.write("                        <b>Userid</b> <input type=\"text\" name=\"t1\" style=\"background-color: powderblue;\"/>\n");
      out.write("                        <br><br>\n");
      out.write("                        <b>password</b> <input type=\"password\" name=\"t2\" style=\"background-color: powderblue;\"/>\n");
      out.write("                        <br><br>\n");
      out.write("                        <a href=\"payment.jsp\">\n");
      out.write("                            <input type=\"submit\" value=\"Login as buyer\" style=\"background-color: powderblue;\"/>\n");
      out.write("                        </a>\n");
      out.write("                         <a href=\"all_category.jsp\">\n");
      out.write("                            <input type=\"submit\" value=\"Login as seller\" style=\"background-color: powderblue;\"/>\n");
      out.write("                        </a>\n");
      out.write("                        <br><br>\n");
      out.write("                        <a href=\"register.jsp\"><b>Register New User</b></a>\n");
      out.write("                    </center>\n");
      out.write("         \n");
      out.write("       \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("    \n");
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
