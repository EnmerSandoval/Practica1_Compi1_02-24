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
public class ColorsUsedReport extends javax.swing.JFrame {
    private ArrayList<Figure> figures = new ArrayList<>();
    private ArrayList<StatsMath> statsMaths = new ArrayList<>();
    private StatsColor statsColor = new StatsColor();
    private StatsFigure statsFigure = new StatsFigure();
    
    
    /**
     * Creates new form ColorsUsedReport
     */
    public ColorsUsedReport(ArrayList<Figure> figures, ArrayList<StatsMath> statsMaths, StatsColor statsColor, StatsFigure statsFigure) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reporte Colores Utilizados");
        this.figures = figures;
        this.statsMaths = statsMaths;
        this.statsColor = statsColor;
        this.statsFigure = statsFigure;
        table();
    }

    public ColorsUsedReport() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reporte Colores Utilizados");
    }
    
    
    
    public void table(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        defaultTableModel.setRowCount(0);
        
        defaultTableModel.addRow(new Object[]{"Azul", statsColor.getBlue()});
        defaultTableModel.addRow(new Object[]{"Rojo", statsColor.getRed()});
        defaultTableModel.addRow(new Object[]{"Amarillo", statsColor.getYellow()});
        defaultTableModel.addRow(new Object[]{"Verde", statsColor.getGreen()});
        defaultTableModel.addRow(new Object[]{"Naranja", statsColor.getOrange()});
        defaultTableModel.addRow(new Object[]{"Gris", statsColor.getGray()});
        defaultTableModel.addRow(new Object[]{"Celeste", statsColor.getCyan()});
        defaultTableModel.addRow(new Object[]{"Rosado", statsColor.getPink()});
        defaultTableModel.addRow(new Object[]{"Negro", statsColor.getBlack()});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTextArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemExportToPNG = new javax.swing.JMenuItem();
        itemExportToPDF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTextArea.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelTextArea.setText("Reporte de Colores Usados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Color", "Cantidad de Uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTextArea)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAnalyzer viewAnalyzer = new ViewAnalyzer(figures, statsMaths, statsColor, statsFigure);
        viewAnalyzer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemExportToPNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExportToPNGActionPerformed
        // TODO add your handling code here:
        Util.exportTableToPNG(jTable1);
    }//GEN-LAST:event_itemExportToPNGActionPerformed

    private void itemExportToPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExportToPDFActionPerformed
        // TODO add your handling code here:
        Util.exportTableToPDF(jTable1, "Colores Usados");
    }//GEN-LAST:event_itemExportToPDFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemExportToPDF;
    private javax.swing.JMenuItem itemExportToPNG;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTextArea;
    // End of variables declaration//GEN-END:variables
}
