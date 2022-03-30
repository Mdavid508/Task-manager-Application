
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseph
 */
public class Db {
  private String tableName;
  private Connection conn = null;
  public Db(String tableName){
    this.tableName = tableName;
    
      try {         
          this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/taskmanager","root", "");

      } catch (SQLException ex) {
          Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(new JFrame(), ex);
      }
  }
  
 public Connection getConnection(){
     return this.conn;
 }
 
 public static void main(String[] args){
     Db db = new Db("users");
     db.getConnection();
 }
}
