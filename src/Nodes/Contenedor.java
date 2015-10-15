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
    public ContenedorMemento getMemento() throws CloneNotSupportedException{
        return new ContenedorMemento(this.clone());
    }
    public void setMemento(Object o){
        if(o instanceof ContenedorMemento){
            ContenedorMemento memento= (ContenedorMemento) o;
            this.listaFigura= ((Contenedor) memento.getMemento()).getListaFigura();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
            
        Contenedor contenedor=new Contenedor( (ArrayList)this.listaFigura.clone());
        return contenedor;
    }
    private class ContenedorMemento{
        private Object memento;

        public ContenedorMemento() {
        }

        public ContenedorMemento(Object memento) {
            this.memento = memento;
        }
        
        public void setMemento(Object o){
            this.memento=0;
        }
        public Object getMemento(){
            return this.memento;
        }
    }
    
    
}
