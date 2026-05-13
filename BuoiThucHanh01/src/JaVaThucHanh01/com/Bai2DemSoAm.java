package JaVaThucHanh01.com;

import java.util.Scanner;

public class Bai2DemSoAm {

    // Hàm xuất các số âm trong chuỗi

    public static void NegativeNumberInStrings(String str) {

        String so = "";

        for (int i = 0; i < str.length(); i++) {

            char kitu = str.charAt(i);

            // Nếu gặp dấu -

            if (kitu == '-') {

                so = "-";

                i++;

                // Lấy các chữ số phía sau dấu -

                while (i < str.length() && Character.isDigit(str.charAt(i))) {

                    so += str.charAt(i);
                    i++;
                }

                // In ra số âm tìm được

                if (so.length() > 1) {
                    System.out.println(so);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Nhap chuoi: ");
            String str = sc.nextLine();

            System.out.println("Cac so am trong chuoi la:");

            NegativeNumberInStrings(str);

        }

        catch (Exception e) {

            System.out.println("Nhap sai du lieu");
        }

        sc.close();
    }
}