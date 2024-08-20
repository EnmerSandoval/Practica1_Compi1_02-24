/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.practice1.View;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.practice1.Errors.ErrorL;
import org.practice1.Objects.Figure;
import org.practice1.Stats.StatsColor;
import org.practice1.Stats.StatsFigure;
import org.practice1.Stats.StatsMath;

/**
 *
 * @author laptop
 */
public class ObjectsUsedReports extends javax.swing.JFrame {
    private String filePath = "";
    private ArrayList<Figure> figures = new ArrayList<>();
    private ArrayList<StatsMath> statsMaths = new ArrayList<>();
    private StatsColor statsColor = new StatsColor();
    private StatsFigure statsFigure = new StatsFigure();
    private ArrayList<ErrorL> errors = new ArrayList<>();
    private ArrayList<String> messages = new ArrayList<>();
    private String text = "";
    /**
     * Creates new form ObjectsUsedReports
     */
    public ObjectsUsedReports(ArrayList<Figure> figures, ArrayList<StatsMath> statsMath, StatsColor statsColor, StatsFigure statsFigure, String filePath, String text, ArrayList<ErrorL> errors, ArrayList<String> messages) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reporte de Objetos Usados");
        this.figures = figures;
        this.statsMaths = statsMaths;
        this.statsColor = statsColor;
        this.statsFigure = statsFigure;
        this.text = text;
        this.errors = errors;
        this.messages = messages;
        this.filePath = filePath;
        tableObjects();
    }

    public ObjectsUsedReports() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reporte de Objetos Usados");
    }
    

    private void tableObjects(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) (table.getModel());
        defaultTableModel.setNumRows(0);
        
        defaultTableModel.addRow(new Object[]{"Circulo", statsFigure.getCircle()});
        defaultTableModel.addRow(new Object[]{"Cuadrado", statsFigure.getSquare()});
        defaultTableModel.addRow(new Object[]{"Rectangulo", statsFigure.getRectangle()});
        defaultTableModel.addRow(new Object[]{"Linea", statsFigure.getLine()});
        defaultTableModel.addRow(new Object[]{"Poligono", statsFigure.getPolygon()});
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTextArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTextArea.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelTextArea.setText("Reporte de Objetos Usados");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Objeto", "Cantidad de Uso"
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

        jMenuItem1.setText("Exportar a PNG");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exportar a PDF");
        jMenu1.add(jMenuItem2);

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
                .addContainerGap(40, Short.MAX_VALUE))
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
        ViewAnalyzer viewAnalyzer = new ViewAnalyzer(figures, statsMaths, statsColor, statsFigure, filePath, text, errors, messages);
        viewAnalyzer.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(ObjectsUsedReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectsUsedReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectsUsedReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectsUsedReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjectsUsedReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTextArea;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
