/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puskesmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Koneksi {
    private static Connection puskesmas;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/puskesmas";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            puskesmas=DriverManager.getConnection(url, user, pass);
        }catch (SQLException e) {
            System.out.println("koneksi gagal "+e.getMessage());//perintah menampilkan error pada koneksi
        }
        return puskesmas;
    }
}
