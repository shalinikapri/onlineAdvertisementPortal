/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author shalini
 */
@WebServlet(urlPatterns = {"/SaveProduct"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, 
        maxFileSize = 1024 * 1024 * 50, 
        maxRequestSize = 1024 * 1024 * 100)
public class SaveProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String catid = request.getParameter("catid");
            String pid = request.getParameter("pid");
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            String offer = request.getParameter("offerprice");
            String dis = request.getParameter("descript");
            
            
            InputStream inputStream = null;
            Part filePart = request.getPart("image");
            if (filePart != null) {
                inputStream = filePart.getInputStream();
            }            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/add_portal",  "root", "1234");
       String sql = "insert into product(pid,catid,name,price,offer,dis,image) "
                    + " values(?,?,?,?,?,?,?) ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(pid));
            statement.setInt(2, Integer.parseInt(catid));
            statement.setString(3, name);
            statement.setInt(4, Integer.parseInt(price));
            statement.setInt(5, Integer.parseInt(offer));
             statement.setString(6, dis);
             statement.setBlob(7, inputStream); 
                
                int row = statement.executeUpdate();
                if (row >= 0) {
                    out.println("save successfully");
                }
            
        } catch (Exception ex) {
            out.println("Error "+ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
