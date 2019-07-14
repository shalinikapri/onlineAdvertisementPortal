package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.Database_Connection;

public final class All_005fCompany_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <li><a href=\"#\">Category</a>\n");
      out.write("                <ul>   \n");
      out.write("            <li><a href=\"index,jsp\">Home</a></li>\n");
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
      out.write("           </ul>\n");
      out.write("          </ul>\n");
      out.write("             </li>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1>All Company Page</h1>\n");
      out.write("        <form name=\"frm\">\n");
      out.write("            <table width=\"900px\" border=\"1px solid\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Edit</td>\n");
      out.write("                    <td>Company ID</td>\n");
      out.write("                    <td>Product ID</td>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>Price</td>\n");
      out.write("                    <td>Offer Price</td>\n");
      out.write("                    <td>Descriptions</td>\n");
      out.write("                    <td>Image</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    Database_Connection ob=new Database_Connection();
                    String sql="select * from company_page";
                    ResultSet rs=ob.DQL(sql);
                    while (rs.next()){
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"Editcompany_page.jsp?pid=");
      out.print(rs.getString(1));
      out.write("\">Edit</a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                            <td><img src=\"ShowImage.jsp?pid=");
      out.print(rs.getString(1));
      out.write("\" width=\"60\" height=\"60\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                    
                    
      out.write("\n");
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
