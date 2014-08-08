/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.practicalogica;

import com.udea.practicalogica.arboles.listageneralizada.NodoLista;

/**
 *
 * @author sony vaio
 */
public class NodoS extends NodoLista<String>{

        public NodoS(){
            super(null);
        }
    
        public NodoS(String dato) {
            super(dato);
        }

        public NodoS(NodoLista liga, String dato) {
            super(liga, dato);
        }

        public NodoS(NodoLista liga, NodoLista subarbol) {
            super(liga, subarbol);
        }

        
        
        @Override
        public int compareTo(String t) {
            return this.dato.compareTo(t);
        }

      
        
        @Override
        public NodoLista convierteSubArbol() {
            NodoLista nodoConvertido = null;
            
            NodoLista dato = new NodoS(this.dato);
            
            this.sw = true;
            
            this.dato = null;
            
            this.subarbol = dato;
            
            nodoConvertido = this;
            
            return nodoConvertido;
        }
        
    
    
    }
