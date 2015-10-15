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
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author root
 */
public class Condicional extends Figura{

    public Condicional(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
    }

    public Condicional() {
    }
    

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
       this.setWidth(this.getX2()-this.getX1());
       this.setHeigth(this.getY2()-this.getY1());
       
       GeneralPath polygon = 
        new GeneralPath(GeneralPath.WIND_NON_ZERO,
                        4);
       polygon.moveTo(this.getX1()+this.getWidth()/2,this.getY1());
       polygon.lineTo(this.getX1(), this.getY1()+this.getHeigth()/2);
       polygon.lineTo(this.getX1()+this.getWidth()/2, this.getY2());
       polygon.lineTo(this.getX2(), this.getY2()-this.getHeigth()/2);
       polygon.lineTo(this.getX1()+this.getWidth()/2,this.getY1());
       polygon.closePath();
       g2.draw(polygon);
       if(!this.getComando().isEmpty()){
            g2.drawString(this.getComando(), (int)(this.getX1()-10+this.getWidth()/2), 
                 (int)(this.getY1()+this.getHeigth()/2));
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Condicional condicional=new Condicional();
        condicional.setX1(this.getX1());
        condicional.setY1(this.getY1());
        condicional.setX2(this.getX2());
        condicional.setY2(this.getY2());
        condicional.setWidth(this.getWidth());
        condicional.setHeigth(this.getHeigth());
        condicional.setColor(this.getColor());
        return condicional;
    }
    
    
}
