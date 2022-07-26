/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.model;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author dsantanaleal
 */
public class Mesa {
    
    int numero;
    Set<Pedido> pedidos = new HashSet<>();
    Pedido pedidoActual;
    boolean estaLibre = true;
    JButton btnMesa;
    
    public Mesa(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setPedidoActual(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
    
    public Pedido getPedidoActual() {
        return pedidoActual;
    }

    public boolean isEstaLibre() {
        return estaLibre;
    }

    public void setEstaLibre(boolean estaLibre) {
        this.estaLibre = estaLibre;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public JButton getBtnMesa() {
        return this.btnMesa;
    }
    
    public void setBtnMesa(JButton btnMesa) {
        this.btnMesa = btnMesa;
    }
    
}
