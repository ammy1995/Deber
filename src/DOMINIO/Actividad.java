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
 *
 * @author ammy
 */
public class Actividad {
    
    private Date fecha;
    private LocalDateTime hora;
    private String importancia;
    private String notificacion;
    
    public Actividad (){   
     LocalDate fecha1 = LocalDate.of(2018,10,30);
     LocalDateTime hora1 = LocalDateTime.now();
     importancia = " ";
     notificacion= " ";
    }
    
    
    
    public Actividad (Date fecha, LocalDateTime hora, String importancia ,String notificacion){
        this.fecha= fecha;
        this.hora = hora;
        this.importancia=importancia;
        this.notificacion=notificacion;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public LocalDateTime getHora(){
        return hora;
    }
    
    public String getImportancia(){
        return importancia;
    }
    
    public String getNivelNotificacion(){
        return notificacion;
    }
    
    public void setFecha(Date fecha){
    
    }
    
    public void setHora(LocalDateTime hora){
        
    }
    
    public void setImportancia(String importancia){
        
    }
    
    public void setNotificacion(String notificacion){
        
    }
}
