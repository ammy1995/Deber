/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;
import java.util.regex.*;
/**
 *
 * @author ammy
 */
public class ValidadorDatos {
    
       public static void main (String[] args) throws Exception{
       //validar correo
         
           String input = "www.regular.com";
       
       //Compueba que no empieze con punto o @
       
          Pattern p = Pattern.compile("^.|^@");
          Matcher m = p.matcher(input);
          if(m.find())
                System.err.println("La direcciones de email no empiezan por punto o @");
       
       //Comprueba que no empiese por www.
       
          p=Pattern.compile("^www.");
          m=p.matcher(input);
          if(m.find())
               System.out.println("Los emails no empiezan por www");
          
       //Comprueba que contega @
          
          p= Pattern.compile("@");
          m= p.matcher(input);
          if(!m.find())
               System.out.println("El email no contiene @");
          
          //Comprueba que no contega caracteres prohibidos
          
          p= Pattern.compile("[A-Za-z0-9.@-~#]+");
          m= p.matcher(input);
          StringBuffer sp =new StringBuffer();
          boolean resultado = m.find();
          boolean caracteresIlegales = false;
          
          while(resultado){
              caracteresIlegales = true;
              m.appendReplacement(sp, "");
              resultado = m.find();
          }
          
          //ingresar el ultimo segmento de la entrasa a la cadena
          
          m.appendTail(sp);
          input = sp.toString();
          
          if(caracteresIlegales){
              System.out.println("El email contiene caracteres inapropiados");
          }
          
          //validar numero
          
          String cadenaUno ="1234";
          
          if(cadenaUno.matches("[0-9]*"))
               System.out.println("Es un número valido");
          else
               System.out.println("No es digito valido");
          
       }
       
       
    
    
}
