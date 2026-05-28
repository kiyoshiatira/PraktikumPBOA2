/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author kiyos
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlutility {
    private static Connection koneksi; // [cite: 140]

    public static Connection getConnection() { // [cite: 141]
        if (koneksi == null) { // [cite: 142]
            try {
                // Load Driver MySQL [cite: 144]
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                
                // Konfigurasi URL, User, dan Password database [cite: 146, 148, 149]
                String url = "jdbc:mysql://localhost:3308/jdbc_mhs"; 
                String user = "root"; 
                String password = ""; 
                
                koneksi = DriverManager.getConnection(url, user, password); // [cite: 150]
                
                if (koneksi != null) { // [cite: 151]
                    System.out.println("Koneksi berhasil"); // [cite: 152]
                }
            } catch (ClassNotFoundException cne) { // [cite: 153]
                System.out.println("Gagal load driver: " + cne.getMessage()); // [cite: 154, 155]
            } catch (SQLException sqle) { // [cite: 156]
                System.out.println("Gagal Koneksi: " + sqle.getMessage()); 
            }
        }
        return koneksi; // [cite: 157]
    }
}
