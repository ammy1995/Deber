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
public class TestActividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Actividad actprueba = new Actividad();
        
        System.out.println(actprueba.getActividadExtra(0));
        System.out.println(actprueba.imprimirActividad());
        //actprueba.setFecha(fecha);
        //actprueba.setHora(LocalDateTime.MIN);
        actprueba.setImportancia("Muy importante");
        actprueba.setNotificacion("Deber Urgente");
        
        
        
    }
    
}
