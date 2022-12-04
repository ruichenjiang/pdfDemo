package com.example.pdfdemo.util;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CreatePdf {

    /**
     * 生成带表格的pdf
     */
    public static PdfPTable createTable(PdfWriter writer,String str) throws DocumentException, IOException {
        float BorderWidth = 1f;

        //设置中文字体
        BaseFont bf = BaseFont.createFont( "STSong-Light", "UniGB-UCS2-H", false, false, null, null);
        Font fontChinese5 = new Font(bf,8);
        Font fontChineseBold = new Font(bf,12,Font.BOLD);

        //生成一个9列的表格
        PdfPTable table = new PdfPTable(9);
        //表格垂直居中
        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        // 宽度100%填充
        table.setWidthPercentage(100);
        float[] columnWidths = {0.8f,0.8f,0.8f,0.8f,0.8f,0.8f,0.8f,0.8f,0.2f};
        table.setWidths(columnWidths);


        //第1行
        PdfPCell cell;
        float size = 24.94f;
        cell = new PdfPCell(new Paragraph("物业专项维修资金分户交存凭证",fontChineseBold));
        cell.setFixedHeight(size);//设置高度
        cell.setColspan(8);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setBorder(0); //去掉边框
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("12",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setColspan(2);
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("13",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("14",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("15",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("16",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("17",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("18",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
        cell = new PdfPCell(new Paragraph("",fontChinese5));
        cell.setFixedHeight(size);
        cell.setBorder(0); //去掉边框
        table.addCell(cell);


        //第2行
        cell = new PdfPCell(new Paragraph("凭证号:",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setColspan(6);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setBorder(0); //去掉边框
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("22",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("日期:",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(3);
        cell.setBorder(0); //去掉边框
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);


//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//        System.out.println("总宽度" + table.getTotalWidth());

        //第3行
        cell = new PdfPCell(new Paragraph("物业区域名称",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthTop(BorderWidth); //上边框宽度
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("广东省深圳市南山区后海街道办恒大物业就啊啥爱上ask接电话啊哈三菱电机阿斯兰的阿斯兰的阿斯顿速度",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setBorderWidthTop(BorderWidth); //上边框宽度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
        cell = new PdfPCell(new Paragraph("楼 栋 名 称",fontChinese5));
        cell.setFixedHeight(size);
        cell.setBorderWidthTop(BorderWidth); //上边框宽度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("A",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setBorderWidthTop(BorderWidth); //上边框宽度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("二维码",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setRowspan(5);
        cell.setBorderWidthTop(1F);

        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        StringBuilder sb = new StringBuilder();
        sb.append("第");
        sb.append("\n");
        sb.append("一");
        sb.append("\n");
        sb.append("联");
        sb.append("\n");
        sb.append(" ");
        sb.append("\n");
        sb.append("银");
        sb.append("\n");
        sb.append("行");
        sb.append("\n");
        sb.append("入");
        sb.append("\n");
        sb.append("账");
        sb.append("\n");


        cell = new PdfPCell(new Paragraph(str,fontChinese5));
        cell.setFixedHeight(size);
        cell.setRowspan(9);
        cell.setBorder(0);//无边框
        cell.setPaddingLeft(7);//左内边距
        cell.setBorderWidthLeft(BorderWidth); //上边框宽度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);

        //第4行
        cell = new PdfPCell(new Paragraph("房 屋 账 号",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("4654645465465454346564",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(5);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setColspan(2);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第5行
        cell = new PdfPCell(new Paragraph("房 屋 地 址",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("福田区车公庙NEO",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(5);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setColspan(2);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第6行
        cell = new PdfPCell(new Paragraph("交 存 类 型",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("首交",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
        cell = new PdfPCell(new Paragraph("交 存 标 准",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("25 * 100m",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setColspan(2);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第7行
        cell = new PdfPCell(new Paragraph("建 筑 面 积",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        //生成一个5列的表格
        PdfPTable table5 = new PdfPTable(11);
        //表格垂直居中
        table5.setHorizontalAlignment(Element.ALIGN_CENTER);
        // 宽度100%填充
        table5.setWidthPercentage(100);
        cell = new PdfPCell(new Paragraph("115.56㎡",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setColspan(2);
        table5.addCell(cell);

        cell = new PdfPCell(new Paragraph("套 内 面 积",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setColspan(2);
        table5.addCell(cell);

        cell = new PdfPCell(new Paragraph("95.16㎡",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setColspan(2);
        table5.addCell(cell);

        cell = new PdfPCell(new Paragraph("公 摊 面 积",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setColspan(2);
        table5.addCell(cell);

        cell = new PdfPCell(new Paragraph("20.16㎡",fontChinese5));
        cell.setFixedHeight(size);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setColspan(3);
        table5.addCell(cell);

        cell = new PdfPCell(table5);
        cell.setFixedHeight(size);
        cell.setColspan(5);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);





//        cell = new PdfPCell(new Paragraph("115.56㎡",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("套 内 面 积",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("95.16㎡",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("公 摊 面 积",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("20.16㎡",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        cell.setColspan(2);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第8行
        cell = new PdfPCell(new Paragraph("交 存 金 额",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("(大写) ",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(4);
        cell.setBorder(0);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("(小写) ￥",fontChinese5));
        cell.setFixedHeight(size);
        // 去掉左边边框
        cell.setBorderWidthLeft(0);
        cell.setColspan(3);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第9行
        StringBuilder sb3 = new StringBuilder();
        sb3.append("收款银行");
        sb3.append("\n");
        sb3.append("(盖章)");
        cell = new PdfPCell(new Paragraph(sb3.toString(),fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("建设银行",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(2);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("深圳分行",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(5);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第10行
        cell = new PdfPCell(new Paragraph("备注",fontChinese5));
        cell.setFixedHeight(size);//设置高度
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        table.addCell(cell);

        cell = new PdfPCell(new Paragraph("哈哈哈哈",fontChinese5));
        cell.setFixedHeight(size);
        cell.setColspan(7);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        //第11行
        StringBuilder sb2  = new StringBuilder();
        sb2.append("说明:");
        sb2.append("\n");
        sb2.append("尊敬的业主，您已足额缴纳物业专项维修资金");
        cell = new PdfPCell(new Paragraph(sb2.toString(),fontChinese5));
        cell.setFixedHeight(size * 3);//设置高度
        cell.setColspan(8);
        cell.setVerticalAlignment(Element.ALIGN_TOP);//设置垂直顶部对齐
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);//设置水平居左
        cell.setBorderWidthLeft(BorderWidth); //左边框宽度
        cell.setBorderWidthBottom(BorderWidth); //下边框宽度
        cell.setPaddingLeft(10);

        table.addCell(cell);

//        cell = new PdfPCell(new Paragraph("22",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        //第12行
//        cell = new PdfPCell(new Paragraph("房 屋 账 号",fontChinese5));
//        cell.setFixedHeight(size);//设置高度
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("22",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        //第13行
//        cell = new PdfPCell(new Paragraph("房 屋 账 号",fontChinese5));
//        cell.setFixedHeight(size);//设置高度
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("22",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("23",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("24",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("25",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("26",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("27",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("28",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);
//
//        cell = new PdfPCell(new Paragraph("29",fontChinese5));
//        cell.setFixedHeight(size);
//        table.addCell(cell);

        return table;
    }

    /**
     * 创建表
     * @throws IOException
     */
    public void createPDF(String filename) throws IOException {
        String[] strs = {"第一联 银行入账","第二联 资金监管单位入账","第三联 办理合同备案","第四联 产权办证","第五联 办理房屋入住手续(建设单位存留)","第六联 业主"};
        String[] background = {"",""};

        //设置页面大小
        Rectangle pageSize = new Rectangle(609.4f, 396.9f);
        pageSize.setBackgroundColor(new BaseColor(0xFF, 0xFF, 0xDE));
        //pageSize.rotate();
        //document.setPageSize(pageSize);
        Document document = new Document(pageSize);
        //Document document = new Document(PageSize.A4);
        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.addTitle("缴存凭证");
            document.open();

            for(String str:strs){
                PdfPTable table = createTable(writer,resolve(str));
                document.newPage();
                document.add(table);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }

    }

    public String resolve(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char ch:chars){
            sb.append(ch);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void createPdf(String filename,DeptVo vo){






    }

    public static void main(String[] args) {
        String filename = "D:/pdfTest/testTable3.pdf";
        CreatePdf pdf = new CreatePdf();
        try{
            pdf.createPDF(filename);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("打印完成");



    }



}
