/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Elvis
 */
public class Asiento {
    //atributos
    private int nroAsiento;
    private char fila ;
    private String estado; 
    
    //metodos
    public Asiento(int nroAsiento, char fila, String estado){
        
    this.nroAsiento=nroAsiento;
    this.fila=fila;
    this.estado=estado;
    }
    
    //getters
    public int getNroAsiento(){
        return nroAsiento;
    }
    public char getFila(){
        return fila;
    }
    
    public String getEstado(){
        return estado;
    }
    
    //setter
    public void setNroAsiento(int nroAsiento){
        this.nroAsiento=nroAsiento;
    }
    public void setFila(char fila){
        this.fila=fila;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    

    public boolean reservarAsiento(){
    this.estado = "RESERVADO";
    return true;
    }
    
    public boolean cancelarAsiento(){
    this.estado = "DISPONIBLE";
    return false;
    }
    
    public boolean venderAsiento(){
    this.estado = "VENDIDO";
    return true;
    }
}
