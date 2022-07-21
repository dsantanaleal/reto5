/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.model;

/**
 *
 * @author dsantanaleal
 */
public class Plato {
    
    int id;
    String nombre;
    
    public Plato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String toString() {
        return String.format("%d. %s", id, nombre);
    }
    
}
