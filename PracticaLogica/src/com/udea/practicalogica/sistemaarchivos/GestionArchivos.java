/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.practicalogica.sistemaarchivos;

import com.udea.practicalogica.NodoS;
import com.udea.practicalogica.arboles.ArbolListaGeneralizada;
import com.udea.practicalogica.arboles.listageneralizada.NodoLista;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author sony vaio
 */
public class GestionArchivos {

    public static void main(String[] arg) {

        ArbolListaGeneralizada arbol = getArbol();

        System.out.println("arbol" + arbol);
    }

    public static ArbolListaGeneralizada getArbol() {
        ArbolListaGeneralizada<String> arbol = null;

        arbol = new ArbolListaGeneralizada<>();

        NodoLista raiz = addNodo(null, new File("C:\\Users\\sony vaio\\Documents\\universidad\\logica 3\\raiz"), arbol);

        return arbol;
    }

    public static NodoS addNodo(NodoLista actualRaiz, File dir, ArbolListaGeneralizada arbol) {

        NodoS nodo = null;

        String curPath = dir.getPath();//retorna el path
        System.out.println("dir:" + curPath);
        DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
        nodo = new NodoS(curPath);

        if (actualRaiz != null) { // should only be null at root
            nodo.convierteSubArbol();
            arbol.agregar(actualRaiz, nodo);

            //curTop.add(curDir);
        }

        Vector ol = new Vector();
        String[] tmp = dir.list();//retorna una lista con los archivos y los directorios
        System.out.println("tmp:" + tmp);
        if (tmp == null) {//no tiene directorios
            return null;
        }

        for (int i = 0; i < tmp.length; i++)//llena el vector con los elementos de la lista
        {
            ol.addElement(tmp[i]);
        }
        Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);//organiza la lista en order
        File f;
        Vector files = new Vector();
        // Make two passes, one for Dirs and one for Files. This is #1.
        for (int i = 0; i < ol.size(); i++) {
            String thisObject = (String) ol.elementAt(i);
            String newPath;

            if (curPath.equals("."))//determina el path actual del objeto?
            {
                newPath = thisObject;
            } else {
                newPath = curPath + File.separator + thisObject;
            }

            if ((f = new File(newPath)).isDirectory()) {//si es un directorio llama recursivamente este metodo
                //addNodes(curDir, f);
//                if (!nodo.sw) {
//                    nodo.convierteSubArbol();
//                }
                addNodo(nodo, f, arbol);
            } else {
                files.addElement(thisObject);//si es un archivo lo agrega a la lista de archivos
            }
        }
        // Pass two: for files.
        for (int fnum = 0; fnum < files.size(); fnum++) {
            //curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));//por cada archivo agrega un nodo
            arbol.agregar(nodo, new NodoS(files.elementAt(fnum).toString()));
        }

    //return curDir;
        return nodo;

    }

    /**
     * Retorna las unidades del sistema actual
     *
     * @return
     */
    public static String[] listaUnidades() {
        String[] lista = null;

        File[] roots = File.listRoots();

        if (roots != null && roots.length > 0) {
            lista = new String[roots.length];
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
                lista[i] = roots[i].toString();
            }
        }
        return lista;
    }
}
