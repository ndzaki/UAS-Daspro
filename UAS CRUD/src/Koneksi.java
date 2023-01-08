
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Koneksi {
private Connection connect;
    
    private String driverName = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/db_biodata";
    private String username = "root";
    private String password = "";
   
    public Connection getKoneksi(){
        if(connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class driver ditemukan");
                
                connect = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
            }
            return connect;
    }
   
}