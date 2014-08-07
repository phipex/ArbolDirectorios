/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.practicalogica.pruebas;

/**
 *
 * @author sony vaio
 */
public class NewClass {
    
    public static void main(String[] arg){
    
        PruebaAbstracta<String> uno  = new Herada("Uno");
        
        System.out.println("retorna entero:"+uno.entero);
        
        Herada dos = new Herada("Dos");
        
        dos.entero = 2;
        
        System.out.println("compara: "+uno.compareTo(dos));
        
    }
    
    public static class Herada extends PruebaAbstracta<String>{

        public Herada(String valor) {
            super(valor);
        }

        @Override
        public int compareTo(PruebaAbstracta<String> t) {
            return this.objeto.compareTo(t.objeto);
        }

    
    }
    
    
}
