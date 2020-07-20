/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

/**
 *Los datos del estudiante
 * @author ammy
 */
public class Estudiante {
    /**
     * Atributos
     */
    
    /**
     * Nombre del estudiante
     */
    private String nombre;
    /**
     * Apellido del estudiante
     */
    private String apellido;
    /**
     * Correo del estudiante
     */
    private String correo;
    /**
     * nivel de estudio del estudiante
     */
    private String nivelestudio;
    
    /**
     * Metodo Constructor sin estudiante
     */
    
    public Estudiante (){
       nombre=" ";
       apellido= " ";
       correo= " ";
       nivelestudio= " ";
    }
    
    /**
     * Metodo Constructor con parametros
     * @param nombre
     * @param apellido
     * @param correo
     * @param nivelestudio 
     */
    
    public Estudiante (String nombre, String apellido,String correo,String nivelestudio){
        this.nombre = nombre;
        this.apellido=apellido;
        this.correo= correo;
        this.nivelestudio=nivelestudio;
    }
    /**
     * Metodo get Nombre
     * @return Nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo get Apellido
     * @return Apellido
     */
    public String getApellido(){
        return apellido;
    }
    /**
     * Metodo get Correo
     * @return Correo
     */
    public String getCorreo(){
        return correo;
    }
    
    /**
     * Metodo get nivel estudio 
     * @return Nivel Estudio 
     */
    public String getNivelEstudio(){
        return nivelestudio;
    }
    /**
     * Metodo set nombre
     * @param nombre 
     */
    public void setNombre(String nombre){
     this.nombre=nombre;
    }
    /**
     * Metodo set apellido
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    /**
     * Metodo Correo
     * @param correo 
     */
    public void setCorreo(String correo){
        this.correo=correo;
    }
    /**
     * Metodo set Nivel Estudio
     * @param nivelestudio 
     */
    public void setNivelEstudio(String nivelestudio){
        this.nivelestudio=nivelestudio;
    }
}
