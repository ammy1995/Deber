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
public class Usuario {
    
    private String nick;
    private String contraseña;
    
    public Usuario(){
        
    }
    
    public Usuario(String nick, String contraseña){
        this.nick=nick;
        this.contraseña=contraseña;
    }
    
    public String getNick(){
        return nick;
    }
    
    public String getContraseña(){
        return contraseña;
    }

    public void setNick(String nick){
        
    }
    
    public void setContraseña(String contraseña){
        
    }
  
}
