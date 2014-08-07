package com.udea.practicalogica.arboles;

import com.udea.practicalogica.arboles.listageneralizada.NodoLista;


/**
 * Clase que representa un arbol n-ario el cual esta representado como lista
 * ligada generalizada
 * @author Andres Felipe Montoya
 * @param <T>
 */
public class ArbolListaGeneralizada<T>{
    
    NodoLista<T> raiz = null;
    
    
    /**
     * Agrega un nuevo nodo al arbol
     * @param padre nodo al que se le debe agregar como hijo un nodo con el dato en el parametro
     * @param dato dato a agregar en el nuevo nodo
     * @return apuntador al nuevo nodo en el arbol o null si el padre no esta contenido en el arbol
     */
    public NodoLista<T> agregar(NodoLista<T> padre, T dato){
        NodoLista<T> nuevo = null;
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return nuevo;
    }
    
    /**
     * Elimina la primera ocurrencia de un nodo con un dato igual al parametro
     * @param dato dato a buscar para eliminar
     * @return true en caso de encontrar el dato o false en caso de no encontrarlo
     */
    public boolean elimina(T dato){
    
        boolean confirmado = false;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return confirmado;
        
    }
    
    /**
     * Mueve el nodo para que sea el nuevo hijo del nodo padre en el parametro
     * @param nodo nodo a mover
     * @param nuevoPadre nuevo nodo padre 
     * @return true en caso de encontrar el dato o false en caso de no encontrarlo
     */
    public boolean mover(NodoLista<T> nodo, NodoLista<T> nuevoPadre){
        boolean confirmado = false;
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return confirmado;
    }
    
    
    /**
     * Busca un nodo cuyo dato sea igual al del parametro y retorna su primera
     * ocurrencia
     * @param dato dato a buscar
     * @return el nodo cuyo dato sea igual al del parametro o null en caso de no encontrarlo
     */
    public NodoLista<T> buscar(T dato){
    
        NodoLista<T> nodo = null;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return nodo;
    
    }
    
    
    /**
     * Retorna el nodo correspondiente al padre del la primera ocurrencia al buscar
     * un nodo con el dato en el parametro
     * @param dato dato buscar
     * @return nodo del padre o null en caso de no encontrarlo
     */
    public NodoLista<T> retornPadre(T dato){
        NodoLista<T> padre = null;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return padre;
    
    }
    
    /**
     * Retorna el nodo correpondiente al padre del nodo ingresado como parametro
     * @param nodo nodo a buscar
     * @return nodo del padre o null en caso de no encontrarlo
     */
    public NodoLista<T> retornPadre(NodoLista<T> nodo){
        NodoLista<T> padre = null;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //return padre;
    
    }
    
}
