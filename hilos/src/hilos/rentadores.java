/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author mariimorales
 */
public class rentadores {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    
    public rentadores() {
        
    }

    public rentadores(int id, String nombre,String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion= direccion;
       
    }
    
    
    // Parámetros Set
    public void setId(int strid) {
        this.id= strid;
    }
    
    public void setNombre(String strNombre) {
        this.nombre = strNombre;
    }
    
    public void settelefono (String strtelefono) {
        this.telefono = strtelefono;
    }
    
    public void setDireccion(String strdireccion) {
        this.direccion = strdireccion;
    }
    
    
    
    // Parámetros Get
    
    public int getid() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String gettelefono() {
        return telefono;
    }
    
    public String getdireccion() {
        return direccion;
    }
   
    String[] getRow() {
        String [] row = new String[5];
        row[0] = ""+id;
        row[1] = nombre;
        row[2] = telefono;
        row[3] = direccion;
       
        
        return row;
    }
    
}
