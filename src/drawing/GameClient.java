/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;



import Interface.Figura;
import Interface.MouseConnector;
import Nodes.Bucle;
import Nodes.Condicional;
import Nodes.Contenedor;
import Nodes.Entrada;
import Nodes.Fin;
import Nodes.Inicio;
import Nodes.LineaFlujo;
import Nodes.Proceso;
import Nodes.Salida;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class GameClient extends javax.swing.JFrame implements MouseConnector{

    /**
     * Creates new form NewJFrame
     */
    private MyMouse myMouse;
    private Figura figura;
    private Contenedor mContenedor;
    private Rectangle limites;
    private StateHolder concerje;
    public GameClient() {
        initComponents();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        double xSize = ( tk.getScreenSize().getWidth());
        double ySize = ( tk.getScreenSize().getHeight());
        myMouse=new MyMouse();
        myMouse.setmMouseConector(this);
        this.addMouseListener(this.myMouse);
        this.addMouseMotionListener(this.myMouse);
        this.concerje=new StateHolder();
        this.mContenedor=new Contenedor();
        this.concerje.addMemento(this.mContenedor.getMemento());
        this.limites=this.jPanel2.getBounds();

    }

    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        this.mContenedor.paint(g);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBlinea = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jBFIn = new javax.swing.JButton();
        jBEntrada = new javax.swing.JButton();
        jBProceso = new javax.swing.JButton();
        jBCondicional = new javax.swing.JButton();
        jBBucle = new javax.swing.JButton();
        jBSalida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Figuras"));
        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jBlinea.setText("Linea Flujo");
        jBlinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlineaActionPerformed(evt);
            }
        });
        jPanel1.add(jBlinea);

        jBInicio.setText("Inicio");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        jPanel1.add(jBInicio);

        jBFIn.setText("FIn");
        jBFIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFInActionPerformed(evt);
            }
        });
        jPanel1.add(jBFIn);

        jBEntrada.setText("Entrada");
        jBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(jBEntrada);

        jBProceso.setText("Proceso");
        jBProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(jBProceso);

        jBCondicional.setText("Condicional");
        jBCondicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCondicionalActionPerformed(evt);
            }
        });
        jPanel1.add(jBCondicional);

        jBBucle.setText("Bucle");
        jBBucle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBucleActionPerformed(evt);
            }
        });
        jPanel1.add(jBBucle);

        jBSalida.setText("Salida");
        jBSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalida);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back57.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/forward18.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBlineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlineaActionPerformed
        this.figura=new LineaFlujo();
    }//GEN-LAST:event_jBlineaActionPerformed

    private void jBEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntradaActionPerformed
       this.figura=new Entrada();
       this.figura.setComando(JOptionPane.showInputDialog(this, "Parametro", "Entrada", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_jBEntradaActionPerformed

    private void jBProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProcesoActionPerformed
        this.figura=new Proceso();
        this.figura.setComando(JOptionPane.showInputDialog(this, "Parametro", "Proceso", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_jBProcesoActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        this.figura=new Inicio();
        
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBFInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFInActionPerformed
        this.figura=new Fin();
    }//GEN-LAST:event_jBFInActionPerformed

    private void jBBucleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBucleActionPerformed
        this.figura=new Bucle();
        this.figura.setComando(JOptionPane.showInputDialog(this, "Parametro", "Bucle", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_jBBucleActionPerformed

    private void jBCondicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCondicionalActionPerformed
        this.figura=new Condicional();
        this.figura.setComando(JOptionPane.showInputDialog(this, "Parametro", "Condicion", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_jBCondicionalActionPerformed

    private void jBSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalidaActionPerformed
        // TODO add your handling code here:
        this.figura=new Salida();
        this.figura.setComando(JOptionPane.showInputDialog(this, "Parametro", "Salida", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_jBSalidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object memento =this.concerje.moveBackWard();
        this.mContenedor.setMemento(memento);
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object memento =this.concerje.moveForWard();
        this.mContenedor.setMemento(memento);
        this.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameClient frame=new GameClient();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBucle;
    private javax.swing.JButton jBCondicional;
    private javax.swing.JButton jBEntrada;
    private javax.swing.JButton jBFIn;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBProceso;
    private javax.swing.JButton jBSalida;
    private javax.swing.JButton jBlinea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void initFigura(double x, double y) {
        if(this.figura!=null){
            if(x>=this.limites.getX() && y>=this.limites.getY()){
                this.figura.setX1(x);
                this.figura.setY1(y);
            }else{
                System.out.println("Esta fuera del limite");
            }
            
        }
    }

    @Override
    public void endFigura(double x, double y) {
        if(this.figura!=null){

            this.figura.setX2(x);
            this.figura.setY2(y);
            this.mContenedor.addFigura(figura);
            this.concerje.addMemento(this.mContenedor.getMemento());
            this.figura=null;
            this.repaint();
        }
    }


}
