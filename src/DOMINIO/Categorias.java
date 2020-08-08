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
public class Categorias {
    private Categoria vec [];
    private int Tam;
    private int Can;

    public Categorias (int n){
        Tam=n;
        vec= new Categoria[Tam];
        Can=0;
    }
    public boolean agregar (Categoria n){
        if(Can<Tam){
            vec[Can++]=n;
            return true;
        }
        return false;
    }
    public boolean agregar1 (Categoria n){
        if(Can<Tam){
            vec[Can++]=n;
            return true;
        }
        return false;
    }
    public Categoria buscar(String nombre){
        for (int i=0;i<Can;i++){
            if(vec[i].getNombre().equals(nombre));
            return vec[i];
        }
        return null;
    }

    public boolean eliminar (String nombre){
        for (int i=0;i<Can;i++){
            if(vec[i].getNombre().equals(nombre)){
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


