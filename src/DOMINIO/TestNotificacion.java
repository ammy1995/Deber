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
public class TestNotificacion {
    public static void main(String[] args) {
        Notificaciones C1 =new Notificaciones(10);
        int y;
        do{
            y=menu2();
            switch(y){

                case 1:
                    System.out.println("1. Crear Notificación");
                    agregar(C1);
                    break;
                case 2:
                    System.out.println("2. Ver Notificación");
                    ver(C1);
                    break;
                case 3:
                    System.out.println("3. Buscar Notificación");
                    buscar(C1);
                    break;
                case 4:
                    System.out.println("4. Editar Notificación");
                    editar(C1);
                    break;
                case 5:
                    System.out.println("5. Eliminar Notificación");
                    eliminar(C1);
                    break;
                default:
                    System.out.println("Por favor Ingrese una opción válida");
                    break;
            }
        } while (y!=6);

    }


    public static int menu2(){
        int y;
        Scanner ent= new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Menú Administrar Notificación: ");
        System.out.println("1. Crear Notificación");
        System.out.println("2. Ver Notificación");
        System.out.println("3. Buscar Notificación");
        System.out.println("4. Editar Notificación");
        System.out.println("5. Eliminar Notificación");
        System.out.println("--------------------------------------------");
        y= ent.nextInt();
        return y;
    }
    private static void agregar (Notificaciones C1){
        Scanner ent = new Scanner (System.in);
        int idnotificacion;
        String hora;
        String descripcion;
        String fecha;
        System.out.println("Id Notificación: ");
        idnotificacion=ent.nextInt();
        System.out.println("Fecha: ");
        fecha = ent.nextLine();
        System.out.println("Hora: ");
        hora=ent.nextLine();
        System.out.println("Descripción: ");
        descripcion=ent.nextLine();
        C1.agregar(new Notificación(idnotificacion,fecha,hora,descripcion));

    }
    public static void ver(Notificaciones C1){
        System.out.println(C1.toString());
    }

    private static void buscar(Notificaciones C1) {
        Scanner ent=new Scanner(System.in);
        int idnotificacion;
        System.out.println("Id Notificación: ");
        idnotificacion=ent.nextInt();
        Notificación aux = C1.buscar(idnotificacion);
        if(aux !=null){
            System.out.println(aux.toString());
        }else
            System.out.println("No existe Notificación");
    }
    private static void editar (Notificaciones C1){
        Scanner ent = new Scanner(System.in);
        int idnotificacion;
        int nuevo;
        System.out.println("Id Notificación: ");
        idnotificacion=ent.nextInt();
        Notificación aux= C1.buscar(idnotificacion);
        if(aux != null){
            System.out.println("Ingrese la descripción nueva: ");
            nuevo =ent.nextInt();
            aux.setIdNotificacion(nuevo);
        }else
            System.out.println("No existe descripción");
    }

    private static void eliminar (Notificaciones C1){
        Scanner ent=new Scanner (System.in);
        String descripcion;
        System.out.println("Descripción");
        descripcion=ent.nextLine();
        if(C1.eliminar(descripcion)){
            System.out.println("Eliminación correcta");

        }else
            System.out.println("No existe");
    }
}
