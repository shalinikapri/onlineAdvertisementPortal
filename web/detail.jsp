<%-- 
    Document   : detail
    Created on : Apr 30, 2019, 5:39:50 PM
    Author     : gallery
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="com.Database_Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ad_portal</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    
  </head>
  <body style="background-color: mistyrose">
    <div class="container">
     
     
         <!-- new section -->
                <div class="row" style="height: 60px; background-color: blue;">
                   <%@include file="menubar.jsp" %> 
                </div>
      <!--Main Section-->
      <div class="row" style="height:600px;">
        <div class="col-sm-2">
          <%
            try {
              Database_Connection ob = new Database_Connection();
              String sql = "select * from category";
              ResultSet rs = ob.DQL(sql);
              while (rs.next()) {
                  %>
                  <div class="row" style="height: 40px; margin-top: 2px;
                       background-color: orange; color: white;">
                    <div class="col-sm-12">
                      <%=rs.getString("name")%>
                    </div>
                  </div>
                  <%
              }
            } catch (Exception ex) {
            }
          %>
        </div>
        <div class="col-sm-10">
          <div class="row" style="background-color: lightgreen">
            <div class="col-lg-12">
              <%
                if((request.getParameter("addtocart")!=null))
                {
                  if(request.getParameter("addtocart").equals("yes"))
                  {
                  out.println("<h1>Add to cart successfully</h1>");
                  }
                }
              %>
            </div>            
          </div>
            
          <%
          try
          {
             Database_Connection ob = new Database_Connection();
             String pid=request.getParameter("pid");
              String sql = "select * from product where pid='"+pid+"'";
              ResultSet rs = ob.DQL(sql);
              if (rs.next()) {              
          %> 
          
          <div class="row" style="margin-top: 50px">
            <div class="col-sm-6">
              <img  src="ShowImage.jsp?pid=<%=rs.getString(1)%>" width="300" height="350" />
            </div>  
            <div class="col-sm-6">
            <br>  <b> Name:<%=rs.getString(3)%></b>              
            <br>  <b>Price:Rs.<%=rs.getString(5)%></b>
            <br>  <b>Qty:</b>
              <input type="text"/>
              <br>
              <a href="addtocart.jsp?pid=<%=rs.getString(1)%>">
              <button>Add to Cart</button>
              </a>
            </div>  
          </div>
          <div class="row" style="margin-top: 30px">
            <div class="col-sm-12">
              <b>  Product Detail</b>
              <br><%=rs.getString(6)%>
            </div>         
          </div>          
          <%            
              }
          }
          catch(Exception ex){}
          %>
        </div>
      </div>
      <!--Footer Section-->
      <div class="row" style="height:100px;">

      </div>
    </div>
  </body>
</html>
