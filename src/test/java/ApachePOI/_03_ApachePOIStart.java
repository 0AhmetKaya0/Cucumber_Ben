package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx"; // excel'in olduğu yer

        // Java dosya okuma nesnesine bu yolu vererek bağlantı kuruyorum
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        // Dosya okuma işlemcisi üzerinden çalışma kitabını alıyorum
        // hafızada workbook u oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        // İstediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        // İstenen satırı alıyorum
        Row satir=calismaSayfasi.getRow(0); // 0. satırı aldık

        // İstenen hücreyi alıyorum
        Cell hucre=satir.getCell(0); // 0. hücreyi ver

        System.out.println("hucre = " + hucre);

    }
}
