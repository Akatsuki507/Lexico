/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import java.util.ArrayList;
/**
 *
 * @author Master
 */
public class Nodo {
    private String datos;
    private Nodo siguiente;
    private ArrayList<Nodo> hijos = new ArrayList<Nodo>();
   
      public Nodo(String datos) {
        this.datos = datos;
    }

    public String getdatos() {
        return datos;
    }

    public void setdatos(String datos) {
        this.datos = datos;
    }
    
    public Nodo getsiguiente() {
        return siguiente;
    }

    public void setsiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(Nodo hijo) {
        hijos.add(hijo);
    }
}
