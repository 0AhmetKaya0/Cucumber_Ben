package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_GetAllRowColumn extends JDBCParent{
    @Test
    public void Test() throws SQLException {

        DBConnectionOpen();

        ResultSet rs= sorguEkrani.executeQuery("select city_id, city, country_id from city");

        rs.next();
        System.out.println(rs.getString(1));
        System.out.println(rs.getString("city_id"));

        int intID= rs.getInt("city_id"); // kolonun tipine uygun get ile de alabiliriz.
        System.out.println("intID = " + intID);

        DBConnectionClose();
    }
    @Test
    public void Test2() throws SQLException {

        // Kaç kolon var öğrenme
        DBConnectionOpen();

        ResultSet rs= sorguEkrani.executeQuery("select * from city");

        ResultSetMetaData rsmd= rs.getMetaData(); // Sorgu sonucunda DATA dışındaki veriler,kolon sayısı
        int kolonSayisi=rsmd.getColumnCount();
        System.out.println("kolonSayisi = " + kolonSayisi);
        for (int i = 1; i <=kolonSayisi ; i++) {
            System.out.println(rsmd.getColumnName(i));
        }


        rs.next();// şu anda ilk satırdayım, kolonları yazdırıyorum
        System.out.println("1.Kolon= "+rs.getString(1)); //1. kolon         1
        System.out.println("2.Kolon= "+rs.getString(2)); //2. kolon         A Coruña (La Coruña)
        System.out.println("3.Kolon= "+rs.getString(3)); //3. kolon         87

        for (int i = 1; i <=kolonSayisi ; i++) {
            System.out.println(i+".Kolon= "+rs.getString(i));

        }


        DBConnectionClose();
    }
}
