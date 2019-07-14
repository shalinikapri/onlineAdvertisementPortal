package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.Database_Connection;
import java.sql.ResultSet;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ad_portal</title>\n");
      out.write("        <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- top section -->\n");
      out.write("             <!-- slider section -->\n");
      out.write("            \n");
      out.write("            <!-- new section -->\n");
      out.write("                <div class=\"row\" style=\"height: 100px; background-color: white;\">\n");
      out.write("                  ");
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
      out.write("            <li><a href=\"new_category.jsp\">post Advertisement</a></li>\n");
      out.write("            <li><a href=\"\">Contact Us</a></li>\n");
      out.write("            <li><a href=\"\">Feedback</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            <!-- main section -->\n");
      out.write("            <div class=\"row\" style=\"height: 600px\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                 ");

                  try { 
                      Database_Connection ob=new Database_Connection();
                      String sql="select * from category ";
                      ResultSet rs=ob.DQL(sql);
                      while (rs.next()){
                          
      out.write("\n");
      out.write("                          <div class=\"row\" style=\"height: 40px; margin-top: 2px; \n");
      out.write("                               background-color: black; color: white;\">\n");
      out.write("                              <div class=\"col-sm-12\">\n");
      out.write("                                  ");
      out.print(rs.getString("name"));
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                 ");

                      }
                  }catch(Exception ex){
                  }
                 
      out.write("   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\" style=\"margin-top: 10px;\">\n");
      out.write("                     <h4>Your oder is confirmed. Your product Detail is:</h4>\n");
      out.write("                     <table width=\"700px\" border=\"1px solid\" style=\"background-color: powderblue;\">\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <td>PID</td>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td>Image</td>\n");
      out.write("                        <td>Qty</td>\n");
      out.write("                        <td>Total</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    int total=0;
                    try
                    {
                        String orderid=session.getAttribute("orderid").toString();
                        String sql="select p.pid,p.name,p.offer,1 as qty,p.offer*1 as total"
                                + " from product  p, temp_order t where p.pid=t.pid and orderid='"
                                +orderid+"'";
                        Database_Connection ob=new Database_Connection();
                        ResultSet rs=ob.DQL(sql);
                        
                        while(rs.next())
                        {
                            total=total+Integer.parseInt(rs.getString(5));
                            
      out.write("\n");
      out.write("                             <tr>\n");
      out.write("                                 <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                <td>Image</td>\n");
      out.write("                                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }
                    }
                    catch(Exception ex)
                    {
                    }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"6\">Total</td> \n");
      out.write("                        <td>");
      out.print(total);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("                    <h4>We will delevered your product soon.</h4>\n");
      out.write("                    ");

                    session.setAttribute("orderid", null);
                    session.setAttribute("userid", null);
                    
                    
      out.write("\n");
      out.write("            \n");
      out.write("                 </div>        \n");
      out.write("            </div>\n");
      out.write("            <!-- footer section -->\n");
      out.write("            <div class=\"row\" style=\"height: 100px\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
