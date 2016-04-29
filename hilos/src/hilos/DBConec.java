/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mariimorales
 */
class DBConec {
    static String bd = "rentores";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost/"+bd;
    
    Connection conn = null;

    public DBConec() {
    try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         
//obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
 
         if (conn != null){
            JOptionPane.showMessageDialog(null, "Conexión con éxito a la base de datos" + bd);
         }
      }
      catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
      } catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
      } catch(Exception e){
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
      }
    }
    
    // Método que devuelve la referencia a la conexión
    public Connection getConnection() {
        return conn;
    }
    
    public void desconectar() {
        conn = null;
    }
    
    
}
