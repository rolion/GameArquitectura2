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

    private ArrayList listaFigura;
    private Memento memento;

    public Contenedor(ArrayList listaFiguras) {
        this.listaFigura=listaFiguras;
        
    }
    public Contenedor() {
        this.listaFigura=new ArrayList();
        
    }

    public ArrayList getListaFigura() {
        return listaFigura;
    }

    public void setListaFigura(ArrayList listaFigura) {
        this.listaFigura = listaFigura;
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
    public Memento getMemento() {
        this.memento=new Memento(this.clonar());
        return this.memento;
    }
    public void setMemento(Object o){
        if(o instanceof Memento){
            this.memento= (Memento) o;
            Contenedor c=(Contenedor) memento.getMemento();
            this.listaFigura= c.getListaFigura();
        }
    }

    @Override
    public Object clonar() {
        ArrayList clon=new ArrayList();
        for (Object figura : this.listaFigura) {
            Figura f=(Figura)figura;
            clon.add(f.clonar());
        }
        return new Contenedor(clon);
    }
    private class Memento{
        private Object memento;

        public Memento() {
            this.memento=null;
        }

        public Memento(Object memento) {
            this.memento = memento;
        }
        
        public void setMemento(Object o){
            this.memento=o;
        }
        public Object getMemento(){
            return this.memento;
        }
    }
    
    
}
