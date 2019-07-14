package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <h1>New Product</h1>\n");
      out.write("        <form name=\"frm\"  action=\"SaveProduct\" method=\"post\" \n");
      out.write("              enctype=\"multipart/form-data\">\n");
      out.write("            <table width=\"700px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Category ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"catid\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Product ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Offer Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"offerprice\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>description</td>\n");
      out.write("                    <td><textarea name=\"descript\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Image</td>\n");
      out.write("                    <td><input type=\"file\" name=\"image\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td colspan=\"2\"><input type=\"submit\" name=\"submit\" value=\"Save\"/></td>\n");
      out.write("                    \n");
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
