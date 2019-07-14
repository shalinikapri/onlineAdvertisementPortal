<%-- 
    Document   : success
    Created on : Apr 30, 2019, 4:22:15 PM
    Author     : gallery
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Database_Connection"%>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Ad_portal</title>
        <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div class="container">
            <!-- top section -->
             <!-- slider section -->
            
            <!-- new section -->
                <div class="row" style="height: 100px; background-color: white;">
                  <%@include file="menubar.jsp" %>  
                </div>
               
            <!-- main section -->
            <div class="row" style="height: 600px">
                <div class="col-sm-2">
                 <%
                  try { 
                      Database_Connection ob=new Database_Connection();
                      String sql="select * from category ";
                      ResultSet rs=ob.DQL(sql);
                      while (rs.next()){
                          %>
                          <div class="row" style="height: 40px; margin-top: 2px; 
                               background-color: black; color: white;">
                              <div class="col-sm-12">
                                  <%=rs.getString("name")%>
                              </div>
                          </div>
                 <%
                      }
                  }catch(Exception ex){
                  }
                 %>   
                </div>
                <div class="col-sm-10" style="margin-top: 10px;">
                     <h4>Your oder is confirmed. Your product Detail is:</h4>
                     <table width="700px" border="1px solid" style="background-color: powderblue;">
                    <tr>
                        
                        <td>PID</td>
                        <td>Name</td>
                        <td>Price</td>
                        <td>Image</td>
                        <td>Qty</td>
                        <td>Total</td>
                    </tr>
                    <%
                    int total=0;
                    try
                    {
                        String orderid=session.getAttribute("orderid").toString();
                        String sql="select p.pid,p.name,p.offer,1 as qty,p.offer*1 as total"
                                + " from product  p, temp_order t where p.pid=t.pid and orderid='"
                                +orderid+"'";
                        Database_Connection ob=new Database_Connection();
                        ResultSet rs=ob.DQL(sql);
                        
                        while(rs.next())
                        {
                            total=total+Integer.parseInt(rs.getString(5));
                            %>
                             <tr>
                                 <td><%=rs.getString(1)%></td>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td>Image</td>
                                <td><%=rs.getString(4)%></td>
                                <td><%=rs.getString(5)%></td>
                            </tr>
                            <%
                        }
                    }
                    catch(Exception ex)
                    {
                    }
                    %>
                    <tr>
                        <td colspan="6">Total</td> 
                        <td><%=total%></td>
                    </tr>
                   
                </table>
                    <h4>We will delevered your product soon.</h4>
                    <%
                    session.setAttribute("orderid", null);
                    session.setAttribute("userid", null);
                    
                    %>
            
                 </div>        
            </div>
            <!-- footer section -->
            <div class="row" style="height: 100px">
                
            </div>
        </div>
    </body>
</html>



