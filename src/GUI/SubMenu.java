/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DOMINIO.Actividad;
import DOMINIO.TestCategoria;
import DOMINIO.TestEstudiante;
import DOMINIO.TestNotificacion;
import java.util.Scanner;
/**
 *
 * @author ammy
 */
public class SubMenu {
   public SubMenu(){
    }

       Menu menu = new Menu();   
       TestEstudiante est = new TestEstudiante();
       
       


        public void SubMenuPrincipal(){
            System.out.println("Ingreso al Submenu");
        }

        public void subMenuAdmEstudiante(){
         // Accedo a la clase de pantalla de AdmEstudiante
         //est.pantallaAdmEstudiante();
         pantallaAdmEstudiante();
         System.out.print("Ingrese la opción que desee ejecutar: ");
         est.subEstudiante();
        
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
        
        TestCategoria cat = new TestCategoria();
        public void subMenuAdmCategoria(){
         //cat.pantallaAdmCategorias();

         pantallaAdmCategorias();
         System.out.print("Ingrese la opción que desee ejecutar: ");
         cat.subCategoria();
        }
        
        
        TestNotificacion not = new TestNotificacion();
        public void subMenuAdmNotificacion(){
          not.pantallaAdmNotificaciones();

          System.out.print("Ingrese la opción que desee ejecutar: ");
          not.subnotificacion();
        }



        public void pantallaAdmEstudiante(){
            est.pantallaAdmEstudiante();
            /*System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Estudiante: ");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Editar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Consultar Estudiante");
            System.out.println("--------------------------------------------");*/
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
            cat.pantallaAdmCategorias();
            /*System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Categorías: ");
            System.out.println("1. Crear Categoría");
            System.out.println("2. Editar Categoría");
            System.out.println("3. Eliminar Categoría");
            System.out.println("--------------------------------------------");*/
        }

        public void pantallaAdmNotificaciones(){
            not.pantallaAdmNotificaciones();
            /*System.out.println("--------------------------------------------");
            System.out.println("Menú Administrar Notificación: ");
            System.out.println("1. Crear Notificación");
            System.out.println("2. Editar Notificación");
            System.out.println("3. Eliminar Notificación");
            System.out.println("--------------------------------------------");*/
        } 
    
}
