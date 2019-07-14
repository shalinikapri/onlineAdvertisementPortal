package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>About Us</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            h1 {color:purple;}\n");
      out.write("            div{\n");
      out.write("                margin-top: 80px;\n");
      out.write("                margin-bottom: 100px;\n");
      out.write("                margin-right: 150px;\n");
      out.write("                margin-left: 150px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: paleturquoise\">\n");
      out.write("    <center>\n");
      out.write("        <h1>About Us</h1>\n");
      out.write("    </center>\n");
      out.write("    <center>\n");
      out.write("        <img src=\"Image/kb1.jpg\" alt=\"\" style=\"height: 200px; width: 1000px\"/>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("          \n");
      out.write("    <div>\n");
      out.write("        <h4>\n");
      out.write("        Hello and welcome to our website.\n");
      out.write("        The place to find the best products for every last and occasion.\n");
      out.write("        We throughly check the quality of our goods, working only with reliable supplier.\n");
      out.write("        So that you receive the best quality product.\n");
      out.write("        You can also sell your goods at a reasonable and profitable price with our website.\n");
      out.write("        Our site provides best features for users to buy and sell their products.\n");
      out.write("        We also help in producing a platform where they can put their product to sell on a wide level with different customers.\n");
      out.write("        We believe in high quality and exceptional customer service but most importantly shopping in a right not a luxury.\n");
      out.write("        So we store to strive the best product at the most affordable prices and shift then to our customer regardless of where they our located.\n");
      out.write("        We know exactly which direction to take where suppling your with high quality yet budget friendly products.\n");
      out.write("        Lastly the interest of our customer and users always the top priority to us.\n");
      out.write("        Hope you enjoy our products and satisfied with putting your products on a big pedestal.\n");
      out.write("        </h4>\n");
      out.write("    </div>      \n");
      out.write("        \n");
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
