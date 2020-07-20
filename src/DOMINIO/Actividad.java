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
 *El usuario quiere ingresar una actividad
 * @author ammy
 */
public class Actividad {
    /**
     * Atributos
     */
    
    /**
     * Fecha de la actividad
     */
    private Date fecha;
    /**
     * Hora de la actividad
     */
    private LocalDateTime hora;
    /**
     * importancia de la actividad
     */
    private String importancia;
    /**
     * notificacion de la actividad
     */
    private String notificacion;
    private ActExtra[] actividadExtra;
    private int numActividadExt;
    
    /**
     * Metodo Constructor sin parametros
     */
    public Actividad (){  
    
     actividadExtra = new ActExtra[3];
     numActividadExt = 0;
     LocalDate fecha1 = LocalDate.of(2018,10,30);
     LocalDateTime hora1 = LocalDateTime.now();
     importancia = " ";
     notificacion= " ";
    }
    
    /**
     * Metodo Constructor con parametros
     * @param fecha
     * @param hora
     * @param importancia
     * @param notificacion 
     */
    
    public Actividad (Date fecha, LocalDateTime hora, String importancia ,String notificacion){
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
     * Metodo get de la Hora
     * @return Hora
     */
    public LocalDateTime getHora(){
        return hora;
    }
    
    /**
     * Metodo get Importancia
     * @return Importancia
     */
    
    public String getImportancia(){
        return importancia;
    }
    /**
     * Metodo get nivel notificaciones
     * @return Notificacion
     */
    public String getNotificacion(){
        return notificacion;
    }
    /**
     * Metodo set fecha
     * @param fecha 
     */
    public void setFecha(Date fecha){
     this.fecha=fecha;
    }
    /**
     * Metodo set hora
     * @param hora 
     */
    public void setHora(LocalDateTime hora){
       this.hora=hora; 
    }
    /**
     * Metodo set importancia
     * @param importancia 
     */
    public void setImportancia(String importancia){
        this.importancia=importancia;
    }
    
    /**
     * Metodo st notificacion
     * @param notificacion 
     */
    public void setNotificacion(String notificacion){
        this.notificacion=notificacion;
        
    }
    
    public void nuevaActividad(){
        int i=numActividadExt ++;
        
        ActExtra[] masActividad = actividadExtra;
        if(numActividadExt>actividadExtra.length){
            actividadExtra = new ActExtra[numActividadExt];
            System.arraycopy(masActividad,0,actividadExtra,0,masActividad.length);
        }
        actividadExtra[i]=new ActExtra(fecha,hora,importancia,notificacion);
    } 

    public int getNumActividadExt() {
        return numActividadExt;
    }

    public ActExtra getActividadExtra(int posicion) {
        return actividadExtra[posicion];
    }
    
    public String imprimirActividad(){
        String texto=" ";
        /*ActExtra[] actCero = new ActExtra[numActividadExt];
        if(numActividadExt<actividadExtra.length){
            System.arraycopy(actividadExtra, 0, actCero, 0, actCero.length);
        }
        for(ActExtra act: actCero){
            texto += act.toString()+ '\n';
        }*/
        
        for(ActExtra act:this.actividadExtra){
            texto += act.toString()+'\n';
        }
        return texto;
    }
}
