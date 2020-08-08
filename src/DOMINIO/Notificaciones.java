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
public class Notificaciones {
    
     private Notificación vecnot [];
        private int Tam1;
        private int Can1;

        public Notificaciones (int n1){
            Tam1=n1;
            vecnot= new Notificación[Tam1];
            Can1=0;
        }
        public boolean agregar (Notificación n1){
            if(Can1<Tam1){
                vecnot[Can1++]=n1;
                return true;
            }
            return false;
        }
        public Notificación buscar(int idnotificacion){
            for (int i=0;i<Can1;i++){
                if(vecnot[i].getIdNotificacion()==idnotificacion);
                return vecnot[i];
            }
            return null;
        }

        public boolean eliminar (String descripcion){
            for (int i=0;i<Can1;i++){
                if(vecnot[i].getDescripcion().equals(descripcion)){
                    correrIzquierda (i);
                    return true;
                }
            }
            return false;
        }

    private void correrIzquierda(int x) {
        for (int i=0;i<Can1;i++){
            vecnot[i]=vecnot[i+1];
        }
        Can1--;
    }

    public String toString(){
            String s="";
            for (int i=0;i<Can1;i++){
                s+= vecnot[i];
            }
            return s;
        }


    
}
