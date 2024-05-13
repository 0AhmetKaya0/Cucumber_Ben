package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_Soru extends JDBCParent{

    @Test
    public void Test() throws SQLException {

        DBConnectionOpen();
        //city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
        ResultSet rs=sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSatir=rs.getRow();
        System.out.println("sonSatir = " + sonSatir);
        for (int i = 1; i <=sonSatir ; i++) {
            rs.absolute(i);
            System.out.println(i+".Satır = "+rs.getString("city"));

        }



        DBConnectionClose();
    }

    @Test
    public void Test2() throws SQLException {
        // city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
        DBConnectionOpen();
        ResultSet rs=sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSayi=rs.getRow();
        rs.first();

        for (int i = 1; i <=sonSayi ; i++) {

            System.out.println(i+".Satır= "+rs.getString("city"));
            rs.relative(1);
        }

        DBConnectionClose();


    }
}
