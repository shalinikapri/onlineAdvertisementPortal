<%-- 
    Document   : EditProduct
    Created on : Apr 10, 2019, 7:55:08 AM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Database_Connection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: mistyrose">
    <center>
        <%@include file="menubar.jsp"%>
        <h1>EDIT PRODUCT</h1>
        <%
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
        %>
        <form name="frm">
            <table width="700px">
                <tr>
                    <td>Category ID</td>
                    <td><input type="text" name="catid" value="<%=catid%>"/></td>
                </tr>
                <tr>
                    <td>Product ID</td>
                    <td><input type="text" name="pid" value="<%=pid%>" readonly="true"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="<%=name%>"/></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" name="price" value="<%=rate%>"/></td>
                </tr>
                <tr>
                    <td>Offer Price</td>
                    <td><input type="text" name="offerprice" value="<%=offer%>"/></td>
                </tr>
                <tr>
                    <td>description</td>
                    <td><textarea name="descript"><%=descp%></textarea></td>
                </tr>

                <tr>
                    <td><input type="submit" name="submit1" value="Update"/></td>
                    <td><input type="submit" name="submit2" value="Delete"/></td>

                </tr>

            </table>
        </form>
    </center>
    </body>
</html>
