<%-- 
    Document   : ShowImage
    Created on : Apr 7, 2019, 8:45:21 AM
    Author     : gallery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="com.Database_Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: mistyrose">
         <%
            try
            {
               // String pid="1";
                String pid=request.getParameter("pid");
                Database_Connection ob=new Database_Connection();
                String sql="select image from product where pid="+pid;
                ResultSet rs=ob.DQL(sql);
                if(rs.next())
                {
             // clear the response header information.
                    response.reset();
            // check the file type and set the header contentType accordingly.
                    Blob blb = rs.getBlob(1);
                    byte[] bdata = blb.getBytes(1, (int) blb.length());
            // get the response Output stream object to write the content of the file into header
                    OutputStream output = response.getOutputStream();
                    output.write(bdata);
                    output.close();
                    // close the obejct of ResultSet
                    rs.close();      
                }
                
            }
            catch(Exception ex)
            {
                out.println("Error "+ex);
            }
            %>
    </body>
</html>
