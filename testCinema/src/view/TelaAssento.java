/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controler.AssentoControler;
import model.Assento;

/**
 *
 * @author jhenn
 */
public class TelaAssento extends javax.swing.JFrame {
    AssentoControler controler = new AssentoControler();

    /**
     * Creates new form Assentos
     */
    public TelaAssento() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        btnPagamento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn5 = new javax.swing.JRadioButton();
        btn6 = new javax.swing.JRadioButton();
        btn7 = new javax.swing.JRadioButton();
        btn8 = new javax.swing.JRadioButton();
        btn9 = new javax.swing.JRadioButton();
        btn10 = new javax.swing.JRadioButton();
        btn11 = new javax.swing.JRadioButton();
        btn12 = new javax.swing.JRadioButton();
        btn13 = new javax.swing.JRadioButton();
        btn14 = new javax.swing.JRadioButton();
        btn15 = new javax.swing.JRadioButton();
        btn16 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JRadioButton();
        btnOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagamento.setBackground(new java.awt.Color(153, 0, 0));
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setText("Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Assentos CineVibe");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 370, 50));

        btn5.setText("5");
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btn6.setText("6");
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        btn7.setText("7");
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        btn8.setText("8");
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        btn9.setText("9");
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        btn10.setText("10");
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        btn11.setText("11");
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        btn12.setText("12");
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        btn13.setText("13");
        btn13.setToolTipText("13");
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        btn14.setText("14");
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btn15.setText("15");
        jPanel1.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        btn16.setText("16");
        jPanel1.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        btn4.setText("4");
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        btn3.setText("3");
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 40, 30));

        btnOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/assentos.png"))); // NOI18N
        jPanel1.add(btnOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        new PagCinema().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Assento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaAssento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn10;
    private javax.swing.JRadioButton btn11;
    private javax.swing.JRadioButton btn12;
    private javax.swing.JRadioButton btn13;
    private javax.swing.JRadioButton btn14;
    private javax.swing.JRadioButton btn15;
    private javax.swing.JRadioButton btn16;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JRadioButton btn6;
    private javax.swing.JRadioButton btn7;
    private javax.swing.JRadioButton btn8;
    private javax.swing.JRadioButton btn9;
    private javax.swing.JLabel btnOne;
    private javax.swing.JButton btnPagamento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}