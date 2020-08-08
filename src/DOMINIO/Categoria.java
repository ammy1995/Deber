package DOMINIO;


import java.util.Scanner;

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
     * @param nombre
     */
    public Categoria(String nombre){
        this.nombre =" ";
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

    }

    /**
     * Metodo set reuniones
     * @param reuniones
     */
    public void setReuniones(String reuniones){

    }
    /**
     * Metodo set citas
     * @param citas
     */
    public void setCitas(String citas){

    }

    /**
     * Metodo set tarea
     * @param tarea
     */
    public void setTarea(String tarea){

    }
    public String toString(){
        String s="";
        s+="Nombre:"+nombre +"\n";
        s+="Reuniones:"+reuniones +"\n";
        s+="Citas:"+citas+"\n";
        s+="Tarea:"+tarea+"\n";
        return s;
    }

}
