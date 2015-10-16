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
        if(this.getComando()!=null && !this.getComando().isEmpty()){
            g2.drawString(this.getComando(), (int)(this.getX1()-10+this.getWidth()/2), 
                 (int)(this.getY1()+this.getHeigth()/2));
        }
    }
    @Override
    public Object clonar() {
        Entrada entrada=new Entrada();
        entrada.setX1(this.getX1());
        entrada.setY1(this.getY1());
        entrada.setX2(this.getX2());
        entrada.setY2(this.getY2());
        entrada.setWidth(this.getWidth());
        entrada.setHeigth(this.getHeigth());
        entrada.setColor(this.getColor());
        entrada.setComando(this.getComando());
        return entrada;
    }

    
}
