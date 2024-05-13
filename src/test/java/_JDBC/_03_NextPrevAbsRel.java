package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs=sorguEkrani.executeQuery("select * from language");

        rs.next(); // bir adım iler
        System.out.println("1. Satır = "+rs.getString(2)); // 2. kolonu getiriyor : italian

        rs.next(); // bir adım iler
        System.out.println("2. Satır = "+rs.getString(2));// 2. kolonu getiriyor : English

        rs.previous(); // bir adım geri
        System.out.println("1. Satır = "+rs.getString(2));// 2. kolonu getiriyor : italian


        DBConnectionClose();
    }

    @Test
    public void test2() throws SQLException {
        DBConnectionOpen();

        ResultSet rs=sorguEkrani.executeQuery("select * from film");

        rs.absolute(10); // direkt 10. satıra gider                     // 10
        System.out.println("10. satır= "+rs.getString("title"));

        rs.absolute(5); // direkt 5. satıra gider                       // 5
        System.out.println("5. satır= "+rs.getString("title"));

        rs.relative(5); // kaldığı yerden 5 ileri gider                 //+5= 10
        System.out.println("10. satır= "+rs.getString("title"));

        rs.next(); // 1 ileri gider yani                                // 11
        System.out.println("10. satır= "+rs.getString("title"));




        DBConnectionClose();
    }
}
