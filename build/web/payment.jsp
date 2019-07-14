<%-- 
    Document   : payment
    Created on : Apr 18, 2019, 3:19:50 PM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Admin/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div class="container">
            <%@include file="menubar.jsp"%>
            <center>
                <form name="frm">
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> select Bank </b><select name="bank" style="background-color: powderblue;">
                                <option>--Select Bank--</option>
                                <option>Andhra bank</option>
                                <option>Central bank</option>
                                <option>Panjab National Bank</option>
                                <option>National Bank</option>
                                <option>State Bank</option>
                                <option>Other Bank</option>
                            </select>
                        </div>
                        <div class="col-sm-2">
                            
                        </div>
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> Select card</b>
                            <select name="card" style="background-color: powderblue;">
                                <option>--Select cart--</option>
                                <option>Debit card</option>
                                <option>Credit Card</option>
                                
                            </select>
                        </div>
                        <div class="col-sm-2"></div>
                        
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> Card Number </b>
                            <input type="text" style="background-color: powderblue;" />
                            
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> Card Holder </b>
                            <input type="text" style="background-color: powderblue;" />
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> Expiry Date : </b>
                              Month <input type="text" style="background-color: powderblue;"/>Year <input type="text"
                              style="background-color: powderblue;" />
                              
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> CVV </b>
                            <input type="text" style="background-color: powderblue;" />
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                    <br>
                    <div class="row" style="height: 20px">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <b> PIN </b>
                            <input type="text" style="background-color: powderblue;" />
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                    <a href="success.jsp">
                        <div class="row" style="height: 20px">
                            <div class="col-sm-12">
                                <b>Pay</b>
                            </div>
                        </div>
                    </a>
                </form>
            </center>
        </div>
    </body>
</html>
