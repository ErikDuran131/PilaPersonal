/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilapersonal;

/**
 *
 * @author erikd
 */
public class Pila {
    
    int VectorPila[];
    int cima = 0, r;
    
    public Pila(int tamaño)
    {
        VectorPila = new int[tamaño];
    }
    
    public void ImprimirDatos()
    {
        for (int i = 0; i < cima; i++) {
            r = VectorPila[i];
            System.out.println("" + r);
        }
        
    }
    
    public int UltimoDato()
    {
        int x = VectorPila[cima-1];
        return x;
    }

    public void Insertar(int dato)
    {
        VectorPila[cima] = dato;
        cima++;
        
    }
    
    public int Eliminar()
    {
        int eliminar = 0;
        if(cima == 0)
        {
            System.out.println("La pila Esta Vacia");
        }
        else
        {
            eliminar = VectorPila[cima];
            cima--;
        }    
        return eliminar;
    }
    
    public boolean Vacio()
    {
        if(cima == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int Tamaño()
    {
        return VectorPila.length; 
    }
            
}
