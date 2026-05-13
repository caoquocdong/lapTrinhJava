package JaVaThucHanh01.com.Bai3;

public class Main {

    public static void main(String[] args)
    {

        HinhChuNhat hcn = new HinhChuNhat("Do", 5, 3);
        HinhTron ht = new HinhTron("Xanh", 4);
        HinhVuong hv = new HinhVuong("Vang", 6);

        System.out.println(hcn.LayThongTin());
        System.out.println("Dien tich: " + hcn.TinhDienTich());
        System.out.println("Chu vi: " + hcn.TinhChuVi());
        System.out.println();

        System.out.println(ht.LayThongTin());
        System.out.println("Dien tich: " + ht.TinhDienTich());
        System.out.println("Chu vi: " + ht.TinhChuVi());
        System.out.println();

        System.out.println(hv.LayThongTin());
        System.out.println("Dien tich: " + hv.TinhDienTich());
        System.out.println("Chu vi: " + hv.TinhChuVi());
    }
}