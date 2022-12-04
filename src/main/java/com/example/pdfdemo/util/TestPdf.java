package com.example.pdfdemo.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPdf {
    public static void main(String[] args) throws Exception {

//        TestPdf pdf = new TestPdf();
//        String filename = "D:/pdfTest/testTable3.pdf";
//        pdf.createPDF(filename);
//        System.out.println("打印完成");
//
//        CreateTable.createPDF(filename);

         String str = "第一联 银行入账";
         char[] chars = str.toCharArray();
         for(char ch:chars){
             StringBuilder sb = new StringBuilder();
             sb.append(ch);
             sb.append("\n");
         }
        System.out.println(str.toCharArray()[0]);

    }



    public void createPDF(String filename) throws IOException {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.addTitle("example of PDF");
            document.open();
            document.add(new Paragraph("Hello World!"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
