package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _08_GetAllRowColumn extends JDBCParent {

    // bir metoda sorguyu("select * from language") gönderiniz,
    // metod size sorgunun datasını bir ArrayList olarak döndürsün

    @Test
    public void Test() throws SQLException {

        DBConnectionOpen();

        String sorgu = "select * from language";
        ArrayList<ArrayList<String>> donenList = getListData(sorgu);
        // System.out.println(donenList);
        for (ArrayList<String> satir : donenList) {
            for (String kolon : satir)
                System.out.print(kolon + "\t");

            System.out.println();
        }

        DBConnectionClose();

    }

    public ArrayList<ArrayList<String>> getListData(String sorgu) throws SQLException {

        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        ResultSet rs = sorguEkrani.executeQuery(sorgu);
        ResultSetMetaData rsmd = rs.getMetaData();

        ArrayList<String> kolonSatiri=new ArrayList<>();
        for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
            kolonSatiri.add(rsmd.getColumnName(i));
        }
        tablo.add(kolonSatiri);

        while (rs.next()) {

            ArrayList<String> satir = new ArrayList<>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                satir.add(rs.getString(i));

            }
            tablo.add(satir);

        }


        return tablo;
    }
}
