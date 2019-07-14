<%-- 
    Document   : index
    Created on : Apr 30, 2019, 5:44:28 PM
    Author     : gallery
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.Database_Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ad_Portal</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    
  </head>
  <body style="background-color: mistyrose">
    <%
            String orderid="";
            try
            {
            orderid=session.getAttribute("orderid").toString();
            }catch(Exception ex){}
            if(orderid=="" || orderid==null)
            {
                java.util.Date dt=new java.util.Date();
                int y=dt.getYear()+1900;
                int mo=dt.getMonth()+1;
                int d=dt.getDate();
                int h=dt.getHours();
                int mi=dt.getMinutes();
                int s=dt.getSeconds();
                orderid=""+(y+mo+d+h+mi+s);
                session.setAttribute("orderid", orderid);
            }
        %>
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
                  <div class="row" style="height:50px; margin-top: 2px;
                       background-color: orange; color: white;">
                    <div class="col-sm-10">
                        <a href='index.jsp?catid=<%=rs.getString("catid")%>'>
                            <%=rs.getString("name")%><br>
                            <%
                            
                            %>
                        </a>
                    </div>
                  </div>
            <%
              }
            } catch (Exception ex) {
            }
            %>
        </div>
        <div class="col-sm-10">
         <div class="row">
          <%
          try
          {
            Database_Connection ob = new Database_Connection();
              String sql = "select * from product";
              if(request.getParameter("catid")!=null)
              {
                  sql= "select * from product where catid='"+request.getParameter("catid")+"'";
              }
              ResultSet rs = ob.DQL(sql);
              while (rs.next()) {
                %>
                <div class="col-sm-1"></div>
                <div class="col-sm-3">
                  <a href="detail.jsp?pid=<%=rs.getString(1)%>">
                  <div>
                    <%=rs.getString(3)%>
                  </div>
                  <img src="ShowImage.jsp?pid=<%=rs.getString(1)%>"
                       style="height: 250px; width: 200px;"/>
                  <div>
                    Price:Rs. <%=rs.getString(5)%>
                  </div>
                  <button class="btn-danger">Detail</button>
                  </a>
                </div>
          <%
              }
          }catch(Exception ex){}
          
            %> 
            </div> 
        </div>
      </div>
      <!--Footer Section-->
      <div class="row" style="height:100px;">

      </div>
    </div>
  </body>
</html>

