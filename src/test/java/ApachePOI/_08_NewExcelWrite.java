package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;


public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //hafızada workbook oluştur
        // bundan hafızada sheet oluıştur

        // geri kalan işlemler aynı


        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Sayfa1");

        Row yeniSatir= sheet.createRow(0);
        Cell yeniHucre=yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Yeni Excel");

        String path="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
