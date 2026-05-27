package domain;

public class Khoa {

    private String maKhoa;
    private String tenKhoa;
    private String ngayLap;
    private String truongKhoa;

    public Khoa() {
    }

    public Khoa(String maKhoa,
                String tenKhoa,
                String ngayLap,
                String truongKhoa) {

        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.ngayLap = ngayLap;
        this.truongKhoa = truongKhoa;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public String getTruongKhoa() {
        return truongKhoa;
    }
}