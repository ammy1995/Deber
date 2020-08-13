/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import DOMINIO.Usuario;
import java.util.Scanner;
/**
 *
 * @author ammy
 */
public class Menu {
    
    public Menu(){}
    int opcion;
    
    public void MenuPrincipal(){
        
        SubMenu submenu = new SubMenu();  
        
        pantallaInicio();

        System.out.print("Ingrese la opción que desee ejecutar: ");
        Scanner ingreso = new Scanner(System.in);   
        this.opcion = ingreso.nextInt();

        switch(opcion){
            case 1:
            submenu.subMenuAdmEstudiante();
            break;
            case 2:
            System.out.println("Ingreso al Sistema");
            break;  
            case 3:
            submenu.subMenuAdmActividades();            
            break; 
            case 4:
            submenu.subMenuAdmCategoria();            
            break; 
            case 5:
            submenu.pantallaAdmNotificaciones();            
            break;
            default:
            System.out.println("Por favor Ingrese una opción válida");
            break;
            }
    }
    
    public void pantallaInicio(){
          /*Usuario us = new Usuario();
        String nuevo = us.getNick();
        System.out.println("nuevo"+nuevo);*/
        // Validar los campos 3 4 y 5 cuando ingrese el usuario
        System.out.println("--------------------------------------------");
        System.out.println("----------- Bienvenidos a NTN --------------");
        System.out.println("Menú Principal: ");
        System.out.println("1. Administrar Estudiantes");
        System.out.println("2. Ingreso al Sistema");
        System.out.println("3. Administrar Actividades");
        System.out.println("4. Administrar Categorias");
        System.out.println("5. Administrar Notificación");
        System.out.println("--------------------------------------------");
    }
        
   
    
 }
