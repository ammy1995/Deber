/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

/**
 *
 * @author Cheffo
 */
public class Actividades {
    private Actividad vec [];
    private int Tam;
    private int Can;

    public Actividades (int n){
        Tam=n;
        vec= new Actividad[Tam];
        Can=0;
    }
    public boolean agregar (Actividad n){
        if(Can<Tam){
            vec[Can++]=n;
            return true;
        }
        return false;
    }
    
    public boolean agregar1 (Actividad n){
        if(Can<Tam){
            vec[Can++]=n;
            return true;
        }
        return false;
    }
    
    public Actividad buscar(String nombre){
        for (int i=0;i<Can;i++){
            if(vec[i].getImportancia().equals(nombre));
            return vec[i];
        }
        return null;
    }

    public boolean eliminar (String nombre){
        for (int i=0;i<Can;i++){
            if(vec[i].getImportancia().equals(nombre)){
                correrIzquierda (i);
                return true;
            }
        }
        return false;
    }

    private void correrIzquierda(int x) {
        for (int i=0;i<Can;i++){
            vec[i]=vec[i+1];
        }
        Can--;
    }
    public String toString(){
        String s="";
        for (int i=0;i<Can;i++){
            s+= vec[i];
        }
        return s;
    }
}
