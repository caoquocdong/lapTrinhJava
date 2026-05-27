package test;

import data.*;
import domain.*;

public class Apptest {

    public static void main(String[] args) {

        KhoaData kd = new KhoaData();
        GiaoVienData gd = new GiaoVienData();

        Khoa k =
                new Khoa(
                        "CNTT",
                        "Cong Nghe Thong Tin",
                        "2020-01-01",
                        null);

        kd.them(k);

        GiaoVien gv =
                new GiaoVien(
                        "GV10",
                        "Pham Van D",
                        "Thac Si",
                        "Giang Vien",
                        "Nam",
                        2.5f,
                        10000000,
                        "CNTT");

        gd.them(gv);

        gd.lietKeGVNamCNTT();
    }
}