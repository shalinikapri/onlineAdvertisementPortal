package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.Database_Connection;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Ad_portal</title>\n");
      out.write("    <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body style=\"background-color: mistyrose\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("     \n");
      out.write("     \n");
      out.write("         <!-- new section -->\n");
      out.write("                <div class=\"row\" style=\"height: 60px; background-color: blue;\">\n");
      out.write("                   ");
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
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"Login.jsp\">Login</a>\n");
      out.write("                <ul>\n");
      out.write("                <li><a href=\"register.jsp\">Edit profile</a></li>\n");
      out.write("                <li><a href=\"all_category.jsp\">Post ad</a></li>\n");
      out.write("                <li><a href=\"index.jsp\">search product</a></li>\n");
      out.write("                <li><a href=\"Contact_Us.jsp\">Manage ad</a></li>\n");
      out.write("                <li><a href=\"payment.jsp\">Order item</a></li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("             \n");
      out.write("            <li><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("            <li><a href=\"all_category.jsp\">post Advertisement</a></li>\n");
      out.write("            <li><a href=\"Contact_Us.jsp\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("                </div>\n");
      out.write("      <!--Main Section-->\n");
      out.write("      <div class=\"row\" style=\"height:600px;\">\n");
      out.write("        <div class=\"col-sm-2\">\n");
      out.write("          ");

            try {
              Database_Connection ob = new Database_Connection();
              String sql = "select * from category";
              ResultSet rs = ob.DQL(sql);
              while (rs.next()) {
                  
      out.write("\n");
      out.write("                  <div class=\"row\" style=\"height: 40px; margin-top: 2px;\n");
      out.write("                       background-color: orange; color: white;\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                      ");
      out.print(rs.getString("name"));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  ");

              }
            } catch (Exception ex) {
            }
          
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("          <div class=\"row\" style=\"background-color: lightgreen\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              ");

                if((request.getParameter("addtocart")!=null))
                {
                  if(request.getParameter("addtocart").equals("yes"))
                  {
                  out.println("<h1>Add to cart successfully</h1>");
                  }
                }
              
      out.write("\n");
      out.write("            </div>            \n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          ");

          try
          {
             Database_Connection ob = new Database_Connection();
             String pid=request.getParameter("pid");
              String sql = "select * from product where pid='"+pid+"'";
              ResultSet rs = ob.DQL(sql);
              if (rs.next()) {              
          
      out.write(" \n");
      out.write("          \n");
      out.write("          <div class=\"row\" style=\"margin-top: 50px\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("              <img  src=\"ShowImage.jsp?pid=");
      out.print(rs.getString(1));
      out.write("\" width=\"300\" height=\"350\" />\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("            <br>  <b> Name:");
      out.print(rs.getString(3));
      out.write("</b>              \n");
      out.write("            <br>  <b>Price:Rs.");
      out.print(rs.getString(5));
      out.write("</b>\n");
      out.write("            <br>  <b>Qty:</b>\n");
      out.write("              <input type=\"text\"/>\n");
      out.write("              <br>\n");
      out.write("              <a href=\"addtocart.jsp?pid=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("              <button>Add to Cart</button>\n");
      out.write("              </a>\n");
      out.write("            </div>  \n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\" style=\"margin-top: 30px\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("              <b>  Product Detail</b>\n");
      out.write("              <br>");
      out.print(rs.getString(6));
      out.write("\n");
      out.write("            </div>         \n");
      out.write("          </div>          \n");
      out.write("          ");
            
              }
          }
          catch(Exception ex){}
          
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!--Footer Section-->\n");
      out.write("      <div class=\"row\" style=\"height:100px;\">\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
