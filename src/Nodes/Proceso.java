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
        this.setWidth(this.getX2()-this.getX1());
        this.setHeigth(this.getY2()-this.getY1());
        g2.draw(new Line2D.Double(this.getX1(), this.getY1(),
                this.getX1()-dif, this.getY2()));
        g2.draw(new Line2D.Double(this.getX1()-dif, this.getY2(),
            this.getX2(), this.getY2()));
        g2.draw(new Line2D.Double(this.getX2(), this.getY2(),
            this.getX2()+dif, this.getY1()));
        g2.draw(new Line2D.Double(this.getX2()+dif, this.getY1(),
            this.getX1(), this.getY1()));
        if(this.getComando()!=null && !this.getComando().isEmpty()){
            g2.drawString(this.getComando(), (int)(this.getX1()-10+this.getWidth()/2), 
                 (int)(this.getY1()+this.getHeigth()/2));
        }
    }  

    @Override
    public Object clonar() {
        Proceso proceso=new Proceso();
        proceso.setX1(this.getX1());
        proceso.setY1(this.getY1());
        proceso.setX2(this.getX2());
        proceso.setY2(this.getY2());
        proceso.setWidth(this.getWidth());
        proceso.setHeigth(this.getHeigth());
        proceso.setColor(this.getColor());
        proceso.setComando(this.getComando());
        return proceso;        
    }

    
    
}
