package JaVaThucHanh01.com.Bai3;

public class HinhChuNhat extends Hinh 
{

    protected double chieudai;
    protected double chieurong;

    public HinhChuNhat(String mau, double chieudai, double chieurong) 
    {
        super(mau);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    @Override
    public double TinhDienTich()
    {
        return chieudai * chieurong;
    }

    @Override
    public double TinhChuVi() 
    {
        return (chieudai + chieurong) * 2;
    }

    @Override
    public String LayThongTin() 
    {
        return "Hinh chu nhat - Mau: " + mau
                + ", Chieu dai: " + chieudai
                + ", Chieu rong: " + chieurong;
    }
}