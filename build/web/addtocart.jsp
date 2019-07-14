<%@page import="com.Database_Connection"%>
<%
  String pid = request.getParameter("pid");
  try {
    String orderid = session.getAttribute("orderid").toString();
    Database_Connection ob = new Database_Connection();
    String query = "insert into temp_order (pid,orderid) values('"
            + pid + "','" + orderid + "')";
    int re = ob.DML(query);
    if (re > 0) {
      response.sendRedirect("detail.jsp?pid=" + pid + "&addtocart=yes");
    }
  } catch (Exception ex) {
    response.sendRedirect("detail.jsp?pid=" + pid + "&addtocart=no");
  }


%>
