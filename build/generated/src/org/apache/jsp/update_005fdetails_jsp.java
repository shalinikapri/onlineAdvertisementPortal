package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menubar.jsp");
  }

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

    String msg = "";
    String msge = "";
    if (request.getParameter("submit") != null) {
        int catid = Integer.parseInt(request.getParameter("txtcatid"));
        String name = request.getParameter("txtcatname");
        String descript = request.getParameter("txtcatdes");
        String sql = "insert into category (catid,name,descript) values("
                + catid + ",'" + name + "','" + descript + "')";
        out.println(sql);
        com.Database_Connection ob = new com.Database_Connection();
        int re = ob.DML(sql);
        if (re > 0) {
            msg = "Save successfully";
        } else {
            msge = "Not Save successfully";
        }
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("            <li><a href=\"First.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"Login.jsp\">Login</a>\n");
      out.write("                <ul>\n");
      out.write("                <li><a href=\"\">Edit profile</a></li>\n");
      out.write("                <li><a href=\"\">Post ad</a></li>\n");
      out.write("                <li><a href=\"\">view, reply message</a></li>\n");
      out.write("                <li><a href=\"\">search ad</a></li>\n");
      out.write("                <li><a href=\"\">Manage ad</a></li>\n");
      out.write("                <li><a href=\"\">Order item</a></li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("             \n");
      out.write("            <li><a href=\"\">About Us</a></li>\n");
      out.write("            <li><a href=\"\">post Advertisement</a></li>\n");
      out.write("            <li><a href=\"\">Contact Us</a></li>\n");
      out.write("            <li><a href=\"\">Feedback</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <form name=\"frm\" >\n");
      out.write("            <span style=\"color:green\"> ");
      out.print(msg);
      out.write("</span> \n");
      out.write("            <span style=\"color:red\"> ");
      out.print(msge);
      out.write("</span>    \n");
      out.write("            <table>\n");
      out.write("                <caption>Update Details</caption>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Logo</td>\n");
      out.write("                    <td><input type=\"file\" name=\"image\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name of the user</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtcatname\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>WebSite URL</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtcatdes\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Store Detail</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtcatdes\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Category</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtcatdes\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtcatdes\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"reset\" value=\"Reset\"/></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"Post\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
