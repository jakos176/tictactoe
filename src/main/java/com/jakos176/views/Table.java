/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jakos176.views;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author edu
 */
public class Table extends javax.swing.JFrame {

    private int actualTurn;
    private final int turnO = 0;
    private final int turnX = 1;

    public Table() {
        initComponents();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(null);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

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
        Square1 = new javax.swing.JLabel();
        Square2 = new javax.swing.JLabel();
        Square3 = new javax.swing.JLabel();
        Square4 = new javax.swing.JLabel();
        Square5 = new javax.swing.JLabel();
        Square6 = new javax.swing.JLabel();
        Square7 = new javax.swing.JLabel();
        Square8 = new javax.swing.JLabel();
        Square9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Square1.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square1.setToolTipText("");
        Square1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square1.setPreferredSize(new java.awt.Dimension(50, 50));
        Square1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Square1MousePressed(evt);
            }
        });

        Square2.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square2.setToolTipText("");
        Square2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square2.setPreferredSize(new java.awt.Dimension(50, 50));
        Square2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Square2MousePressed(evt);
            }
        });

        Square3.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square3.setPreferredSize(new java.awt.Dimension(50, 50));
        Square3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square3MouseClicked(evt);
            }
        });

        Square4.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square4.setPreferredSize(new java.awt.Dimension(50, 50));
        Square4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square4MouseClicked(evt);
            }
        });

        Square5.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square5.setPreferredSize(new java.awt.Dimension(50, 50));
        Square5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square5MouseClicked(evt);
            }
        });

        Square6.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square6.setPreferredSize(new java.awt.Dimension(50, 50));
        Square6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square6MouseClicked(evt);
            }
        });

        Square7.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square7.setPreferredSize(new java.awt.Dimension(50, 50));
        Square7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square7MouseClicked(evt);
            }
        });

        Square8.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square8.setPreferredSize(new java.awt.Dimension(50, 50));
        Square8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square8MouseClicked(evt);
            }
        });

        Square9.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        Square9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Square9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Square9.setPreferredSize(new java.awt.Dimension(50, 50));
        Square9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Square9MouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Square4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Square1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Square7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Square2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Square3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Square5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Square6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Square8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Square9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Square2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Square5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Square6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Square4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Square9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Square1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square1MousePressed
        this.checkTurns(Square1);        // TODO add your handling code here:
    }//GEN-LAST:event_Square1MousePressed

    private void Square2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square2MousePressed
        this.checkTurns(Square2);        // TODO add your handling code here:
    }//GEN-LAST:event_Square2MousePressed

    private void Square3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square3MouseClicked
        this.checkTurns(Square3);        // TODO add your handling code here:
    }//GEN-LAST:event_Square3MouseClicked

    private void Square5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square5MouseClicked
        this.checkTurns(Square5);        // TODO add your handling code here:
    }//GEN-LAST:event_Square5MouseClicked

    private void Square6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square6MouseClicked
        this.checkTurns(Square6);        // TODO add your handling code here:
    }//GEN-LAST:event_Square6MouseClicked

    private void Square7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square7MouseClicked
        this.checkTurns(Square7);        // TODO add your handling code here:
    }//GEN-LAST:event_Square7MouseClicked

    private void Square8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square8MouseClicked
        this.checkTurns(Square8);        // TODO add your handling code here:
    }//GEN-LAST:event_Square8MouseClicked

    private void Square9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square9MouseClicked
        this.checkTurns(Square9);        // TODO add your handling code here:
    }//GEN-LAST:event_Square9MouseClicked

    private void Square4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Square4MouseClicked
        this.checkTurns(Square4);        // TODO add your handling code here:
    }//GEN-LAST:event_Square4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Square1.setText("Maria es tonta");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    private void swapTurns() {
        this.actualTurn = this.actualTurn == this.turnO ? this.turnX : this.turnO;
    }

    private void checkTurns(JLabel label) {
        if(label.getText().isEmpty()){
            if (this.actualTurn == this.turnO) {
            label.setText("O");

        } else {
            label.setText("X");
        }
        this.swapTurns();
     
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Square1;
    private javax.swing.JLabel Square2;
    private javax.swing.JLabel Square3;
    private javax.swing.JLabel Square4;
    private javax.swing.JLabel Square5;
    private javax.swing.JLabel Square6;
    private javax.swing.JLabel Square7;
    private javax.swing.JLabel Square8;
    private javax.swing.JLabel Square9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
