<%-- 
    Document   : update_details
    Created on : Feb 19, 2019, 3:54:54 PM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String msg = "";
    String msge = "";
    if (request.getParameter("submit") != null) {
        int catid = Integer.parseInt(request.getParameter("txtcatid"));
        String name = request.getParameter("txtcatname");
        String descript = request.getParameter("txtcatdes");
        String sql = "insert into category (catid,name,descript) values("
                + catid + ",'" + name + "','" + descript + "')";
        out.println(sql);
        com.Database_Connection ob = new com.Database_Connection();
        int re = ob.DML(sql);
        if (re > 0) {
            msg = "Save successfully";
        } else {
            msge = "Not Save successfully";
        }
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="menubar.jsp" %>
        <form name="frm" >
            <span style="color:green"> <%=msg%></span> 
            <span style="color:red"> <%=msge%></span>    
            <table>
                <caption>Update Details</caption>
                
                <tr>
                    <td>Logo</td>
                    <td><input type="file" name="image"/></td>
                </tr>
                <tr>
                    <td>Name of the user</td>
                    <td><input type="text" name="txtcatname"/></td>
                </tr>
                <tr>
                    <td>WebSite URL</td>
                    <td><input type="text" name="txtcatdes"/></td>
                </tr>
                <tr>
                    <td>Store Detail</td>
                    <td><input type="text" name="txtcatdes"/></td>
                </tr>
                <tr>
                    <td>Category</td>
                    <td><input type="text" name="txtcatdes"/></td>
                </tr>
                <tr>
                    <td>Phone number</td>
                    <td><input type="text" name="txtcatdes"/></td>
                </tr>

                <tr>
                    <td><input type="reset" value="Reset"/></td>
                    <td><input type="submit" name="submit" value="Post"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
