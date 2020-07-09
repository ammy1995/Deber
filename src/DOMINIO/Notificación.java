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
public class Notificación {
    private int idnotificacion;
    private Date fecha;
    private LocalDateTime hora;
    private String descripcion;
    
    public Notificación (){
     idnotificacion= 0;
     LocalDate fecha1 = LocalDate.of(2018,10,30);
      LocalDateTime hora1 = LocalDateTime.now();
     descripcion= " ";
       
    }
    
    
    
    public Notificación (int id, Date fecha,LocalDateTime hora,String descripcion){
        this.idnotificacion = id;
        this.fecha=fecha;
        this.hora= hora;
        this.descripcion=descripcion;
    }
    
    public int getIdNotificacion(){
        return idnotificacion;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public LocalDateTime getHora(){
        return hora;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setIdNotificacion(String id){
    
    }
    
    public void setAFecha(String fecha){
        
    }
    
    public void setHora(String hora){
        
    }
    
    public void setDescripcion(String descripcion){
        
    }
}
