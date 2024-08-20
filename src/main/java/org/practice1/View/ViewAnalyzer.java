/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.practice1.View;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.Element;

import org.practice1.Cup.Parser;
import org.practice1.Lexer.Lexer;
import org.practice1.Objects.*;
import org.practice1.Objects.Panels.PanelCircle;
import org.practice1.Objects.Panels.PanelPolygon;
import org.practice1.Objects.Panels.PanelSquare;
import org.practice1.Objects.Polygon;
import org.practice1.Stats.*;


/**
 *
 * @author laptop
 */
public class ViewAnalyzer extends javax.swing.JFrame {
    private String filePath = "";
    private String text = "";
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
    
    public ViewAnalyzer(ArrayList<Figure> figures, ArrayList<StatsMath> statsMaths, StatsColor statsColor, StatsFigure statsFigure, String filePath){
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Compilador");
        this.figures = figures;
        this.statsMaths = statsMaths;
        this.statsColor = statsColor;
        this.statsFigure = statsFigure;
        this.filePath = filePath;
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
        txtConsole = new javax.swing.JTextArea();
        txtLine = new javax.swing.JLabel();
        txtColumn = new javax.swing.JLabel();
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
        textArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                textArea.setEditable(true);
                JTextArea source = (JTextArea) e.getSource();
                int caretPosition = source.getCaretPosition();
                Element root = source.getDocument().getDefaultRootElement();
                int conteoFila = root.getElementIndex(caretPosition) + 1;
                int conteoColumna = caretPosition - root.getElement(conteoFila - 1).getStartOffset() + 1;
                txtLine.setText("Line: " + (conteoFila - 1));
                txtColumn.setText("Column: " + (conteoColumna - 1));
            }
        });

        labelConsole.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelConsole.setText("Consola");

        buttonCompiler.setText("Compilar");
        buttonCompiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompilerActionPerformed(evt);
            }
        });

        txtConsole.setEditable(false);
        txtConsole.setColumns(20);
        txtConsole.setRows(5);
        jScrollPane2.setViewportView(txtConsole);

        txtLine.setText("Linea:");

        txtColumn.setText("Columna:");

        jMenu1.setText("Archivo");

        itemNewFile.setText("Nuevo Archivo");
        itemNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewFileActionPerformed(evt);
            }
        });
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
        itemOccurrence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOccurrenceActionPerformed(evt);
            }
        });
        jMenu2.add(itemOccurrence);

        itemColorUsed.setText("Colores Usados");
        itemColorUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColorUsedActionPerformed(evt);
            }
        });
        jMenu2.add(itemColorUsed);

        itemObjectsUsted.setText("Objetos Usados");
        itemObjectsUsted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemObjectsUstedActionPerformed(evt);
            }
        });
        jMenu2.add(itemObjectsUsted);

        itemAnimationsUsed.setText("Animaciones Usadas");
        itemAnimationsUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnimationsUsedActionPerformed(evt);
            }
        });
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
                        .addComponent(txtLine, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtColumn)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTextArea)
                    .addComponent(txtLine)
                    .addComponent(txtColumn))
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
            filePath = file.getAbsolutePath();
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
        try{
            Lexer lex = new Lexer(new StringReader(textArea.getText()));
            Parser sintax = new Parser(lex);
            sintax.parse();
            figures = sintax.getFigures();
            statsMaths = sintax.getStatsMath();
            statsColor = sintax.getStatsColor();
            statsFigure = sintax.getStatsFigure();
            Graphics graphics = new Graphics(figures, statsMaths, statsColor, statsFigure, filePath);
            graphics.setVisible(true);
            this.dispose();
            for (int i = 0; i < lex.getErrorsLexicos().size() ; i++) {
                System.out.println(lex.getErrorsLexicos().get(i).toString());
            }

            for (int i = 0; i < sintax.getErrors().size(); i++) {
                System.out.println("Sintax: " + sintax.getErrors().get(i).toString());
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_buttonCompilerActionPerformed

    private void itemColorUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColorUsedActionPerformed
        // TODO add your handling code here:
        ColorsUsedReport colorsUsedReport = new ColorsUsedReport(figures, statsMaths, statsColor, statsFigure, filePath);
        colorsUsedReport.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemColorUsedActionPerformed

    private void itemNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewFileActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Crear Archivo");
        jFileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("TXT File", "txt"));

        int userSelection = jFileChooser.showSaveDialog(null);

        if(userSelection == JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
            
            try (FileWriter fw = new FileWriter(file)){

                fw.write("");
                JOptionPane.showMessageDialog(this, "Archivo creado correctamente");
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_itemNewFileActionPerformed

    private void itemAnimationsUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnimationsUsedActionPerformed
        // TODO add your handling code here:
        AnimationUsedReport animationUsedReport = new AnimationUsedReport(figures, statsMaths, statsColor, statsFigure, filePath);
        animationUsedReport.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemAnimationsUsedActionPerformed

    private void itemObjectsUstedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemObjectsUstedActionPerformed
        // TODO add your handling code here:
        ObjectsUsedReports objectsUsedReports = new ObjectsUsedReports(figures, statsMaths, statsColor, statsFigure, filePath);
        objectsUsedReports.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemObjectsUstedActionPerformed

    private void itemOccurrenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOccurrenceActionPerformed
        // TODO add your handling code here:
        OcurrenceReport ocurrenceReport = new OcurrenceReport(figures, statsMaths, statsColor, statsFigure, filePath);
        ocurrenceReport.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemOccurrenceActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelConsole;
    private javax.swing.JLabel labelTextArea;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel txtColumn;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JLabel txtLine;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
