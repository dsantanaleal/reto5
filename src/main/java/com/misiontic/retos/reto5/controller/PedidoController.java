/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Mesa;
import com.misiontic.retos.reto5.model.Pedido;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author dsantanaleal
 */
public class PedidoController {
    
    Set<Pedido> pedidos;
    
    public PedidoController(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public Optional<Pedido> buscarPedido(Mesa mesa, Pedido pedido) {
        return mesa.getPedidos().stream().filter(itPedido -> itPedido == pedido).findFirst();
    }
    
}
