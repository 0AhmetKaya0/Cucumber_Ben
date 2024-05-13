package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.
 */
public class _11_Soru {
    public static void main(String[] args) {

        String path="src/test/java/ApachePOI/resource/TestSonuclari.xlsx";
        String testSonuc="Test Passed";


        writeToExcel(path, testSonuc); //excel create
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek


    }

    public static void writeToExcel(String path,String testSonuc){

        File dosya=new File(path);

        if (!dosya.exists())
        {

            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheet=workbook.createSheet("Senaryolar");

            Row yeniSatir=sheet.createRow(0);
            Cell yeiHucre= yeniSatir.createCell(0);
            yeiHucre.setCellValue(testSonuc);
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }
            catch (Exception ex){
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
            System.out.println("Dosya yok ise bölümü çalıştı");


        }
        else // Dosya var ise
        {
            FileInputStream inputStream =null;
            Workbook workbook = null;
            Sheet sheet = null;

            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            }catch (Exception ex){
                System.out.println("ex = " + ex.getMessage());
            }

            int satirMiktari= sheet.getPhysicalNumberOfRows();
            Row yeniSatir= sheet.createRow(satirMiktari);
            Cell yeniHucre=yeniSatir.createCell(0);
            yeniHucre.setCellValue(testSonuc);

            try {


                inputStream.close();

                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (Exception ex){
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
            System.out.println("Dosya VAR ise bölümü çalıştı");
        }

    }
}
