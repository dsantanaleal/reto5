/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsantanaleal
 */
public class Pedido {
    
    List<Plato> platos = new ArrayList<>();
    
    public Pedido() {
    }
    
    public List<Plato> getPlatos() {
        return platos;
    }
    
    public void addPlato(Plato plato) {
        this.platos.add(plato);
    }

    public double obtenerValorPedido(){
        double valor=0.0;
        for(Plato item: this.platos){
            valor += item.getPrecio();
        }
        return valor;
    }
}
