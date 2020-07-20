/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

/**
 * El estudiante ingresa al sistema mediante nick y contraseña
 * @author ammy
 */
public class Usuario {
    /**
     * Atributos
     */
    
    /**
     * nick de usuario nombre y apellido
     */
    private String nick;
    /**
     * contraseña ingresada por el usuario
     */
    private String contraseña;
    
    /**
     * Metodo Constructor sin parametros
     */
    public Usuario(){
        nick=" ";
        contraseña= " ";
    }
    /**
     * Metodo Constructor con parametros
     * @param nick
     * @param contraseña 
     */
    public Usuario(String nick, String contraseña){
        this.nick=nick;
        this.contraseña=contraseña;
    }
    /**
     * Metodo get nick 
     * @return Nick
     */
    public String getNick(){
        return nick;
    }
    
    /**
     * Metodo get contraseña
     * @return Contraseña
     */
    public String getContraseña(){
        return contraseña;
    }
    /**
     * Metodo set nick
     * @param nick 
     */

    public void setNick(String nick){
        
    }
    /**
     * metodo set contraseña
     * @param contraseña 
     */
    public void setContraseña(String contraseña){
        
    }
}
