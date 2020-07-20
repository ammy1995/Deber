/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

/**
 * datos de la categoria
 * @author ammy
 */
public class Categoria {
    /**
     * Atributos
     */
    
    /**
     * nombre de la categoria
     */
   private String nombre;
   /**
    * reunion una categoria
    */
    private String reuniones;
    /**
     * citas una categoria
     */
    private String citas;
    /**
     * Tarea una categoria 
     */
    private String tarea;
    
    /**
     * Metodo Constructor sin parametros
     */
    public Categoria (){
       nombre=" ";
       reuniones= " ";
       citas= " ";
       tarea= " ";
    }
    
    /**
     * Metodo Constructor con parametros
     * @param nombre
     * @param reuniones
     * @param citas
     * @param tarea 
     */
    
    public Categoria (String nombre, String reuniones,String citas,String tarea){
        this.nombre = nombre;
        this.reuniones=reuniones;
        this.citas= citas;
        this.tarea=tarea;
    }
    /**
     * Metodo get Nombre
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo get reuniones
     * @return reuniones
     */
    public String getReuniones(){
        return reuniones;
    }
    /**
     * Metodo get citas
     * @return citas
     */
    public String getCitas(){
        return citas;
    }
    
    /**
     * Metodo get tarea
     * @return tarea
     */
    public String getTarea(){
        return tarea;
    }
    
    /**
     * Metodo set nombre
     * @param nombre 
     */
    public void setNombre(String nombre){
       this.nombre=nombre;
    }
    
    /**
     * Metodo set reuniones
     * @param reuniones 
     */
    public void setReuniones(String reuniones){
        this.reuniones=reuniones;
    }
    /**
     * Metodo set citas
     * @param citas 
     */
    public void setCitas(String citas){
        this.citas=citas;
    }
    
    /**
     * Metodo set tarea
     * @param tarea 
     */
    public void setTarea(String tarea){
        this.tarea=tarea;
    }
}
