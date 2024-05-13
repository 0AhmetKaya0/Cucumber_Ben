package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru {

    // Excel de çarpım tablosu oluştur
    // yeni bir excel oluşturup
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Çarpım Tablosu");

        int yeniSatirIndex=0;
        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <= 10; j++) {
                Row yeiSatir = sheet.createRow(yeniSatirIndex++);
                System.out.println(i + "x" + j + "=" + (i * j));

                Cell hucre1 = yeiSatir.createCell(0);
                hucre1.setCellValue(i);
                Cell hucre2 = yeiSatir.createCell(1);
                hucre2.setCellValue("x");
                Cell hucre3 = yeiSatir.createCell(2);
                hucre3.setCellValue(j);
                Cell hucre4 = yeiSatir.createCell(3);
                hucre4.setCellValue("=");
                Cell hucre5 = yeiSatir.createCell(4);
                hucre5.setCellValue(i * j);
            }
            Row bosSatir = sheet.createRow(yeniSatirIndex++);


        }
        String path="src/test/java/ApachePOI/resource/CarpimExcel.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

    }
}
