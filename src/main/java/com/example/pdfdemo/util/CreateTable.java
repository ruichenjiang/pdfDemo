package com.example.pdfdemo.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTable {

    public static PdfPTable createTable(PdfWriter writer) throws DocumentException, IOException {
        BaseFont bfChinese = BaseFont.createFont( "STSongStd-Light" ,"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        Font font = new Font(bfChinese, 12,Font.NORMAL);
        //PdfPCell cell = new PdfPCell(new Paragraph("测试",font));



        PdfPTable table = new PdfPTable(3);//生成一个两列的表格
        PdfPCell cell;
        int size = 15;
        cell = new PdfPCell(new Paragraph("1",font));
        cell.setFixedHeight(size);//设置高度
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("2",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("3",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("4",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("5",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("6",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("7",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("8",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("9",font));
        cell.setFixedHeight(size);
        table.addCell(cell);
        return table;
    }

    public static void createPDF(String filename) throws IOException {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.addTitle("交存凭证");
            document.open();
            PdfPTable table = createTable(writer);
            document.add(new Paragraph("个人专项维修自己交存凭证"));
            //document.add(new Paragraph("412341234123"));
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
