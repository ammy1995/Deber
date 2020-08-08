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
    
    public static void main(String[] args) {
        Estudiante em = new Estudiante("Paco","perez","jod","basico");
        //Estudiante em1 = new Estudiante("Paco","perez","jod","basico");
        Estudiantes sp= new Estudiantes(2);
        Scanner es = new Scanner(System.in);
        System.out.print("Ingrese el Nombre: ");
        String nombre = es.nextLine();
        System.out.print("Ingrese el Apellido: ");
        String apellido = es.nextLine();
        System.out.print("Ingrese su Correo: ");
        String correo = es.nextLine();
        System.out.print("Ingrese sel Grado que cursa: ");
        String nivelestudio = es.nextLine();
        
        em.setNombre(nombre);
        em.setApellido(apellido);
        em.setCorreo(correo);
        em.setNivelEstudio(nivelestudio);
        System.out.println(" ");
        sp.agregar(em);
        System.out.println(em.toString());
        System.out.println(" ");
        /*sp.agregar(em1);
        System.out.println(em1.toString());
        System.out.println(" ");*/
        
        Scanner bs = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre1 = bs.nextLine();
        System.out.println(" ");
        Estudiante aux = sp.buscar(nombre1);
        if(aux != null){
            System.out.println(aux.toString());
        }else{
            System.out.println("No existe el estudiante");
        }
        
        System.out.println(" ");
        Scanner el = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre2 = el.nextLine();
        if(sp.eliminar(nombre2)){
            System.out.println("Estudiante eliminado");
        }else{
            System.out.println("No existe el estudiante");
        }
        
        System.out.println(" ");
        Scanner md = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre3 = md.nextLine();
        Estudiante aux1 = sp.buscar(nombre3);
        if(aux1 != null){
            System.out.print("Ingrese el nuevo Nombre: ");
            String nuevo = md.nextLine();
            aux1.setNombre(nuevo);
        }else{
            System.out.println("No existe el estudiante");
        }
        
    }
    
    /*private static void buscar(Estudiantes sp){
        Scanner bs = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = bs.nextLine();
        Estudiante aux = sp.buscar(nombre);
        if(aux != null){
            System.out.println(aux.toString());
        }else{
            System.out.println("No existe el estudiante");
        }
    }*/
    
    /*private static void eliminar(Estudiantes sp){
        Scanner el = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = el.nextLine();
        if(sp.eliminar(nombre)){
            System.out.println("Estudiante eliminado");
        }else{
            System.out.println("No existe el estudiante");
        }
    }*/
    /*private static void modificar(Estudiantes sp){
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
    }*/
}
