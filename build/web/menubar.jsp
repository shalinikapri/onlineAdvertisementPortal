<%-- 
    Document   : menubar
    Created on : Feb 19, 2019, 3:33:53 PM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body style="background-color: mistyrose">
        <ul id="nav">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Login.jsp">Login</a>
                <ul>
                <li><a href="register.jsp">Edit profile</a></li>
                <li><a href="all_category.jsp">Post ad</a></li>
                <li><a href="index.jsp">search product</a></li>
                <li><a href="Contact_Us.jsp">Manage ad</a></li>
                <li><a href="payment.jsp">Order item</a></li>
                
                
                </ul>
            </li>
             
            <li><a href="AboutUs.jsp">About Us</a></li>
            <li><a href="all_category.jsp">post Advertisement</a></li>
            <li><a href="Contact_Us.jsp">Contact Us</a></li>
        </ul>
    </body>
</html>
