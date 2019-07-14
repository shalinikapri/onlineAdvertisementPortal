<%-- 
    Document   : new_product
    Created on : Apr 7, 2019, 7:54:18 AM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menubar.jsp" %>
        <h1>New Product</h1>
        <form name="frm"  action="SaveProduct" method="post" 
              enctype="multipart/form-data">
            <table width="700px">
                <tr>
                    <td>Category ID</td>
                    <td><input type="text" name="catid"/></td>
                </tr>
                 <tr>
                    <td>Product ID</td>
                    <td><input type="text" name="pid"/></td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                 <tr>
                    <td>Price</td>
                    <td><input type="text" name="price"/></td>
                </tr>
                 <tr>
                    <td>Offer Price</td>
                    <td><input type="text" name="offerprice"/></td>
                </tr>
                 <tr>
                    <td>description</td>
                    <td><textarea name="descript"></textarea></td>
                </tr>
                 <tr>
                    <td>Image</td>
                    <td><input type="file" name="image"/></td>
                </tr>
                 <tr>
                     <td colspan="2"><input type="submit" name="submit" value="Save"/></td>
                    
                </tr>
            </table>
        </form>
    </body>
</html>
