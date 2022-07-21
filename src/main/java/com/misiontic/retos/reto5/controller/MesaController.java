/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Mesa;
import com.misiontic.retos.reto5.model.Pedido;
import com.misiontic.retos.reto5.utils.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author dsantanaleal
 */
public class MesaController {
    
    Set<Mesa> mesas;
    
    public MesaController(Set<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    public void loadMesas(JPanel panelMesas) {
        this.mesas.forEach(mesa -> {
            agregarMesa(mesa, panelMesas);
        });
    }
    
    public void agregarMesa(JPanel panelMesas) {
        Mesa nueva = new Mesa(this.mesas.size());
        this.mesas.add(nueva);
        agregarMesa(nueva, panelMesas);
    }
    
    private void agregarMesa(Mesa mesa, JPanel panelMesas) {
        JButton button = new JButton("Mesa " + mesa.getNumero(), Constants.loadIcon());
        button.setSize(Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        button.addActionListener(new MesaListener());
        panelMesas.add(button);
        panelMesas.revalidate();
        panelMesas.repaint();
    }
    
    public void agregarPedido(Pedido pedido, Mesa mesa) {
        mesa.addPedido(pedido);
    }
    
    
    public void listarPedidos(JComponent component){
        System.out.println("|");
    }
    
    public class MesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            System.out.println("");
        }
        
    }
    
}
