package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/header.jsp");
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
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>   \n");
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
      out.write("            <li><a href=\"#\">Category</a>\n");
      out.write("                <ul>   \n");
      out.write("            <li><a href=\"online_ad.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"\">post Advertisement</a></li>\n");
      out.write("            <li><a href=\"#\">Category</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"new_category.jsp\">New Category</a></li>\n");
      out.write("                    <li><a href=\"All_category.jsp\">All Category</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            <li><a href=\"\">Product</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"All_Product_list.jsp\">All Product List</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"\">Customer</a>\n");
      out.write("            <li><a href=\"\">Profile</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">Change Password</a></li>\n");
      out.write("                    <li><a href=\"\">Logout</a>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"\">Feedback</a></li>\n");
      out.write("           </ul>\n");
      out.write("          </ul>\n");
      out.write("             </li>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("            <li><a href=\"\">             </a></li>\n");
      out.write("            <li><a href=\"\">View all user</a></li>\n");
      out.write("            <li><a href=\"\">View all posts</a></li>\n");
      out.write("            <li><a href=\"\">View feedback</a></li>\n");
      out.write("            <li><a href=\"\">Search</a></li>\n");
      out.write("            <li><a href=\"\">Manage Ad</a></li>\n");
      out.write("            <li><a href=\"\">Deactivate user account</a></li>\n");
      out.write("            <li><a href=\"\">Admin change password</a></li>\n");
      out.write("        </ul>\n");
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
