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
public class TestEstudiante {
    
    public void subEstudiante() {
       
        Estudiantes sp= new Estudiantes(2);
        Scanner op = new Scanner(System.in);
        int l=op.nextInt();
 
            switch(l){
                case 1:
                    Scanner es = new Scanner(System.in);
                    System.out.println("1. Registrar Estudiante");
                    System.out.print("Ingrese Nombre: ");
                    String nombre = es.nextLine();
                    System.out.print("Ingrese Apellido: ");
                    String apellido = es.nextLine();
                    System.out.print("Ingrese Correo: ");
                    String correo = es.nextLine();
                    System.out.print("Ingrese Nivel de Estudio: ");
                    String nivelestudio = es.nextLine();
                    sp.agregar(new Estudiante(nombre,apellido,correo,nivelestudio));
                    System.out.println("Registro Exitoso");
                    System.out.println("-------------------------------------");
                    System.out.println("Ingreso al Sistema");
                    Scanner usuarioSis = new Scanner(System.in);
                    String nick = nombre + apellido;
                    System.out.println("Su nick es: "+ nick);
                    System.out.print("Ingrse Contraseña: ");
                    String contraseña = usuarioSis.nextLine();
                    Usuario us = new Usuario(nick,contraseña);
                    break;
                   
                case 2:
                    System.out.println("2. Editar Estudiante");
                    modificar(sp);
                    break;  
                case 3:
                    System.out.println("3. Eliminar Estudiante");
                    eliminar(sp);
                    break; 
                case 4:
                    System.out.println("4. Consultar Estudiante");
                    buscar(sp);
                    break; 
                case 5:
                    System.out.println("5. Ver Estudiantes");
                    ver(sp);
                    break;
                default:
                    System.out.println("Por favor Ingrese una opción válida");
                    break;     
               
            }
        
    }
    public  void pantallaAdmEstudiante(){
        Scanner ent= new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Menu Administrar Notificaccion: ");
        System.out.println("1.Registar Estudiante");
        System.out.println("2.Editar Estudiante");
        System.out.println("3.Eliminar Estudiante");
        System.out.println("4.Consultar Estudiante");
        System.out.println("5.Ver Estudiantes");
        System.out.println("---------------------------------------------");   
    }
    
    public static void ver(Estudiantes sp){
        System.out.println(sp.toString()+'\n');
    }
    
    private static void buscar(Estudiantes sp){
        Scanner bs = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = bs.nextLine();
        System.out.println(" ");
        Estudiante aux = sp.buscar(nombre);
        if(aux != null){
            System.out.println(aux.toString());
        }else{
            System.out.println("No existe el estudiante");
        }
    }
    
     private static void eliminar (Estudiantes sp){
        Scanner el=new Scanner (System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre=el.nextLine();
        if(sp.eliminar(nombre)){
            System.out.println("Eliminación correcta");

        }else
            System.out.println("No existe");
    }
    private static void modificar(Estudiantes sp){
        Scanner md = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = md.nextLine();
        Estudiante aux = sp.buscar(nombre);
        if(aux != null){
            System.out.print("Ingrese el nuevo Nombre: ");
            String nuevo = md.nextLine();
            aux.setNombre(nuevo);
        }else{
            System.out.println("No existe el estudiante");
        }
    }
}
