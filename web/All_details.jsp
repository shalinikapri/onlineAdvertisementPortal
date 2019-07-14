<%-- 
    Document   : All_details
    Created on : Mar 29, 2019, 7:31:10 AM
    Author     : gallery
--%>
<%@page import="java.sql.*"%>
<%@page import="com.Database_Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: mistyrose">
        
        <h1>All Details</h1>
        <table width="700px" border="1px solid">
            <tr><td></td><td>Category ID</td><td>Name</td><td>Description</td></tr>
        
        <%
            Database_Connection ob=new Database_Connection();
            String sql="select * from category";
            ResultSet rs=ob.DQL(sql);
            while(rs.next())
            {
                %>
                <tr>
                    <td><a href="update_details.jsp">Add New Details</a></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                </tr>
                <%
            }
            %>
        </table>
    </body>
</html>
