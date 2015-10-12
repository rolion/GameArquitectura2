/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import Interface.MouseConnector;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author root
 */
public class MyMouse extends MouseInputAdapter{

    private MouseConnector mMouseConector;

    public void setmMouseConector(MouseConnector mMouseConector) {
        this.mMouseConector = mMouseConector;
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        System.out.println("Mouse Dragged");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        System.out.println("Mouse Released");
        if(this.mMouseConector!=null){
            this.mMouseConector.endFigura(e.getPoint().getX(), 
                    e.getPoint().getY());
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        e.getLocationOnScreen().getX();
       System.out.println("Mouse Pressed");
        if(this.mMouseConector!=null){
            this.mMouseConector.initFigura(e.getPoint().getX(), 
                    e.getPoint().getY());
        }
       
    }

    
    
}
