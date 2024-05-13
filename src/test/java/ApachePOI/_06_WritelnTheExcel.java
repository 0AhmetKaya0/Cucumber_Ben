package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WritelnTheExcel {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path); // okuma modu olarak açıldı
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int enSoSatirMiktari=sheet.getPhysicalNumberOfRows();
        Row yeniSatir=sheet.createRow(enSoSatirMiktari);           // Yeni satır oluşturdum
        Cell yeniHucre=yeniSatir.createCell(0);     // Yeni satırda yeni hücre oluşturdum

        yeniHucre.setCellValue("Merhaba Dünya");    // Yeni hücreye değer verdim
        // yazma işlemim bitti


        fileInputStream.close(); // aynı anda okuma ve kaydetme yapılamıyor

        // Dosyayı KAYDETME modunda aç
        FileOutputStream fileOutputStream=new FileOutputStream(path); // Kaydetmek için açıldı
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

        System.out.println("Kayıt yapıldı");


    }
}
