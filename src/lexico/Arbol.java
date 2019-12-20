/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import java.util.ArrayList;

/**
 *
 * @author dharr
 */
public class Arbol {

    private ArrayList<Nodo> arbol = new ArrayList<Nodo>();
    private Nodo raiz;
    private int altura;
    private int cantidadp = 0;
  
    public Arbol(String tipo) {
        this.altura = 2;
        this.raiz = new Nodo("ORACION");
        this.arbol.add(raiz);
        this.raiz.setHijos(new Nodo("¿"));
        this.raiz.setHijos(new Nodo ("PREGUNTA"));
        this.raiz.setHijos(new Nodo("?"));
        this.raiz.getHijos().get(1).setHijos(new Nodo("CLAVE" + tipo.substring(5)));
        this.raiz.getHijos().get(1).setHijos(new Nodo("PREDICADO" + tipo.substring(5)));
    }
    
    public ArrayList<Nodo> getarbol() {
        return arbol;
    }
 
     public Nodo getraiz() {
        return raiz;
    }
     public void AñadirNodo(String valor, String palabra){
         if(valor.substring(0,5).equals("CLAVE")){
             if(this.raiz.getHijos().get(1).getHijos().get(0).getHijos().isEmpty()){
             this.raiz.getHijos().get(1).getHijos().get(0).setHijos(new Nodo(palabra));}
             else{
             this.raiz.getHijos().get(1).getHijos().get(1).setHijos(new Nodo(valor));
             this.raiz.getHijos().get(1).getHijos().get(1).getHijos().get(cantidadp).setHijos(new Nodo(palabra));
             this.cantidadp++;
             }
         }
         else if(!valor.substring(0,5).equals("SIGNO")){
             this.raiz.getHijos().get(1).getHijos().get(1).setHijos(new Nodo(valor));
             this.raiz.getHijos().get(1).getHijos().get(1).getHijos().get(cantidadp).setHijos(new Nodo(palabra));
             this.cantidadp++;
         }
     }
}