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
import java.awt.geom.Ellipse2D;

/**
 *
 * @author root
 */
public class Inicio extends Figura{
    


    public Inicio(double x1, double y1, double x2, double y2, Color color) {
        super(x1, y1, x2, y2, color);
    }

    public Inicio() {
    }

    
    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
         this.setWidth(this.getX2()-this.getX1());
         this.setHeigth(this.getY2()-this.getY1());
        g2.draw(new Ellipse2D.Double(this.getX1(), this.getY1(),
                             this.getWidth(),this.getHeigth()));
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Inicio inicio=new Inicio();
        inicio.setX1(this.getX1());
        inicio.setY1(this.getY1());
        inicio.setX2(this.getX2());
        inicio.setY2(this.getY2());
        inicio.setWidth(this.getWidth());
        inicio.setHeigth(this.getHeigth());
        inicio.setColor(this.getColor());
        return inicio;
    }
   
    
}
