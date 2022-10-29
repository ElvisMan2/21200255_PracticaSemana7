/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Elvis
 */
public class Pais {
    private String codigo;
    private String nombre;
    
    public Pais(String codigo, String nombre){
    this.codigo=codigo;
    this.nombre=nombre;  
    }
   
    public void setcodigo(String codigo){
    this.codigo=codigo;
    }
    public void setnombre(String nombre){
    this.nombre=nombre;  
    }
    
    public String getcodigo(){
    return codigo;
    }
    public String getnombre(){
    return nombre;  
    }
    
    
    
}
