/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.practice1.View;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.practice1.Objects.Figure;
import org.practice1.Stats.StatsColor;
import org.practice1.Stats.StatsFigure;
import org.practice1.Stats.StatsMath;
import utils.Util;

/**
 *
 * @author laptop
 */
public class AnimationUsedReport extends javax.swing.JFrame {
    private ArrayList<Figure> figures = new ArrayList<>();
    private ArrayList<StatsMath> statsMaths = new ArrayList<>();
    private StatsColor statsColor = new StatsColor();
    private StatsFigure statsFigure = new StatsFigure();
    
    
    /**
     * Creates new form ObjectsUsedReports
     */
    public AnimationUsedReport(ArrayList<Figure> figures, ArrayList<StatsMath> statsMaths, StatsColor statsColor, StatsFigure statsFigure) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Animaciones Utilizadas");
        this.figures = figures;
        this.statsMaths = statsMaths;
        this.statsColor = statsColor;
        this.statsFigure = statsFigure;
        tableReport();
    }
    
    private void tableReport(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setRowCount(0);
        
        defaultTableModel.addRow(new Object[]{"Linea", statsFigure.getLineAnimation()});
        defaultTableModel.addRow(new Object[]{"Curva", statsFigure.getCurveAnimation()});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTextArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemExportToPNG = new javax.swing.JMenuItem();
        itemExportToPDF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTextArea.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelTextArea.setText("Reporte de Animaciones Usadas");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Animacion", "Cantidad de Uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Exportar");

        itemExportToPNG.setText("Exportar a PNG");
        itemExportToPNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExportToPNGActionPerformed(evt);
            }
        });
        jMenu1.add(itemExportToPNG);

        itemExportToPDF.setText("Exportar a PDF");
        itemExportToPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExportToPDFActionPerformed(evt);
            }
        });
        jMenu1.add(itemExportToPDF);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(labelTextArea)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTextArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemExportToPNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExportToPNGActionPerformed
        // TODO add your handling code here:
        Util.exportTableToPNG(table);
    }//GEN-LAST:event_itemExportToPNGActionPerformed

    private void itemExportToPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExportToPDFActionPerformed
        // TODO add your handling code here:
        Util.exportTableToPDF(table, "Animaciones Utilizadas");
    }//GEN-LAST:event_itemExportToPDFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAnalyzer viewAnalyzer = new ViewAnalyzer(figures, statsMaths, statsColor, statsFigure);
        viewAnalyzer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemExportToPDF;
    private javax.swing.JMenuItem itemExportToPNG;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTextArea;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
