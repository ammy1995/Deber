/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DOMINIO.Actividad;
import DOMINIO.Categoria;
import DOMINIO.Estudiante;
import DOMINIO.Notificación;
import DOMINIO.Usuario;
import java.util.Scanner;

/**
 *
 * @author ammy
 */
public class SubMenu {
    
    public SubMenu(){
    }
    
       Menu menu = new Menu();   


        public void SubMenuPrincipal(){
            System.out.println("Ingreso al Submenu");
        }
        
        public void subMenuAdmEstudiante(){
    
        // Accedo a la clase de pantalla de AdmEstudiante
        pantallaAdmEstudiante();
        
        System.out.print("Ingrese la opción que desee ejecutar: ");
        Scanner ingreso = new Scanner(System.in);   
        int opcion = ingreso.nextInt();
        
         switch(opcion){
            case 1:
                
            Scanner registrar = new Scanner(System.in);   
            System.out.println("--------------------------------------------");
            System.out.println("1. Registrar Estudiante");
            System.out.print("Ingrese Nombre: ");
            String nombre = registrar.nextLine();
            System.out.print("Ingrese Apellido: ");
            String apellido = registrar.nextLine();
            System.out.print("Ingrese Correo: ");
            String correo = registrar.nextLine();
            System.out.print("Ingrese Nivel Estudio: ");
            String nivelestudio = registrar.nextLine();
            Estudiante registro = new Estudiante(nombre,apellido,correo,nivelestudio);
            System.out.println("Registro Exitoso");
            System.out.println("--------------------------------------------");
            System.out.println("Ingreso al Sistema");
            Scanner usuarioSis = new Scanner(System.in);   
            String nick = nombre + apellido;
            System.out.println("Su nick es: "+ nick);
            System.out.print("Ingrese Contraseña: ");
            String contraseña = usuarioSis.nextLine();
            Usuario us = new Usuario(nick,contraseña); 
            menu.pantallaInicio();
            
            break;
            case 2:
            System.out.println("2. Editar Estudiante");
            break;  
            case 3:
            System.out.println("3. Eliminar Estudiante");
            break; 
            case 4:
            System.out.println("4. Consultar Estudiante");
            break; 
            default:
            System.out.println("Por favor Ingrese una opción válida");
            break;
            }
        }
        
        public void subMenuAdmActividades(){
            
        pantallaAdmActividades();
        
        System.out.print("Ingrese la opción que desee ejecutar: ");
        Scanner ingreso = new Scanner(System.in);   
        int opcion = ingreso.nextInt();
        
         switch(opcion){
            case 1:
            System.out.println("1. Registrar Actividad");
            Actividad act = new Actividad(null,null,null,null);
            break;
            case 2:
            System.out.println("2. Editar Actividad");
            break;  
            case 3:
            System.out.println("3. Eliminar Actividad");
            break; 
            case 4:
            System.out.println("4. Ordenar Actividad");
            break; 
            case 5:
            System.out.println("5. Consultar Actividad");
            break; 
            default:
            System.out.println("Por favor Ingrese una opción válida");
            break;
            }
            
        }
        
        public void subMenuAdmCategoria(){
            
        pantallaAdmCategorias();
        
        System.out.print("Ingrese la opción que desee ejecutar: ");
        Scanner ingreso = new Scanner(System.in);   
        int opcion = ingreso.nextInt();
        
         switch(opcion){
            case 1:
            System.out.println("1. Crear Categoría");
            Categoria act = new Categoria(null,null,null,null);
            break;
            case 2:
            System.out.println("2. Editar Categoría");
            break;  
            case 3:
            System.out.println("3. Eliminar Categoría");
            break; 
            default:
            System.out.println("Por favor Ingrese una opción válida");
            break;
            }
            
        }

        public void subMenuAdmNotificacion(){
            
        pantallaAdmNotificaciones();
        
        System.out.print("Ingrese la opción que desee ejecutar: ");
        Scanner ingreso = new Scanner(System.in);   
        int opcion = ingreso.nextInt();
        
         switch(opcion){
            case 1:
            System.out.println("1. Crear Notificación");
            Notificación not = new Notificación(0,null,null,null);
            break;
            case 2:
            System.out.println("2. Editar Notificación");
            break;  
            case 3:
            System.out.println("3. Eliminar Notificación");
            break; 
            default:
            System.out.println("Por favor Ingrese una opción válida");
            break;
            }
            
        }

        
        
        public void pantallaAdmEstudiante(){
            System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Estudiante: ");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Editar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Consultar Estudiante");
            System.out.println("--------------------------------------------");
        }
    
        public void pantallaAdmActividades(){
            System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Actividades: ");
            System.out.println("1. Registrar Actividad");
            System.out.println("2. Editar Actividad");
            System.out.println("3. Eliminar Actividad");
            System.out.println("4. Ordenar Actividad");
            System.out.println("5. Consultar Actividad");
            System.out.println("--------------------------------------------");
        }
        
        public void pantallaAdmCategorias(){
            System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Categorías: ");
            System.out.println("1. Crear Categoría");
            System.out.println("2. Editar Categoría");
            System.out.println("3. Eliminar Categoría");
            System.out.println("--------------------------------------------");
        }
      
        public void pantallaAdmNotificaciones(){
            System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Notificación: ");
            System.out.println("1. Crear Notificación");
            System.out.println("2. Editar Notificación");
            System.out.println("3. Eliminar Notificación");
            System.out.println("--------------------------------------------");
        }


        
}
