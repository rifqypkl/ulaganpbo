/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author baru
 */
public class koneksi {
    
    private static Connection koneksi;
    public static Connection getkoneksi()
    {
        if(koneksi== null)
        {
            try {
                String url="jdbc:mysql://localhost/datadiri";
                String username= "root";
                String password= "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return koneksi;
    }
    
}