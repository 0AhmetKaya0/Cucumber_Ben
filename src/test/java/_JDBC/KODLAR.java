package _JDBC;

public class KODLAR {
    public static void main(String[] args) {

    }

    // rs.next() : sonraki satır
    // rs.previous : önceki satır
    // rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
    // rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
    // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
    // rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
    // ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir


    //    next() -> 1.satır
    //    next() -> 2.Satır
    //    next() -> 3.Satır
    //    absolute(10) -> 10.Satıra gider
    //    relative(5) -> 15 e gider
    //    relative(-2) -> 13 e gider
    //    absolute(-5) -> - siyi görünce en sona gider
    //    ordan 5 geri gelir.
}
