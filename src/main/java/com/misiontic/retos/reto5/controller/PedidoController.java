/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Mesa;
import com.misiontic.retos.reto5.model.Pedido;
import com.misiontic.retos.reto5.model.Plato;
import com.misiontic.retos.reto5.view.RestauranteView;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author dsantanaleal
 */
public class PedidoController {

    RestauranteView view;
    private Mesa mesaActual;
    
    public PedidoController() {
        
    }
    
    public void inicializar(Mesa mesa) {
        this.mesaActual = mesa;
        view.mostrarTotal(mesaActual.getPedidoActual().obtenerValorPedido());
        view.mostrarPedidoActual(mesaActual.getPedidoActual());
    }
    
    public void setView(RestauranteView view) {
        this.view = view;
    }
    
    public void agregarPlatoAPedido(Plato plato) {
        mesaActual.getPedidoActual().addPlato(plato);
        view.agregarPlato(plato);
        double total = mesaActual.getPedidoActual().obtenerValorPedido();
        view.mostrarTotal(total);
    }
    
    public void anularPedido() {
        mesaActual.setPedidoActual(new Pedido());
        inicializar(mesaActual);
    }
    
    public Optional<Pedido> buscarPedido(Mesa mesa, Pedido pedido) {
        return mesa.getPedidos().stream().filter(itPedido -> itPedido == pedido).findFirst();
    }
    
}
