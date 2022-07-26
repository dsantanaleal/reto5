/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.utils;

import com.misiontic.retos.reto5.controller.MesaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author dsantanaleal
 */
public class MesaListener implements ActionListener {
    
    private MesaController mesaController;
    
    public MesaListener(MesaController mesaController) {
        this.mesaController = mesaController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        mesaController.seleccionarMesa(source);
    }

}