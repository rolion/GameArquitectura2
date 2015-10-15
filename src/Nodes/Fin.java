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
import java.awt.geom.Line2D;

/**
 *
 * @author root
 */
public class Fin extends Figura{
    


    public Fin(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
        this.dif=5;
    }

    public Fin() {
        this.dif=5;
    }
    
    
    private double dif;
    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
         this.setWidth( this.getX2()-this.getX1());
         this.setHeigth(this.getY2()-this.getY1());
        g2.draw(new Ellipse2D.Double(this.getX1(), this.getY1(),
                            this.getWidth(),this.getHeigth()));
        double xMedio=this.getX1()+Math.abs(this.getWidth()/2);
        double yMedio=this.getY1()+Math.abs(this.getHeigth()/2);
        g2.draw(new Line2D.Double(xMedio-this.dif, yMedio-this.dif,
                xMedio+this.dif, yMedio+this.dif));
        g2.draw(new Line2D.Double(xMedio+this.dif, yMedio-this.dif,
                xMedio-this.dif, yMedio+this.dif));
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Fin fin=new Fin();
        fin.setX1(this.getX1());
        fin.setY1(this.getY1());
        fin.setX2(this.getX2());
        fin.setY2(this.getY2());
        fin.setWidth(this.getWidth());
        fin.setHeigth(this.getHeigth());
        fin.setColor(this.getColor());
        return fin;
    }
    
    
}
