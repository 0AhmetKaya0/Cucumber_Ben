package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBCParent{

    @Test
    public void test() throws SQLException {

        DBConnectionOpen();

        ResultSet rs=sorguEkrani.executeQuery("select city from city");

        rs.last(); // son satıra gider
        System.out.println("Son Satıra Gider= "+rs.getString(1));

        rs.first(); // ilk satıra gider
        System.out.println("Son Satıra Gider= "+rs.getString(1));
        
        rs.last(); // son satıra gittim
        int kacinciSatir=rs.getRow();       // ŞU anda kaçıncı satırda olduğumun bilgisini verir.
        System.out.println("kacinciSatir = " + kacinciSatir);



        DBConnectionClose();
    }
}
