package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _05_GetAspecificData_2 {
    public static void main(String[] args) throws IOException {

        System.out.println(exceldenGetir("username"));

    }


    public static String exceldenGetir(String aranan) throws IOException {
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Login");


        String bulunan = "";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            //bu satırın ilk hücresi aranan a eşit mi
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)) {

                //bu satırın tüm hücrelerini bulunan a ekle
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    bulunan += sheet.getRow(i).getCell(j) + " ";
                }
            }
        }

        return bulunan;

    }
}
