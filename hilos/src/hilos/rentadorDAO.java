/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mariimorales
 */
public class rentadorDAO {
     public void agregarRentador(rentadores ren) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO alumnos VALUES('" + ren.getid() + "', '" +
                   ren.getNombre() + "', '" + ren.gettelefono() + "', '" + ren.getdireccion() + "', " + ")";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado el rentador");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la persona " + e);
        }
    }
    
    public ArrayList<rentadores> obtenrentadores() {
        ArrayList <rentadores> arrrentadores = new ArrayList<rentadores>();
        DBConec conn = new DBConec();
        String sql = "SELECT * FROM alumnos";
        
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                rentadores al = new rentadores(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("direccion")
                  
                );
                arrrentadores.add(al);
            }
            rs.close();
            st.close();
            conn.desconectar();
            
        } catch(Exception e) {
            
        }
        return arrrentadores;
    }
    
}
