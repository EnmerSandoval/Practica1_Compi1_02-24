/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.practice1.View;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

//import org.practice1.Cup.Parser;
//import org.practice1.Lexer.Lexer;
import org.practice1.Cup.Parser;
import org.practice1.Lexer.Lexer;
import org.practice1.Objects.*;
import org.practice1.Objects.Panels.PanelCircle;
import org.practice1.Objects.Panels.PanelSquare;
import org.practice1.Stats.*;


/**
 *
 * @author laptop
 */
public class ViewAnalyzer extends javax.swing.JFrame {
    private ArrayList<Figure> figures = new ArrayList<>();
    private ArrayList<StatsMath> statsMaths = new ArrayList<>();
    private StatsColor statsColor = new StatsColor();
    private StatsFigure statsFigure = new StatsFigure();
    
    /**
     * Creates new form ViewAnalyzer
     */
    public ViewAnalyzer() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Compilador");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        labelTextArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        labelConsole = new javax.swing.JLabel();
        buttonCompiler = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemNewFile = new javax.swing.JMenuItem();
        itemSaveFile = new javax.swing.JMenuItem();
        itemUploadFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemOccurrence = new javax.swing.JMenuItem();
        itemColorUsed = new javax.swing.JMenuItem();
        itemObjectsUsted = new javax.swing.JMenuItem();
        itemAnimationsUsed = new javax.swing.JMenuItem();
        itemErrors = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTextArea.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelTextArea.setText("Área de Texto");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        labelConsole.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelConsole.setText("Consola");

        buttonCompiler.setText("Compilar");
        buttonCompiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompilerActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setText("Linea:");

        jLabel2.setText("Columna:");

        jMenu1.setText("Archivo");

        itemNewFile.setText("Nuevo Archivo");
        jMenu1.add(itemNewFile);

        itemSaveFile.setText("Guardar Archivo");
        jMenu1.add(itemSaveFile);

        itemUploadFile.setText("Cargar Archivo de texto");
        itemUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUploadFileActionPerformed(evt);
            }
        });
        jMenu1.add(itemUploadFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        itemOccurrence.setText("Ocurrencia");
        jMenu2.add(itemOccurrence);

        itemColorUsed.setText("Colores Usados");
        jMenu2.add(itemColorUsed);

        itemObjectsUsted.setText("Objetos Usados");
        jMenu2.add(itemObjectsUsted);

        itemAnimationsUsed.setText("Animaciones Usadas");
        jMenu2.add(itemAnimationsUsed);

        itemErrors.setText("Errores");
        jMenu2.add(itemErrors);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConsole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCompiler, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTextArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTextArea)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCompiler, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelConsole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUploadFileActionPerformed
        // Aca Cargamos el archivo
        JFileChooser fileChooser = new JFileChooser();
        int selection = fileChooser.showOpenDialog(this);
        
        if(selection == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            BufferedReader buff = null;
            try {
                buff = new BufferedReader(new FileReader(file));
                String str;
                while((str = buff.readLine()) != null){
                    textArea.append("\n"+str);
                }
            } catch (IOException io) {
                JOptionPane("Hubo un error al abrir el archivo: " + io.getMessage());
            } 
        }
    }//GEN-LAST:event_itemUploadFileActionPerformed

    private void buttonCompilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompilerActionPerformed
        // TODO add your handling code here:
//        try{
//            Lexer lex = new Lexer(new StringReader(textArea.getText()));
//            Parser sintax = new Parser(lex);
//            System.out.println(sintax.parse());
//            figures = sintax.getFigures();
//            statsMaths = sintax.getStatsMath();
//            statsColor = sintax.getStatsColor();
//            statsFigure = sintax.getStatsFigure();
//
//            for (int i = 0; i < figures.size() ; i++) {
//                System.out.println(figures.get(i).toString());
//            }
//
//            for (int i = 0; i < statsMaths.size() ; i++) {
//                System.out.println(statsMaths.get(i).toString());
//            }
//
//            System.out.println(statsColor.toString());
//
//            System.out.println(statsFigure.toString());
//
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }

        Square square = new Square("Cuadrado", 100, 200, 40, "verde");
        PanelSquare panelSquare = new PanelSquare(square);
        panelSquare.setBounds(0, 0, square.getLade(), square.getLade());

        Graphics graphics = new Graphics();
        graphics.marco.setLayout(null);
        graphics.marco.add(panelSquare);
        graphics.marco.setPreferredSize(new Dimension(800, 600));
        graphics.marco.revalidate();
        graphics.marco.repaint();
        graphics.setVisible(true);

    }//GEN-LAST:event_buttonCompilerActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAnalyzer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAnalyzer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAnalyzer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAnalyzer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAnalyzer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCompiler;
    private javax.swing.JMenuItem itemAnimationsUsed;
    private javax.swing.JMenuItem itemColorUsed;
    private javax.swing.JMenuItem itemErrors;
    private javax.swing.JMenuItem itemNewFile;
    private javax.swing.JMenuItem itemObjectsUsted;
    private javax.swing.JMenuItem itemOccurrence;
    private javax.swing.JMenuItem itemSaveFile;
    private javax.swing.JMenuItem itemUploadFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelConsole;
    private javax.swing.JLabel labelTextArea;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
