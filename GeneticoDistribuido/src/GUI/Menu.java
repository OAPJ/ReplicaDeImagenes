/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import HerramientasImagenes.Conversion;
import HerramientasImagenes.JFrameImagen;
import io.ImageManager;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * Nombres: Miguel Angel Cervantes Garcia, Juan Antonio Ovalle Patiño
 * Matriculas: 2017670201, 2017670891
 * Tema del programa: Algortimo Genetico Distribuido
 * Descripcion: Es un algorutmo genetico que trata de recrear la imagen que se escogio, y diferentes computadoras
 *              van a resolver un cal¿nal en especial y al final se manda al maestro para crear la imagen resultante.
 * Fecha: 3 / Junio / 2019
 * Programa Academico: Ingenieria en Sistemas Computacionales
 * Aprendizaje: Aplicaciones para Comunicaciones de Red & Algoritmos Geneticos
 * 
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.buttonGroup1.add(jRadioButton1);
        this.jRadioButton1.setActionCommand("rojo");
        this.buttonGroup1.add(jRadioButton2);
        this.jRadioButton2.setActionCommand("verde");
        this.buttonGroup1.add(jRadioButton3);
        this.jRadioButton3.setActionCommand("azul");
        
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/fondo2.png"));
        Icon fond = new ImageIcon(icon.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fond);
        
        icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/comenzar.gif"));
        Icon start = new ImageIcon(icon.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_DEFAULT));
        jButton1.setIcon(start);
        
        icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/close.png"));
        Icon clos = new ImageIcon(icon.getScaledInstance(this.close.getWidth(), this.close.getHeight(), Image.SCALE_DEFAULT));
        close.setIcon(clos);
        
        icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/barra.png"));
        Icon ba = new ImageIcon(icon.getScaledInstance(barra.getWidth(), barra.getHeight(), Image.SCALE_DEFAULT));
        jButton1.setIcon(start);
        mover mml = new mover(barra);
        barra.addMouseListener(mml);
        barra.addMouseMotionListener(mml);
        barra.setIcon(ba);
        barra.setOpaque(true);
        barra.setSize(780, 20);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setText("Rojo (Maestro)");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jRadioButton2.setForeground(new java.awt.Color(0, 255, 0));
        jRadioButton2.setText("Verde");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jRadioButton3.setForeground(new java.awt.Color(0, 170, 255));
        jRadioButton3.setText("Azul");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 90, 40));

        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 30));

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 59, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puerto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 30));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 10));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 500, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i;
        try{
            if((i=Integer.parseInt(this.jTextField1.getText()))>1024){
                Image imagen = ImageManager.openImage();
                Conversion.imagenAMatriz(imagen);
                new JFrameImagen(imagen);
                switch(this.buttonGroup1.getSelection().getActionCommand()){
                    case "rojo":
                        new Maestro(i, imagen).setVisible(true);
                        this.dispose();
                        break;
                    case "verde":
                        new Secundario(Conversion.CanalColor.VERDE, i, imagen).setVisible(true);
                        this.dispose();
                        break;
                    case "azul":
                        new Secundario(Conversion.CanalColor.AZUL, i, imagen).setVisible(true);
                        this.dispose();
                        break;
                    default:
                        break;
                }
            }
            else JOptionPane.showMessageDialog(null,"Elija una opcion");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Escriba un puerto valido");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Elija una opcion");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //CLOSE
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
