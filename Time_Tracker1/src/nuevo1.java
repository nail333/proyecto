/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAIL
 */
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import javax.swing.Timer;
public class nuevo1 extends javax.swing.JFrame {
    public static LinkedList contenedor= new LinkedList();
    public int buscar;
//javax.swing.JFrame
    /**
     * Creates new form nuevo1
     */
    
    private Timer mTime;
    private int dias=0;
    private int horas=0;
    private int minutos=0;
    private int segundos=0;
    private int milisegundos=0;
   DefaultTableModel modelo;
    public nuevo1() {
    //   initComponents();
        mTime = new Timer(10, (ActionEvent e)-> {
          empezarrcrono();
        });
         
        }        
        private void empezarrcrono(){
            ActualizaTime();
            ActualizaLabel();
        }
        private void ActualizaTime(){
            milisegundos++;
        }
        private void ActualizaLabel(){
            
        }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   String proyecto= jTextField1.getText();
   String estatus= jComboBox1.getSelectedItem().toString();
   String duracion=jLabel3.getText();

   time Clasetime= new time(proyecto,estatus,duracion);
   contenedor.add(Clasetime);
   App1 sc= new  App1();
        sc.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nuevo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
