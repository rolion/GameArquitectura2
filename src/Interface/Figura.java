/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author root
 */
public abstract class Figura  {
    private double x;
    private double y;
    private double width;
    private double heigth;
    private Color color;

    public Figura(double x, double y, double width, double heigth, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    public Figura() {
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

   
    
    
    public abstract void paint(Graphics g);
}
