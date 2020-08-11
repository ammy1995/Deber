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
public class Estudiantes {
    private Estudiante[]estudiantes;
    private int tam;
    private int cam;
    
    public Estudiantes(int n){
        tam=n;
        estudiantes = new Estudiante[tam];
        cam=0;
    }
    public boolean agregar(Estudiante n){
        if(cam<tam){
            estudiantes[cam++] = n;
            return true;
        }
        return false;
    }
    public Estudiante buscar(String nombre){
        for(int i=0;i<cam;i++){
            if(estudiantes[i].getNombre().equals(nombre)){
                return estudiantes[i];
            }
        }
        
      return null;  
    }
    
    public boolean eliminar (String nombre){
            for (int i=0;i<cam;i++){
                if(estudiantes[i].getNombre().equals(nombre)){
                    correrIzquierda (i);
                    return true;
                }
            }
            return false;
    }
    
    private void correrIzquierda(int x) {
        for (int i=0;i<cam;i++){
            estudiantes[i]=estudiantes[i+1];
        }
        cam--;
    }
    
    @Override
    public String toString(){
        String texto= " ";
        for(Estudiante est:this.estudiantes){
            texto += est.toString()+'\n';
        }
        return texto;
    }
}
