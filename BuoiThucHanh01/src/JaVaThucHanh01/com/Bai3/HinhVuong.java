package JaVaThucHanh01.com.Bai3;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(String mau, double canh) 
    {
        super(mau, canh, canh);
    }

    @Override
    public String LayThongTin() 
    {
        return "Hinh vuong - Mau: " + mau
                + ", Canh: " + chieudai;
    }
}