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
 * 
 * 
 * 
 *
 * @author ammy
 */
public class ActExtra {
    private Date fecha;
    private LocalDateTime hora;
    private String importancia;
    private String notificacion;
    
    public ActExtra (){   
     LocalDate fecha1 = LocalDate.of(2018,10,30);
     LocalDateTime hora1 = LocalDateTime.now();
     importancia = " ";
     notificacion= " ";
    }
    
    
    
    public ActExtra (Date fecha, LocalDateTime hora, String importancia ,String notificacion){
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
