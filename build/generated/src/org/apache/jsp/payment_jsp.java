package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"Admin/bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
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
      out.write("                <li><a href=\"index.jsp\">search product</a></li>\n");
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
      out.write("\n");
      out.write("            <center>\n");
      out.write("                <form name=\"frm\">\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> select Bank </b><select name=\"bank\" style=\"background-color: powderblue;\">\n");
      out.write("                                <option>--Select Bank--</option>\n");
      out.write("                                <option>Andhra bank</option>\n");
      out.write("                                <option>Central bank</option>\n");
      out.write("                                <option>Panjab National Bank</option>\n");
      out.write("                                <option>National Bank</option>\n");
      out.write("                                <option>State Bank</option>\n");
      out.write("                                <option>Other Bank</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> Select card</b>\n");
      out.write("                            <select name=\"card\" style=\"background-color: powderblue;\">\n");
      out.write("                                <option>--Select cart--</option>\n");
      out.write("                                <option>Debit card</option>\n");
      out.write("                                <option>Credit Card</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> Card Number </b>\n");
      out.write("                            <input type=\"text\" style=\"background-color: powderblue;\" />\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> Card Holder </b>\n");
      out.write("                            <input type=\"text\" style=\"background-color: powderblue;\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> Expiry Date : </b>\n");
      out.write("                              Month <input type=\"text\" style=\"background-color: powderblue;\"/>Year <input type=\"text\"\n");
      out.write("                              style=\"background-color: powderblue;\" />\n");
      out.write("                              \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> CVV </b>\n");
      out.write("                            <input type=\"text\" style=\"background-color: powderblue;\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <b> PIN </b>\n");
      out.write("                            <input type=\"text\" style=\"background-color: powderblue;\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"success.jsp\">\n");
      out.write("                        <div class=\"row\" style=\"height: 20px\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <b>Pay</b>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
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
