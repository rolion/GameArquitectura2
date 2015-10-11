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
    
    private double x2;
    private double y2;
    private double dif;

    public Proceso(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
        this.dif=30;
    }

    public Proceso() {
        this.dif=30;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line2D.Double(this.getX(), this.getY(),
                this.getX()-dif, this.getY2()));
        g2.draw(new Line2D.Double(this.getX()-dif, this.getY2(),
            this.getX2(), this.getY2()));
        g2.draw(new Line2D.Double(this.getX2(), this.getY2(),
            this.getX2()+dif, this.getY()));
        g2.draw(new Line2D.Double(this.getX2()+dif, this.getY(),
            this.getX(), this.getY()));
    }

    
    
}
