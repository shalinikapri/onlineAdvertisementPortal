<%-- 
    Document   : register
    Created on : Feb 14, 2019, 5:46:59 PM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Database_Connection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Admin/css/style.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body style="background-color: mistyrose">
        <%@include file="menubar.jsp" %>
        <!--main section -->
       
    <center>
        <form name="frm">
            <table>
                <tr><td><b>UserID</b></td><td><input type="text" name="txtuserid" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Password</b></td><td><input type="password" name="txtpass" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Confirm Password</b></td><td><input type="password" name="txtpass" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Name</b></td><td><input type="text" name="txtname" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Mobile</b></td><td><input type="text" name="txtmobile" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Email</b></td><td><input type="text" name="txtemail" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Address</b></td><td><input type="text" name="txtadd" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>City</b></td><td><input type="text" name="txtcity" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Pin</b></td><td><input type="text" name="txtpin" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>State</b></td><td><input type="text" name="txtstate" style="background-color: powderblue;"/></td></tr>
                <tr><td><b>Country</b></td><td><input type="text" name="txtcountry" style="background-color: powderblue;"/></td></tr>
                <tr><td></td><td><input type="submit" name="submit" value="Save" style="background-color: powderblue;"/></td></tr>
                <br>
                <a href="Login.jsp"><b><---Back</b></a>
                <br><br>
            </table>
        </form>
    </center>
    </body>
</html>
