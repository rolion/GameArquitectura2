/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

import Interface.Figura;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author root
 */
public class Fin extends Figura{

    public Fin(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
    }

    public Fin() {
    }
    
    

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
