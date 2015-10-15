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
public class LineaFlujo extends Figura{

    public LineaFlujo(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
    }

    public LineaFlujo() {
    }

    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line2D.Double(this.getX1(), this.getY1(),
                this.getX2(), this.getY2()));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LineaFlujo linea=new LineaFlujo();
        linea.setX1(this.getX1());
        linea.setY1(this.getY1());
        linea.setX2(this.getX2());
        linea.setY2(this.getY2());
        linea.setWidth(this.getWidth());
        linea.setHeigth(this.getHeigth());
        linea.setColor(this.getColor());
        return linea;
    }
    
}
