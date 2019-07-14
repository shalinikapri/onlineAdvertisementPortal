<%-- 
    Document   : cartdetail
    Created on : Jul 14, 2018, 8:30:03 PM
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
    <body style="background-color: mistyrose">
        <div class="container">
           
                <!-- new section -->
                <div class="row" style="height: 60px; background-color: blue;">
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
                               background-color: orange; color: white;">
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
                    <table width="700px" border="1px solid" style="background-color: palegreen;">
                    <tr>
                        <td></td>
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
                                 <td>
                                    
                                     <input type="submit" name="submit" value="Remove"/>
                                     
                                     </td>
                                <td><%=rs.getString(1)%></td>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td><img src="ShowImage.jsp?pid=<%=rs.getString(1)%>"
                                style="height: 50px; width: 40px;"/></td>
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
                    <tr>
                        <td colspan="4"><a href="index.jsp">Continue to Shop</a></td> 
                        <td colspan="3"><a href="Login.jsp">Check Out</a></td>
                    </tr>
                </table>
                </div>        
            </div>
            <!-- footer section -->
            <div class="row" style="height: 100px">
                
            </div>
        </div>
    </body>
</html>


