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
public class GamePanel implements Figura{

    private double x;
    private double y;
    private double width;
    private double heigth;
    private Color color;

    public GamePanel(double x, double y, double width, double heigth, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    public GamePanel() {
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public void paint(Graphics g) {
          Graphics2D g2 = (Graphics2D) g;
         // g2.setBackground(this.color);
          g2.draw(new Rectangle2D.Double(this.x,this.y,this.width,this.heigth));
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
