/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ghgj;

/**
 *
 * @author nasuu
 */
public class AtmThird extends javax.swing.JFrame {
    public AtmThird() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balanceLB = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        hello = new javax.swing.JLabel();
        thirdBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balanceLB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        balanceLB.setText("BALANCE : ");
        getContentPane().add(balanceLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        withdraw.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 40));

        deposit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deposit.setText("DEPOSIT");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, 40));

        hello.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        hello.setText("hello,");
        getContentPane().add(hello, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 46, 220, 30));

        thirdBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/third.gif"))); // NOI18N
        thirdBG.setText("jLabel1");
        getContentPane().add(thirdBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public double Realbalance = 0.00;
    
    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        deposit jf4 = new deposit();
        jf4.show();
        dispose();
    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        witdhraw jf5 = new witdhraw();
        jf5.show();
        dispose();
    }//GEN-LAST:event_withdrawActionPerformed
   
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
            java.util.logging.Logger.getLogger(AtmThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmThird().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel balanceLB;
    private javax.swing.JButton deposit;
    public javax.swing.JLabel hello;
    private javax.swing.JLabel thirdBG;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
