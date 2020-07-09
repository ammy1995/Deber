/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

/**
 *
 * @author ammy
 */
public class Categoria {
    
   private String nombre;
    private String reuniones;
    private String citas;
    private String tarea;
    
    public Categoria (){
       nombre=" ";
       reuniones= " ";
       citas= " ";
       tarea= " ";
    }
    
    
    
    public Categoria (String nombre, String reuniones,String citas,String tarea){
        this.nombre = nombre;
        this.reuniones=reuniones;
        this.citas= citas;
        this.tarea=tarea;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getReuniones(){
        return reuniones;
    }
    
    public String getCitas(){
        return citas;
    }
    
    public String getTarea(){
        return tarea;
    }
    
    public void setNombre(String nombre){
    
    }
    
    public void setReuniones(String reuniones){
        
    }
    
    public void setCitas(String citas){
        
    }
    
    public void setTarea(String tarea){
        
    }
}
