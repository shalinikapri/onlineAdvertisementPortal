<%-- 
    Document   : Login
    Created on : Feb 14, 2019, 5:30:18 PM
    Author     : gallery
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Database_Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <title>ADD PORTAL</title>
        <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        
        
    </head>
    <body style="background-color: mistyrose">
         
        <div class="container">
            <!-- main section-->
            <div class="row" style="height: 600px">
                <div class="col-sm-1" style="margin-top: 10px;">
                </div>
                <div class="col-sm-11" style="margin-top: 10px;">
                    <center>
                        <h1>Login</h1>
                        <b>Userid</b> <input type="text" name="t1" style="background-color: powderblue;"/>
                        <br><br>
                        <b>password</b> <input type="password" name="t2" style="background-color: powderblue;"/>
                        <br><br>
                        <a href="payment.jsp">
                            <input type="submit" value="Login as buyer" style="background-color: powderblue;"/>
                        </a>
                         <a href="all_category.jsp">
                            <input type="submit" value="Login as seller" style="background-color: powderblue;"/>
                        </a>
                        <br><br>
                        <a href="register.jsp"><b>Register New User</b></a>
                    </center>
         
       
                </div>
            </div>
       </div>
    
    </body>
</html>
