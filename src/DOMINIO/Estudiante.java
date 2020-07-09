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
public class Estudiante {
    //Atributos
    
    private String nombre;
    private String apellido;
    private String correo;
    private String nivelestudio;
    
    public Estudiante (){
       nombre=" ";
       apellido= " ";
       correo= " ";
       nivelestudio= " ";
    }
    
    
    
    public Estudiante (String nombre, String apellido,String correo,String nivelestudio){
        this.nombre = nombre;
        this.apellido=apellido;
        this.correo= correo;
        this.nivelestudio=nivelestudio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getNivelEstudio(){
        return nivelestudio;
    }
    
    public void setNombre(String nombre){
    
    }
    
    public void setApellido(String apellido){
        
    }
    
    public void setCorreo(String correo){
        
    }
    
    public void setNivelEstudio(String nivelestudio){
        
    }
}
