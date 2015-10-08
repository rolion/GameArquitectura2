/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import Interface.Figura;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 *
 * @author root
 */
public class circulo implements Figura{
    private double x;
    private double y;
    private double w;
    private double h;

    public circulo(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    
//     public void paint(Graphics g){
//        Graphics2D g2 = (Graphics2D) g;
//        g2.draw(new Line2D.Double(200, 300, 250, 350));
//        g2.draw(new Ellipse2D.Double(x, y, w, h));
//     }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line2D.Double(200, 300, 250, 350));
        g2.draw(new Ellipse2D.Double(x, y, w, h));
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
