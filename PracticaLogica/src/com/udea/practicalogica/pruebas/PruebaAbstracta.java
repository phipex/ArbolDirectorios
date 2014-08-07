/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.practicalogica.pruebas;

/**
 *
 * @author sony vaio
 * @param <T>
 */
public  abstract class PruebaAbstracta<T> implements Comparable<PruebaAbstracta<T>>{
    
    public int entero;

    public T objeto;
    
    public PruebaAbstracta(T valor) {
        
        this.entero = 1;
        
        this.objeto = valor;
    }
    
    
    
}
