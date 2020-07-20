/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
/**
 * Datos de la notificacion 
 * @author ammy
 */
public class Notificación {
    /**
     * Atributos
     */
    
    /**
     * id de la notificacion
     */
    private int idnotificacion;
    /**
     * fecha de la notificacion
     */
    private Date fecha;
    /**
     * hora de la notificacion
     */
    private LocalDateTime hora;
    /**
     * descripcion de la notificacion
     */
    private String descripcion;
    
    /**
     * Metodo Constructor sin parametros
     */
    public Notificación (){
     idnotificacion= 0;
     LocalDate fecha1 = LocalDate.of(2018,10,30);
      LocalDateTime hora1 = LocalDateTime.now();
     descripcion= " ";
       
    }
    
    /**
     * Metodo Constructor con parametro
     * @param id
     * @param fecha
     * @param hora
     * @param descripcion 
     */
    
    public Notificación (int id, Date fecha,LocalDateTime hora,String descripcion){
        this.idnotificacion = id;
        this.fecha=fecha;
        this.hora= hora;
        this.descripcion=descripcion;
    }
    
    /**
     * Metodo get id Notificacion
     * @return idnotificacion
     */
    public int getIdNotificacion(){
        return idnotificacion;
    }
    
    /**
     * Metodo get fecha
     * @return fecha
     */
    public Date getFecha(){
        return fecha;
    }
    
    /**
     * Metodo get Hora
     * @return hora
     */
    public LocalDateTime getHora(){
        return hora;
    }
    
    /**
     * Metodo get Descripcion
     * @return descripcion
     */
    public String getDescripcion(){
        return descripcion;
    }
    
    /**
     * Metodo set id
     * @param id 
     */
    public void setIdNotificacion(String id){
      this.idnotificacion = id;
    }
    
    /**
     * Metodo set Fecha
     * @param fecha 
     */
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    /**
     * Metodo set Hora
     * @param hora 
     */
    public void setHora(String hora){
        this.fecha=hora;
    }
    
    /**
     * Metodo set Descripcion
     * @param descripcion 
     */
    public void setDescripcion(String descripcion){
       this.descripcion=descripcion; 
    }
}
