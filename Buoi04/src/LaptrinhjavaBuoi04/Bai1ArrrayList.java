package LaptrinhjavaBuoi04;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1ArrrayList {

	public static void main(String[] args) 
	{
		int n = 0;

        ArrayList<String> ds = new ArrayList<String>();
        System.out.println("Nhap so luong sinh vien");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		
		int k = 0;
		
		try
		{	
			System.out.println("Nhap cac phan tu : ");
			for (int i = 0 ; i < n ; i++) 
			{
				String s = sc.nextLine();
	            ds.add(s);
			}
			
			System.out.println("--------Menu--------");
			System.out.println("\n1.Them sinh vien");
			System.out.println("\n2.Xuat sinh vien");
			System.out.println("\n3.Sua sinh vien");
			System.out.println("\n4.Xoa sinh vien");
			System.out.println("\n5.Tim sinh vien");
			System.out.println("\n6.Sap xep sinh vien");
			System.out.println("\n7.Xuat so luong sinh vien");
			System.out.println("\n8.Thoat");
					
			k = sc.nextInt();
			
			switch(k)
			{
				case 1: 
					System.out.println("Nhap phan tu kieu String muon them vao");
					sc.nextLine();
					String them = sc.nextLine();
					ds.add(them);
					 
					System.out.println("Danh sach sau khi them : ");
					for (String s: ds)
					{
						System.out.print(" "+s+" ");
					}
					break;

				case 2:
					System.out.println("Cac phan tu trong Mang Array : ");
					for (String s: ds)
					{
						System.out.println(s);
					}
					break;

				case 3:
					System.out.println("\n Danh sach truoc khi sua:");
					for (String s : ds)
					{
					    System.out.print(" "+s+" ");
					}

					System.out.println("\n Nhap vi tri can sua:");
					int sua = sc.nextInt();

					if (sua >= 0 && sua < ds.size())
					{
					    System.out.println("Nhap gia tri moi:");
					    sc.nextLine();
					    String x = sc.nextLine();
					    ds.set(sua, x);
					}
					else
					{
						System.out.println("Vi tri khong ton tai");
					}

					System.out.println("Danh sach sau khi sua:");
					for (String s : ds)
					{
					    System.out.print(" " + s + " ");
					}
					break;

				case 4:
					System.out.println("\n Danh sach truoc khi xoa:");
					for (String s : ds)
					{
					    System.out.print(" "+s+" ");
					}
					
					System.out.println("\n Nhap vi tri can xoa:");
					int xoa = sc.nextInt();

					if (xoa >= 0 && xoa < ds.size()) 
					{
					    ds.remove(xoa);
					}
					else
					{
						System.out.println("Vi tri khong ton tai");
					}

					System.out.println("Danh sach sau khi xoa:");
					for (String s : ds)
					{
					    System.out.print(" " + s + " ");
					}
					break;

				case 5:
					System.out.println("\n Danh sach truoc khi tim kiem:");
					for (String s : ds)
					{
					    System.out.print(" "+s+" ");
					}
					
					System.out.println("\n Nhap vi tri can tim kiem:");
					int timkiem = sc.nextInt();

					if (timkiem >= 0 && timkiem < ds.size()) 
					{
					    System.out.println("Gia tri: " + ds.get(timkiem));
					}
					else
					{
						System.out.println("Vi tri khong ton tai");
					}
					break;

				case 6:
					ds.sort(null); 
					System.out.println("Da sap xep:");
					for (String s : ds)
					{
					    System.out.print(" "+s+" ");
					}
					break;

				case 7:
					System.out.println("So luong sinh vien: " + ds.size());
					break;

				case 8:
					System.out.println("Thoat!");
					break;

				default:
					System.out.println("Lua chon khong hop le!");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}