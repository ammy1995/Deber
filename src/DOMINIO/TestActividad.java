/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

import java.util.Scanner;



/**
 *
 * @author ammy
 */
public class TestActividad {

    /**
     * @param args the command line arguments
     */
    public void subActividad() {
       Actividades A =new Actividades(10);
       Scanner op = new Scanner (System.in);
       int x=op.nextInt();
           switch(x){

               case 1:
                   System.out.println("1. Crear Actividad");
                    agregar(A);
                    break;
               case 2:

                   System.out.println("2. Ver Actividad");
                    ver(A);
                    break;
               case 3:
                   System.out.println("3. Buscar Categoría");
                    buscar(A);
                   break;
               case 4:
                   System.out.println("3. Editar Actividad");
                    editar(A);
                   break;
               case 5:
                   System.out.println("3. Eliminar Actividad");
                   eliminar(A);
                   break;
               default:
                   System.out.println("Por favor Ingrese una opción válida");
                   break;
           }

    }
    
     public void pantallaAdmActividades(){
        System.out.println("--------------------------------------------");
        System.out.println("Menú Administrar Actividades: ");
        System.out.println("1. Crear Actividad");
        System.out.println("2. Ver Actividad");
        System.out.println("3. Buscar Actividad");
        System.out.println("3. Editar Actividad");
        System.out.println("3. Eliminar Actividad");
        System.out.println("--------------------------------------------");
    }
    private static void agregar (Actividades A){
        Scanner ent = new Scanner (System.in);
        String fecha;
        String hora;
        String importancia;
        String notificacion;
        System.out.println("Fecha: ");
        fecha=ent.nextLine();
        System.out.println("Hora: ");
        hora=ent.nextLine();
        System.out.println("Importancia: ");
        importancia=ent.nextLine();
        System.out.println("Notificación: ");
        notificacion=ent.nextLine();
        A.agregar(new Actividad(fecha,hora,importancia,notificacion));
    }

    public static void ver (Actividades C){
        System.out.println(C.toString());
    }

    private static void buscar(Actividades A) {
        Scanner ent=new Scanner(System.in);
        String importancia;
        System.out.println("Importancia: ");
        importancia=ent.nextLine();
        Actividad aux = A.buscar(importancia);
        if(aux !=null){
            System.out.println(aux.toString());
        }else
            System.out.println("No existe Categoría");
    }
    private static void editar (Actividades C){
        Scanner ent = new Scanner(System.in);
        String fecha;
        String hora;
        System.out.println("Fecha: ");
        fecha=ent.nextLine();
        Actividad aux= C.buscar(fecha);
        if(aux != null){
            System.out.println("Ingrese fecha nueva: ");
            fecha =ent.nextLine();
            aux.setFecha(fecha);
        }else
            System.out.println("No existe descripción");
    }

    private static void eliminar (Actividades A){
        Scanner ent=new Scanner (System.in);
        String importancia;
        System.out.println("Importancia");
        importancia=ent.nextLine();
        if(A.eliminar(importancia)){
            System.out.println("Eliminación correcta");

        }else
            System.out.println("No existe");
    }
}
