/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author laptop
 */
public class Util {
 
    //Export to PNG
    public static void exportTableToPNG(JTable table){
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Guardar como PNG");
        jFileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Image", "png"));
        int selection = jFileChooser.showSaveDialog(null);
        
        if(selection == JFileChooser.APPROVE_OPTION){
            File fileToSave = jFileChooser.getSelectedFile();
            String filePathTo = fileToSave.getAbsolutePath();
            
            if(!filePathTo.endsWith(".png")){
                filePathTo += ".png";
            }
            
            try {
               BufferedImage image = new BufferedImage(table.getWidth(), table.getHeight(), BufferedImage.TYPE_INT_ARGB);
                table.paint(image.getGraphics());
            
                ImageIO.write(image, "png", new File(filePathTo));
                JOptionPane.showMessageDialog(null, "Se ha exportado a PNG correctamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }
    
    //Export to PDF
    public static void exportTableToPDF(JTable table, String message){
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Guardar como PDF");
        jFileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Document", "pdf"));
        int selection = jFileChooser.showSaveDialog(null);
        
        if(selection == JFileChooser.APPROVE_OPTION){
            File fileToSave = jFileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            
            if(!filePath.endsWith(".pdf")){
                filePath += ".pdf";
            }
            Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));    
            }
            
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {                    
                    pdfTable.addCell(table.getModel().getValueAt(i, j).toString());
                }
            }
            
                document.addTitle(message);
                document.add(pdfTable);
                document.close();
                JOptionPane.showMessageDialog(null, "Se ha exportado como PDF exitosamente");
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
    }
}
