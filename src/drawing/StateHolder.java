
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class StateHolder {
    private ArrayList mementos;
    private int puntero;

    public StateHolder() {
        this.mementos=new ArrayList();
        this.puntero=-1;
    }

    public StateHolder(ArrayList mementos) {
        this.mementos = mementos;
        this.puntero=this.mementos.size()-1;
    }
    public void addMemento(Object o){
        this.mementos.add( o);
        this.puntero=this.mementos.size()-1;
    }
    public Object moveBackWard(){//vuelve a un estado anterior al actual
        switch(this.puntero){
            case -1: return null;
            case 0: return null;
            default:
                    this.puntero--;
                    if(this.puntero>=0)
                        return this.mementos.get(puntero);
                    else
                        return null;
        }
    }
    public Object moveForWard(){//vuelve a un estado adelante del actual
        if(!this.mementos.isEmpty()){
            if(this.puntero<this.mementos.size()-1){
                this.puntero++;
                return this.mementos.get(puntero);
            }
        }
            return null;
    }
    
}
