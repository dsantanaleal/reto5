/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.retos.reto5;

import com.misiontic.retos.reto5.controller.MesaController;
import com.misiontic.retos.reto5.controller.PedidoController;
import com.misiontic.retos.reto5.controller.PlatoController;
import com.misiontic.retos.reto5.model.Mesa;
import com.misiontic.retos.reto5.model.Pedido;
import com.misiontic.retos.reto5.model.Plato;
import com.misiontic.retos.reto5.view.RestauranteView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dsantanaleal
 */
public class Reto5 {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestauranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestauranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestauranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestauranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MesaController mesaController = new MesaController(mesas());
                PlatoController platoController = new PlatoController(platos());
                PedidoController pedidoController = new PedidoController();
                
                RestauranteView view = new RestauranteView(mesaController, platoController, pedidoController);
                view.setVisible(true);
                
                mesaController.setView(view);
                pedidoController.setView(view);
            }
        });
    }
    
    public static Set<Mesa> mesas() {
        Set<Mesa> mesas = new LinkedHashSet<>();
        
        Mesa mesa1 = new Mesa(1);
        mesas.add(mesa1);
        Mesa mesa2 = new Mesa(2);
        mesas.add(mesa2);
        Mesa mesa3 = new Mesa(3);
        mesas.add(mesa3);
        Mesa mesa4 = new Mesa(4);
        mesas.add(mesa4);
        Mesa mesa5 = new Mesa(5);
        mesas.add(mesa5);
        Mesa mesa6 = new Mesa(6);
        mesas.add(mesa6);
        Mesa mesa7 = new Mesa(7);
        mesas.add(mesa7);
        Mesa mesa8 = new Mesa(8);
        mesas.add(mesa8);
        return mesas;
    }
    
    public static Set<Plato> platos() {
        Set<Plato> platos = new LinkedHashSet<>();
        Plato p1 = new Plato(1, "Bandeja Paisa",21000.00);
        Plato p2 = new Plato(2, "Arroz Paisa",20000.00);
        Plato p3 = new Plato(3, "Frijolada",25000.00);
        Plato p4 = new Plato(4, "Mojarra Frita",35000.00);
        Plato p5 = new Plato(5, "Ajiaco",20000.00);
        Plato p6 = new Plato(6, "Arroz con camarones",35000.00);
        Plato p7 = new Plato(7, "Churrasco",22000.00);
        platos.add(p1);
        platos.add(p2);
        platos.add(p3);
        platos.add(p4);
        platos.add(p5);
        platos.add(p6);
        platos.add(p7);
        return platos;
    }
}
