/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.retos.reto5.utils;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author dsantanaleal
 */
public class Constants {
    
    public static final int BUTTON_WIDTH = 40;
    public static final int BUTTON_HEIGHT = 40;
    
    
    public static Icon loadIcon() {
        ImageIcon icon = new ImageIcon(Constants.class.getClassLoader().getResource("table.png"));
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(BUTTON_WIDTH, BUTTON_HEIGHT, Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }
}
