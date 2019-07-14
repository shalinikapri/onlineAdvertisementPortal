
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
        <title>New Category</title>
    </head>
    <body>
        <%@include file="menubar.jsp" %>
        <form name="frm" >
            <span style="color:green"> <%=msg%></span> 
            <span style="color:red"> <%=msge%></span>    
            <table>
                <caption>New Category</caption>
                
                <tr>
                    <td>Category ID</td>
                    <td><input type="text" name="txtcatid"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="txtcatname"/></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><input type="text" name="txtcatdes"/></td>
                </tr>

                <tr>
                    <td><input type="reset" value="Reset"/></td>
                    <td><input type="submit" name="submit" value="Save"/></td>
                </tr>
            </table>
        </form>

    </body>
</html>
