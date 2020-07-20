package DOMINIO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * El usuario quiere agregar otra actividad
 * @author ammy
 */
public class ActExtra {
    /**
     * Atributos
     * fecha de la actividad extra
     */
    /**
     * fecha de la actividad
     */
    private Date fecha;
    /**
     * hora de la actividad estra
     */
    private LocalDateTime hora;
    /**
     * importancia de la actividad extra
     */
    private String importancia;
    /**
     * notificaciones de la actividad extra
     */
    private String notificacion;
    
    /**
     * Metodo Constructor sin parametros
     */
    public ActExtra (){   
     LocalDate fecha1 = LocalDate.of(2018,10,30);
     LocalDateTime hora1 = LocalDateTime.now();
     importancia = " ";
     notificacion= " ";
    }
    
    /**
     * Metodo constructor con parametros
     * @param fecha
     * @param hora
     * @param importancia
     * @param notificacion 
     */
    
    public ActExtra (Date fecha, LocalDateTime hora, String importancia ,String notificacion){
        this.fecha= fecha;
        this.hora = hora;
        this.importancia=importancia;
        this.notificacion=notificacion;
    }
    /**
     * Metodo get de la Fecha
     * @return fecha
     */
    public Date getFecha(){
        return fecha;
    }
    /**
     * Metodo get de la hora
     * @return hora
     */
    public LocalDateTime getHora(){
        return hora;
    }
    /**
     * Metodo get de la importancia
     * @return importancia
     */
    public String getImportancia(){
        return importancia;
    }
    /**
     * Metodo get de las notificacion
     * @return notificacion
     */
    public String getNivelNotificacion(){
        return notificacion;
    }
    /**
     * Metodo set de la fecha
     * @param fecha 
     */
    public void setFecha(Date fecha){
       this.fecha=fecha;
    }
    /**
     * Metodos set de la Hora
     * @param hora 
     */
    public void setHora(LocalDateTime hora){
        this.hora=hora;
    }
    /**
     * Metodo set de la importancia
     * @param importancia 
     */
    public void setImportancia(String importancia){
        this.importancia=importancia;
    }
    /**
     * Netodo set de la notificacion
     * @param notificacion 
     */
    public void setNotificacion(String notificacion){
        this.notificacion=notificacion;
    }
    
    @Override
    public String toString(){
        return "Actividad Extra"
                +'\n'+"Fecha: "+this.fecha+'\n'+"Hora: "+this.hora+'\n'+"Importancia: "+this.importancia+'\n'+"Notificación: "+this.notificacion;
    }
}
