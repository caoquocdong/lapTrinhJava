package LaptrinhjavaBuoi05.com;

import java.util.Scanner;

class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    // Constructor
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    // Getter & Setter
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    // Hàm tính lương
    public double getLuong() {
        double donGia;

        if (soSP < 100) {
            donGia = 5000;
        } else if (soSP < 200) {
            donGia = 6000;
        } else {
            donGia = 8000;
        }

        return soSP * donGia;
    }

    public void hienThi() {
        System.out.println("Họ tên: " + ho + " " + ten);
        System.out.println("Số SP: " + soSP);
        System.out.println("Lương: " + getLuong());
    }
}

public class BaiLopNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ: ");
        String ho = sc.nextLine();

        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập số sản phẩm: ");
        int soSP = sc.nextInt();

        NhanVien nv = new NhanVien(ho, ten, soSP);

        System.out.println("\n--- Thông tin nhân viên ---");
        nv.hienThi();
    }
}