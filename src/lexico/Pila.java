/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

/**
 *
 * @author Master
 */
public class Pila {
    private Nodo ultimovalor;
    
    public Pila (){
    ultimovalor = null;
}
    public String UltimoValor(){
    return ultimovalor.getdatos();
}
    public void Insertar(String token){
        Nodo nuevonodo = new Nodo(token);
        if(ultimovalor == null){
            nuevonodo.setsiguiente(null);
            ultimovalor = nuevonodo;
        }
        else{
            nuevonodo.setsiguiente(ultimovalor);
            ultimovalor= nuevonodo;
        }
    }
    public void Extraer(){
        if (ultimovalor.getsiguiente() != null){
            ultimovalor = ultimovalor.getsiguiente();
        }
        else{
            ultimovalor = null;
        }
    }
    
    public boolean PilaVacia(){
         if(ultimovalor == null){
             return true;
         }
         else{
             return false;
         }
    }
}
