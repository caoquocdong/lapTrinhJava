package JaVaThucHanh01.com;

import java.util.Scanner;

public class Bai1 {

    public static int UCLN(int a, int b) 
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm kiểm tra số hoàn thiện
    public static boolean SoHoanThien(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) 
        {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }
    // Hàm kiểm tra toàn số chẵn
    public static boolean ToanChan(int n) 
    {
        while (n > 0) {
            int so = n % 10;
            if (so % 2 != 0) 
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // Hàm tính giai thừa
    public static long GiaiThua(int n) 
    {
        long gt = 1;
        for (int i = 1; i <= n; i++)
        {
            gt *= i;
        }

        return gt;
    }

    public static double TinhS(int x, int n) 
    {
        double tong = 0;

        for (int i = 0; i <= n; i++) {

            int mu = 2 * i + 1;

            tong += Math.pow(x, mu) / GiaiThua(mu);
        }

        return tong;
    }

    //  Main

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap a: ");
            int a = sc.nextInt();
            System.out.print("Nhap b: ");
            int b = sc.nextInt();
            System.out.println("UCLN = " + UCLN(a, b));


            System.out.print("\nNhap n kiem tra so hoan thien: ");
            int n1 = sc.nextInt();
            if (SoHoanThien(n1)) 
            {
                System.out.println("La so hoan thien");
            } else 
            {
                System.out.println("Khong phai so hoan thien");
            }


            System.out.print("\nNhap n kiem tra toan chu so chan: ");
            int n2 = sc.nextInt();
            if (ToanChan(n2)) {
                System.out.println("Toan chu so chan");
            } else 
            {
                System.out.println("Khong toan chu so chan");
            }


            System.out.print("\nNhap x: ");
            int x = sc.nextInt();
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            System.out.println("S = " + TinhS(x, n));
        }
        catch (Exception e) 
        {

            System.out.println("Nhap sai du lieu");
        }

        sc.close();
    }
}