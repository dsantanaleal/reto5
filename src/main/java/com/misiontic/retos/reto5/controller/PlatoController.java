/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Plato;
import java.util.Set;

/**
 *
 * @author dsantanaleal
 */
public class PlatoController {
    
    Set<Plato> platos;
    
    public PlatoController(Set<Plato> platos) {
        this.platos = platos;
    }
    
    public void mostrarPlatos() {
        platos.forEach(plato -> {
            System.out.println(plato);
        });
    }
    
}
