/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spos.controller;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class frmSPOSAdvertise extends javax.swing.JFrame 
{
    private final Image image;
   

    public frmSPOSAdvertise()
    {
        initComponents();     
        image = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir")+"/src/com/spos/images/OS_image.gif");
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelLayout = new javax.swing.JPanel();
        panelbody = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);

        panelLayout.setBackground(new java.awt.Color(255, 255, 255));
        panelLayout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLayout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLayout.setMinimumSize(new java.awt.Dimension(800, 600));
        panelLayout.setLayout(new java.awt.GridBagLayout());

        panelbody.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelbody.setMinimumSize(new java.awt.Dimension(800, 600));
        panelbody.setOpaque(false);
        panelbody.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spos/images/SanguineSolutions800x600.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout panelbodyLayout = new javax.swing.GroupLayout(panelbody);
        panelbody.setLayout(panelbodyLayout);
        panelbodyLayout.setHorizontalGroup(
            panelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbodyLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelbodyLayout.setVerticalGroup(
            panelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbodyLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        panelLayout.add(panelbody, gridBagConstraints);

        getContentPane().add(panelLayout, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelLayout;
    private javax.swing.JPanel panelbody;
    // End of variables declaration//GEN-END:variables

   
}
