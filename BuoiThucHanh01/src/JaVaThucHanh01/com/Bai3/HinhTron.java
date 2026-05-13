package JaVaThucHanh01.com.Bai3;

public class HinhTron extends Hinh 
{

    private double bankinh;

    public HinhTron(String mau, double bankinh) 
    {
        super(mau);
        this.bankinh = bankinh;
    }

    @Override
    public double TinhDienTich() 
    {
        return Math.PI * bankinh * bankinh;
    }

    @Override
    public double TinhChuVi()
    {
        return 2 * Math.PI * bankinh;
    }

    @Override
    public String LayThongTin() 
    {
        return "Hinh tron - Mau: " + mau
                + ", Ban kinh: " + bankinh;
    }
}