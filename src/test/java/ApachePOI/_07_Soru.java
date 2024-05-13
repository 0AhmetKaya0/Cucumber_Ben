package ApachePOI;

// ÇARPIM TABLOSU OLUŞTUR EXCELDE

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/Carpim.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int yeniSatirIndex=0;
        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                Row yeiSatir= sheet.createRow(yeniSatirIndex++);
                System.out.println(i+"x"+j+"="+(i*j));

                Cell hucre1=yeiSatir.createCell(0);hucre1.setCellValue(i);
                Cell hucre2=yeiSatir.createCell(1);hucre2.setCellValue("x");
                Cell hucre3=yeiSatir.createCell(2);hucre3.setCellValue(j);
                Cell hucre4=yeiSatir.createCell(3);hucre4.setCellValue("=");
                Cell hucre5=yeiSatir.createCell(4);hucre5.setCellValue(i*j);
            }
            Row bosSatir=sheet.createRow(yeniSatirIndex++);
        }

        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
        System.out.println("Kayıt Yapıldı");

    }
}
