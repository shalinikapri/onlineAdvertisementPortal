<%-- 
    Document   : remove
    Created on : Apr 30, 2019, 5:54:25 PM
    Author     : gallery
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.Database_Connection"%>
<%
if(request.getParameter("id")!=null)
{
    try
    {
     String id=request.getParameter("id");
     Database_Connection ob=new Database_Connection();
     String sql="delete from temp_order where id='"+id+"'";
     int re=ob.DML(sql);
    }
    catch(Exception ex) {}
}
response.sendRedirect("cartdetail.jsp");
%>

