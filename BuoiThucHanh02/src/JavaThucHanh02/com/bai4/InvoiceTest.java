package JavaThucHanh02.com.bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Invoice> ds = new ArrayList<>();
        int chon;
        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sap xep theo ma hang");
            System.out.println("4. Tim theo ma hang");
            System.out.println("5. Xoa theo ma hang");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) 
            {
                case 1:
                    System.out.print("Nhap so luong Invoice: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) 
                    {
                        System.out.println("\nInvoice thu " + (i + 1));
                        System.out.print("Nhap ma hang: ");
                        String ma = sc.nextLine();
                        // kiểm tra trùng mã
                        boolean trung = false;

                        for (Invoice x : ds) 
                        {
                            if (x.getPartNumber().equalsIgnoreCase(ma)) 
                            {
                                trung = true;
                                break;
                            }
                        }

                        if (trung) 
                        {
                            System.out.println("Ma hang da ton tai!");
                            i--;
                            continue;
                        }

                        System.out.print("Nhap mo ta: ");
                        String mota = sc.nextLine();

                        System.out.print("Nhap so luong: ");
                        int sl = sc.nextInt();

                        System.out.print("Nhap gia: ");
                        double gia = sc.nextDouble();
                        sc.nextLine();

                        Invoice hd = new Invoice(ma, mota, sl, gia);

                        ds.add(hd);
                    }

                    break;

                case 2:

                    if (ds.isEmpty()) 
                    {

                        System.out.println("Danh sach rong!");
                    } 
                    else
                    {

                        for (Invoice x : ds) 
                        {

                            x.hienThi();
                        }
                    }

                    break;

                case 3:

                    Collections.sort(ds, new Comparator<Invoice>()
                    {

                        @Override
                        public int compare(Invoice o1, Invoice o2)
                        {

                            return o1.getPartNumber()
                                    .compareTo(o2.getPartNumber());
                        }
                    });
                    System.out.println("Da sap xep!");
                    break;
                case 4:
                    System.out.print("Nhap ma can tim: ");
                    String tim = sc.nextLine();
                    boolean found = false;
                    for (Invoice x : ds) 
                    {
                        if (x.getPartNumber()
                                .equalsIgnoreCase(tim))
                        {
                            x.hienThi();
                            found = true;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Khong tim thay!");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma can xoa: ");
                    String xoa = sc.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < ds.size(); i++) 
                    {
                        if (ds.get(i).getPartNumber()
                                .equalsIgnoreCase(xoa))
                        {
                            ds.remove(i);
                            daXoa = true;
                            break;
                        }
                    }
                    if (daXoa) 
                    {
                        System.out.println("Da xoa!");
                    } 
                    else 
                    {
                        System.out.println("Khong tim thay!");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}