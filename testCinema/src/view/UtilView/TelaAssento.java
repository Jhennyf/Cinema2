/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.UtilView;

import Controler.AssentoControler;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.Assento;

/**
 *
 * @author jhenn
 */
public class TelaAssento extends javax.swing.JFrame {

    private int cadeira;
    AssentoControler controler = new AssentoControler();
    PagCinema pagamento = new PagCinema(this, cadeira);

    /**
     * Creates new form Assentos
     */
    public TelaAssento() {
        initComponents();
    }

    public AssentoControler getControler() {
        return controler;
    }

    public void setControler(AssentoControler controler) {
        this.controler = controler;
    }

    public JRadioButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JRadioButton btn1) {
        this.btn1 = btn1;
    }

    public JRadioButton getBtn10() {
        return btn10;
    }

    public void setBtn10(JRadioButton btn10) {
        this.btn10 = btn10;
    }

    public JRadioButton getBtn11() {
        return btn11;
    }

    public void setBtn11(JRadioButton btn11) {
        this.btn11 = btn11;
    }

    public JRadioButton getBtn12() {
        return btn12;
    }

    public void setBtn12(JRadioButton btn12) {
        this.btn12 = btn12;
    }

    public JRadioButton getBtn13() {
        return btn13;
    }

    public void setBtn13(JRadioButton btn13) {
        this.btn13 = btn13;
    }

    public JRadioButton getBtn14() {
        return btn14;
    }

    public void setBtn14(JRadioButton btn14) {
        this.btn14 = btn14;
    }

    public JRadioButton getBtn15() {
        return btn15;
    }

    public void setBtn15(JRadioButton btn15) {
        this.btn15 = btn15;
    }

    public JRadioButton getBtn16() {
        return btn16;
    }

    public void setBtn16(JRadioButton btn16) {
        this.btn16 = btn16;
    }

    public JRadioButton getBtn17() {
        return btn17;
    }

    public void setBtn17(JRadioButton btn17) {
        this.btn17 = btn17;
    }

    public JRadioButton getBtn18() {
        return btn18;
    }

    public void setBtn18(JRadioButton btn18) {
        this.btn18 = btn18;
    }

    public JRadioButton getBtn19() {
        return btn19;
    }

    public void setBtn19(JRadioButton btn19) {
        this.btn19 = btn19;
    }

    public JRadioButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JRadioButton btn2) {
        this.btn2 = btn2;
    }

    public JRadioButton getBtn20() {
        return btn20;
    }

    public void setBtn20(JRadioButton btn20) {
        this.btn20 = btn20;
    }

    public JRadioButton getBtn21() {
        return btn21;
    }

    public void setBtn21(JRadioButton btn21) {
        this.btn21 = btn21;
    }

    public JRadioButton getBtn22() {
        return btn22;
    }

    public void setBtn22(JRadioButton btn22) {
        this.btn22 = btn22;
    }

    public JRadioButton getBtn23() {
        return btn23;
    }

    public void setBtn23(JRadioButton btn23) {
        this.btn23 = btn23;
    }

    public JRadioButton getBtn24() {
        return btn24;
    }

    public void setBtn24(JRadioButton btn24) {
        this.btn24 = btn24;
    }

    public JRadioButton getBtn25() {
        return btn25;
    }

    public void setBtn25(JRadioButton btn25) {
        this.btn25 = btn25;
    }

    public JRadioButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JRadioButton btn3) {
        this.btn3 = btn3;
    }

    public JRadioButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JRadioButton btn4) {
        this.btn4 = btn4;
    }

    public JRadioButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JRadioButton btn5) {
        this.btn5 = btn5;
    }

    public JRadioButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JRadioButton btn6) {
        this.btn6 = btn6;
    }

    public JRadioButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JRadioButton btn7) {
        this.btn7 = btn7;
    }

    public JRadioButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JRadioButton btn8) {
        this.btn8 = btn8;
    }

    public JRadioButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JRadioButton btn9) {
        this.btn9 = btn9;
    }

    public JLabel getBtnOne() {
        return btnOne;
    }

    public void setBtnOne(JLabel btnOne) {
        this.btnOne = btnOne;
    }

    public JButton getBtnPagamento() {
        return btnPagamento;
    }

    public void setBtnPagamento(JButton btnPagamento) {
        this.btnPagamento = btnPagamento;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
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
        btn17 = new javax.swing.JRadioButton();
        btn18 = new javax.swing.JRadioButton();
        btn19 = new javax.swing.JRadioButton();
        btn20 = new javax.swing.JRadioButton();
        btn21 = new javax.swing.JRadioButton();
        btn22 = new javax.swing.JRadioButton();
        btn23 = new javax.swing.JRadioButton();
        btn24 = new javax.swing.JRadioButton();
        btn25 = new javax.swing.JRadioButton();
        btn14 = new javax.swing.JRadioButton();
        btn15 = new javax.swing.JRadioButton();
        btn16 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JRadioButton();
        btnOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        buttonGroup1.add(btn5);
        btn5.setText("5");
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        buttonGroup1.add(btn6);
        btn6.setText("6");
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        buttonGroup1.add(btn7);
        btn7.setText("7");
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        buttonGroup1.add(btn8);
        btn8.setText("8");
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        buttonGroup1.add(btn9);
        btn9.setText("9");
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        buttonGroup1.add(btn10);
        btn10.setText("10");
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        buttonGroup1.add(btn11);
        btn11.setText("11");
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        buttonGroup1.add(btn12);
        btn12.setText("12");
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        buttonGroup1.add(btn13);
        btn13.setText("13");
        btn13.setToolTipText("13");
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        btn17.setText("5");
        jPanel1.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btn18.setText("6");
        jPanel1.add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        btn19.setText("7");
        jPanel1.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        btn20.setText("8");
        jPanel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        btn21.setText("9");
        jPanel1.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        btn22.setText("10");
        jPanel1.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        btn23.setText("11");
        jPanel1.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        btn24.setText("12");
        jPanel1.add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        btn25.setText("13");
        btn25.setToolTipText("13");
        jPanel1.add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        buttonGroup1.add(btn14);
        btn14.setText("14");
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        buttonGroup1.add(btn15);
        btn15.setText("15");
        jPanel1.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        buttonGroup1.add(btn16);
        btn16.setText("16");
        jPanel1.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        buttonGroup1.add(btn4);
        btn4.setText("4");
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        buttonGroup1.add(btn3);
        btn3.setText("3");
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        buttonGroup1.add(btn2);
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        buttonGroup1.add(btn1);
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
        if (btn1.isSelected()) {
            setCadeira(1);
            btn1.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn2.isSelected()) {
            setCadeira(2);
            btn2.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn3.isSelected()) {
            setCadeira(3);
            btn3.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn4.isSelected()) {
            setCadeira(4);
            btn4.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn5.isSelected()) {
            setCadeira(5);
            btn5.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn6.isSelected()) {
            setCadeira(6);
            btn6.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn7.isSelected()) {
            setCadeira(7);
            btn7.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn8.isSelected()) {
            setCadeira(8);
            btn8.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn9.isSelected()) {
            setCadeira(9);
            btn9.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn10.isSelected()) {
            setCadeira(10);
            btn10.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn11.isSelected()) {
            setCadeira(11);
            btn11.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn12.isSelected()) {
            setCadeira(12);
            btn12.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn13.isSelected()) {
            setCadeira(13);
            btn13.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn14.isSelected()) {
            setCadeira(14);
            btn14.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn15.isSelected()) {
            setCadeira(15);
            btn15.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn16.isSelected()) {
            setCadeira(16);
            btn16.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn17.isSelected()) {
            setCadeira(17);
            btn17.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn18.isSelected()) {
            setCadeira(18);
            btn18.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        } else if (btn19.isSelected()) {
            setCadeira(19);
            btn19.setSelected(false);
            pagamento.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    public void selecionar() {

    }

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
    private javax.swing.JRadioButton btn17;
    private javax.swing.JRadioButton btn18;
    private javax.swing.JRadioButton btn19;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn20;
    private javax.swing.JRadioButton btn21;
    private javax.swing.JRadioButton btn22;
    private javax.swing.JRadioButton btn23;
    private javax.swing.JRadioButton btn24;
    private javax.swing.JRadioButton btn25;
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
