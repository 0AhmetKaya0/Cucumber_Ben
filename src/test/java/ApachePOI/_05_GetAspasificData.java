package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.*;

/**

 Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 bulup ve sonucun döndürülmesi için metod kullanınız.
 src/test/java/ApachePOI/resources/LoginData.xlsx
 */


public class _05_GetAspasificData {
    public static void main(String[] args) throws IOException {
//    exceldenGetir("Username");

        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheet("Login");

        String aranan="username";
        String bulunan="";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            //bu satırın ilk hücresi aranan a eşit mi
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)){

                //bu satırın tüm hücrelerini bulunan a ekle
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    bulunan += sheet.getRow(i).getCell(j)+" ";
                }
            }
        }

        System.out.println("bulunan = " + bulunan);





    }


//    public static void exceldenGetir(String istenenKelime) throws IOException {
//
//        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";
//        FileInputStream fileInputStream=new FileInputStream(path);
//        Workbook workbook= WorkbookFactory.create(fileInputStream);
//        Sheet sheet= workbook.getSheet("Login");
//
//        int rowCount=sheet.getPhysicalNumberOfRows();
//        System.out.println("rowCount = " + rowCount);
//
//        switch (istenenKelime){
//            case "Username":
//                for (int i = 0; i <1 ; i++) {
//                    Row row= sheet.getRow(i);
//                    int cellCount=row.getPhysicalNumberOfCells();
//                    for (int j = 0; j <cellCount ; j++) {
//                        System.out.print(row.getCell(j)+"\t");
//                    }
//
//                }
//            case "Password":
//            case "Address":
//            case "Zipcode":
//            case "City":
//            case "State":
//        }
//
//
//    }
}
