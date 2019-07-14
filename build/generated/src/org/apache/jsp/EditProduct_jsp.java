package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Database_Connection;
import java.sql.ResultSet;

public final class EditProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: mistyrose\">\n");
      out.write("    <center>\n");
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
      out.write("\n");
      out.write("        <h1>EDIT PRODUCT</h1>\n");
      out.write("        ");

            String pid = request.getParameter("pid");
            String catid = "";
            String name = "";
            String rate = "";
            String offer = "";
            String descp = "";
            if(request.getParameter("submit1")!=null)
            {
                //update
                try
                {
                    name=request.getParameter("name");
                    catid=request.getParameter("catid");
                    String sql="update product set name='"+name+"',catid='"+catid+"' where pid="+pid;
                    Database_Connection ob= new Database_Connection();
                    int re=ob.DML(sql);
                    if(re>0)
                    {
                        out.println("update success");
                    }
                    
                }
                catch(Exception ex){}          
            }
            else if(request.getParameter("submit2")!=null)
            {
                //delete
                try
                {
                 String sql="delete from product where pid="+pid;
                 Database_Connection ob= new Database_Connection();
                 int re=ob.DML(sql);
                 if(re>0)
                 {
                     out.println("Delete success");
                 }
                }
                catch(Exception ex){}
                        
            }
            else
            {
                try
                {
                    String sql= "select * from product where pid=" + pid;
                    Database_Connection ob=new Database_Connection();
                    ResultSet rs = ob.DQL(sql);
                    if (rs.next()) {
                        catid = rs.getString(2);
                        name = rs.getString(3);
                        rate = rs.getString(4);
                        offer = rs.getString(5);
                        descp = rs.getString(6);
                    }
                    
                }
                catch(Exception ex){}
            }
        
      out.write("\n");
      out.write("        <form name=\"frm\">\n");
      out.write("            <table width=\"700px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Category ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"catid\" value=\"");
      out.print(catid);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\" readonly=\"true\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\" value=\"");
      out.print(rate);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Offer Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"offerprice\" value=\"");
      out.print(offer);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>description</td>\n");
      out.write("                    <td><textarea name=\"descript\">");
      out.print(descp);
      out.write("</textarea></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit1\" value=\"Update\"/></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit2\" value=\"Delete\"/></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
