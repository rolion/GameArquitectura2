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
import java.awt.geom.Line2D;

/**
 *
 * @author root
 */
public class Proceso extends Figura{
    

    private double dif;

    public Proceso(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
        this.dif=30;
    }

    public Proceso() {
        this.dif=30;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line2D.Double(this.getX1(), this.getY1(),
                this.getX1()-dif, this.getY2()));
        g2.draw(new Line2D.Double(this.getX1()-dif, this.getY2(),
            this.getX2(), this.getY2()));
        g2.draw(new Line2D.Double(this.getX2(), this.getY2(),
            this.getX2()+dif, this.getY1()));
        g2.draw(new Line2D.Double(this.getX2()+dif, this.getY1(),
            this.getX1(), this.getY1()));
    }

    
    
}
