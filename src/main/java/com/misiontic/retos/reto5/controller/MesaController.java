/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Mesa;
import com.misiontic.retos.reto5.model.Pedido;
import com.misiontic.retos.reto5.model.Plato;
import com.misiontic.retos.reto5.utils.Constants;
import com.misiontic.retos.reto5.utils.MesaListener;
import com.misiontic.retos.reto5.view.RestauranteView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author dsantanaleal
 */
public class MesaController {
    
    private RestauranteView view;
    Mesa mesaActual;
    Set<Mesa> mesas;
    
    public MesaController(Set<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    public void setView(RestauranteView view) {
        this.view = view;
    }
    
    public void loadMesas(JPanel panelMesas) {
        this.mesas.forEach(mesa -> {
            agregarMesa(mesa, panelMesas);
        });
    }
    
    public void agregarMesa(JPanel panelMesas) {
        Mesa nueva = new Mesa(this.mesas.size() + 1);
        this.mesas.add(nueva);
        agregarMesa(nueva, panelMesas);
    }
    
    private void agregarMesa(Mesa mesa, JPanel panelMesas) {
        JButton button = new JButton("Mesa " + mesa.getNumero(), Constants.loadIcon());
        button.setBackground(Color.green);
        button.setSize(Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        button.addActionListener(new MesaListener(this));
        mesa.setBtnMesa(button);
        panelMesas.add(button);
        panelMesas.revalidate();
        panelMesas.repaint();
    }
    
    public void seleccionarMesa(JButton btnMesa) {
        mesaActual = mesas.stream().filter(mesa -> mesa.getBtnMesa() == btnMesa).findFirst().orElse(null);
        view.abrirMesa(mesaActual);
    }
    
    public void ocuparMesa() {
        mesaActual.setEstaLibre(false);
        mesaActual.setPedidoActual(new Pedido());
        mesaActual.getBtnMesa().setBackground(Color.red);
        view.abrirMesa(mesaActual);
    }
    
    public void liberarMesa() {
        mesaActual.setEstaLibre(true);
        mesaActual.setPedidoActual(null);
        mesaActual.getBtnMesa().setBackground(Color.green);
        view.cambiarAMesasView();
    }
    
    public void pagarPedido() {
        view.finalizarMesa(mesaActual.getPedidoActual());
    }
    
    public void completarPago() {
        mesaActual.addPedido(mesaActual.getPedidoActual());        
        liberarMesa();
    }
    
    private void consultarPlatoTOP() {
        List<Plato> platosPedidos = new ArrayList<>();
        for(Mesa mesa : mesas) {
            for(Pedido pedido : mesa.getPedidos()) {
                platosPedidos.addAll(pedido.getPlatos());
            }
        }
        Optional<Map.Entry<Plato, Long>> optPlatoTop = platosPedidos.stream().collect(Collectors.groupingBy(plato -> plato, Collectors.counting())).entrySet().stream().max((o1, o2) -> o1.getValue().intValue()-o2.getValue().intValue());
        if(optPlatoTop.isPresent()){
            view.mostrarPlatoTop(optPlatoTop.get().getKey(), optPlatoTop.get().getValue().intValue());
        }
    }
    
    public void cerrarCaja() {
        int totalPedidos = 0;
        double totalVentas = 0.0;
        Mesa topMesa = null;
        Plato topPlato = null;
        for(Mesa mesa : mesas) {
            if(topMesa == null || mesa.getPedidos().size() > topMesa.getPedidos().size()) {
                topMesa = mesa;
            }
            totalPedidos += mesa.getPedidos().size();
            for(Pedido pedido : mesa.getPedidos()) {
                totalVentas += pedido.obtenerValorPedido();
            }
        }
        
        view.mostrarTotalPedidos(totalPedidos);
        view.mostrarTotalVentas(totalVentas);
        view.mostrarMesaTop(topMesa);
        consultarPlatoTOP();
    }
    
}
