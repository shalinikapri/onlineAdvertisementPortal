<%-- 
    Document   : all_product_list
    Created on : Apr 7, 2019, 8:29:26 AM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.Database_Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: mistyrose">
        <%@include file="menubar.jsp" %>
        <h1>All Product List!</h1>
        <form name="frm">
            <table width="900px" border="1px solid">
                <tr>
                    <td>Edit</td>
                    <td>Category ID</td>
                    <td>Product ID</td>
                    <td>Name</td>
                    <td>Price</td>
                    <td>Offer Price</td>
                    <td>Decriptions</td>
                    <td>Image</td>
                </tr>
                <%
                    Database_Connection ob = new Database_Connection();
                    String sql = "select * from product";
                    ResultSet rs = ob.DQL(sql);
                    while (rs.next()) {
                %>
                <tr>
                 <td>
                     <a href="EditProduct.jsp?pid=<%=rs.getString(1)%>">
                         Edit</a>
                </td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
                <td><img src="ShowImage.jsp?pid=<%=rs.getString(1)%>" width="60" height="60"/></td>
                </tr>
                <%
                    }
                %>
            </table>
        </form>

    </body>
</html>
