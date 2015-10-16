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
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author root
 */
public class Salida extends Figura{

    public Salida(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
    }

    public Salida() {
    }

    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        this.setWidth(this.getX2()-this.getX1());
        this.setHeigth(this.getY2()-this.getY1());
        GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 5);
        polyline.moveTo (this.getX1(), this.getY1());
        polyline.lineTo(this.getX1(), this.getY2());
        polyline.curveTo(this.getX1(), this.getY2(), //punto incial
                this.getX1()+this.getWidth()/8, this.getY2()+100,//curva
                this.getX1()+this.getWidth()/2, this.getY2());
        polyline.lineTo(this.getX2(), this.getY2());
        polyline.lineTo(this.getX2(), this.getY1());
        polyline.lineTo(this.getX1(), this.getY1());
        g2.draw(polyline);
        if(this.getComando()!=null && !this.getComando().isEmpty()){
            g2.drawString(this.getComando(), (int)(this.getX1()-10+this.getWidth()/2), 
                 (int)(this.getY1()+this.getHeigth()/2));
        }
    }

    @Override
    public Object clonar() {
        Salida salida=new Salida();
        salida.setX1(this.getX1());
        salida.setY1(this.getY1());
        salida.setX2(this.getX2());
        salida.setY2(this.getY2());
        salida.setWidth(this.getWidth());
        salida.setHeigth(this.getHeigth());
        salida.setColor(this.getColor());
        salida.setComando(this.getComando());
        return salida;
    }
    
    
}
