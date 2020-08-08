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
public class TestCategoria {
       public static void main(String[] args) {
       Categorias C =new Categorias(10);
       int x;
       do{
           x=menu1();
           switch(x){

               case 1:
                   System.out.println("1. Crear Categoría");
                    agregar(C);
                    break;
               case 2:

                   System.out.println("2. Ver Categoría");
                    ver(C);
                    break;
               case 3:
                   System.out.println("3. Buscar Categoría");
                    buscar(C);
                   break;
               case 4:
                   System.out.println("3. Editar Categoría");
                    editar(C);
                   break;
               case 5:
                   System.out.println("3. Eliminar Categoría");
                   eliminar(C);
                   break;
               default:
                   System.out.println("Por favor Ingrese una opción válida");
                   break;
           }
       } while (x!=6);

    }



    public static int menu1(){
        int x;
        Scanner ent= new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Menú Administrar Categorías: ");
        System.out.println("1. Crear Categoría");
        System.out.println("2. Ver Categoría");
        System.out.println("3. Buscar Categoría");
        System.out.println("3. Editar Categoría");
        System.out.println("3. Eliminar Categoría");
        System.out.println("--------------------------------------------");
        x= ent.nextInt();
        return x;
    }
    private static void agregar (Categorias C){
        Scanner ent = new Scanner (System.in);
        String nombre;
        String reuniones;
        String citas;
        String tarea;
        System.out.println("Nombre: ");
        nombre=ent.nextLine();
        System.out.println("Reuniones: ");
        reuniones=ent.nextLine();
        System.out.println("Citas: ");
        citas=ent.nextLine();
        System.out.println("Tarea: ");
        tarea=ent.nextLine();
        C.agregar(new Categoria(nombre,reuniones,citas,tarea));

    }

    public static void ver (Categorias C){
        System.out.println(C.toString());
    }

    private static void buscar(Categorias C) {
        Scanner ent=new Scanner(System.in);
        String nombre;
        System.out.println("Nombre: ");
        nombre=ent.nextLine();
        Categoria aux = C.buscar(nombre);
        if(aux !=null){
            System.out.println(aux.toString());
        }else
            System.out.println("No existe Categoría");
    }
    private static void editar (Categorias C){
        Scanner ent = new Scanner(System.in);
        String nombre;
        String nuevo;
        System.out.println("Nombre: ");
        nombre=ent.nextLine();
        Categoria aux= C.buscar(nombre);
        if(aux != null){
            System.out.println("Ingrese nombre nuevo: ");
            nuevo =ent.nextLine();
            aux.setNombre(nuevo);
        }else
            System.out.println("No existe descripción");
    }

    private static void eliminar (Categorias C){
        Scanner ent=new Scanner (System.in);
        String nombre;
        System.out.println("Nombre");
        nombre=ent.nextLine();
        if(C.eliminar(nombre)){
            System.out.println("Eliminación correcta");

        }else
            System.out.println("No existe");
    }
}

