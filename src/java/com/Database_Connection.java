/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author shalini
 */
public class Database_Connection {
   public int DML(String sql) {
        int re = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection
        ("jdbc:mysql://localhost:8084/add_portal", "root", "1234");
            Statement st = cn.createStatement();
            re = st.executeUpdate(sql);
            cn.close();
        } catch (Exception ex) {
            re = 0;
        }
        return re;
    }
    //this fun use to select
    public ResultSet DQL(String sql) {
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/add_portal", "root", "1234");
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception ex) {
            rs = null;
        }
        return rs;
    }  
}
