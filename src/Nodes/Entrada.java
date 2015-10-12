/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

import Interface.Figura;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author root
 */
public class Entrada extends Figura{

    public Entrada(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
    }

    public Entrada() {
    }
    
    

    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
         this.setWidth(this.getX2()-this.getX1());
         this.setHeigth(this.getY2()-this.getY1());
         g2.draw(new Rectangle2D.Double(this.getX1(), this.getY1(),
                               this.getWidth(), this.getHeigth()));
         g2.drawString("HOla esta es una entrada de texto", (int)this.getX1(), (int)this.getY2());
    }


    
}
