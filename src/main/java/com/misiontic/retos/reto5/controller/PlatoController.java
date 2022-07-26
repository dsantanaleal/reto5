/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.controller;

import com.misiontic.retos.reto5.model.Plato;
import java.util.Set;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dsantanaleal
 */
public class PlatoController {
    
    Set<Plato> platos;
    DefaultTableModel platoTableModel;
    DefaultComboBoxModel<Plato> platoComboModel;
    
    
    public PlatoController(Set<Plato> platos) {
        this.platos = platos;
    }
    
    public void setPlatoTableModel(DefaultTableModel platoTableModel) {
        this.platoTableModel = platoTableModel;
    }
    
    public void setPlatoListModel(DefaultComboBoxModel<Plato> platoComboModel) {
        this.platoComboModel = platoComboModel;
    }
    
    public void agregarPlato(String nombre, double precio) {
        Plato plato = new Plato(platos.size()+1, nombre, precio);
        this.platos.add(plato);
        actualizarPlatos();
    }
    
    public void actualizarPlatos() {
        platoTableModel.setRowCount(0);
        platoComboModel.removeAllElements();
        platoComboModel.addAll(platos);
        for(Plato plato : platos) {
            String[] arrPlato = new String[2];
            arrPlato[0] = plato.getNombre();
            arrPlato[1] = plato.getPrecio() + "";
            platoTableModel.addRow(arrPlato);
        }
    }
    
}
