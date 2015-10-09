/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

import Interface.Figura;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Contenedor extends Figura{

    private List listaFigura;

    public Contenedor(double x, double y, double width, double heigth, Color color) {
        super(x, y, width, heigth, color);
        this.listaFigura=new ArrayList();
    }

    public Contenedor() {
        this.listaFigura=new ArrayList();
    }
    
    public void addFigura(Figura f){
        this.listaFigura.add(f);
    }
    @Override
    public void paint(Graphics g) {
        for (Object f : listaFigura) {
                Figura figura=(Figura) f;
                figura.paint(g);
        }
    }

    
    
}
