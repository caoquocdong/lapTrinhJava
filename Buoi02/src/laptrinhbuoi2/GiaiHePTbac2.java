package laptrinhbuoi2;
import java.util.Scanner;
public class GiaiHePTbac2 {
	
	/*Nếu a=0   {nếu b=0 {nếu c=0 thì pt vô  số nghiệm ngược lại 
	 * c khác 0 pt vô nghiệm} ngược lại nếu b khác 0 thì x=-c/b}Ngược lại nếu a khác 0 tính đen ta = b^2 -4ac nếu đen ta <0 thì pt vô nghiệm ngược lại đen ta >0 lại xảy ra 2 trường hợp  {nếu đenta == 0 thì x =-b/2a pt này có 1 nghiệm kép là  x này ngược lại nếu đen ta 
	 * ko phải 0 thì có 2 nghiệm x1 và x2 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        //nếu a=0 b=0 c=0 thì PTVSN a=0 b=0 c khác 0 ptvn
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PTVSN");
                } else {
                    System.out.println("PTVN");
                }
                //a=0 b khác 0 có  nghiệm x
            } else {
                double x = -c / b;
                System.out.println("Pt có  nghiệm: x = " + x);
            }
            //a khác 0 chia ra tiếp trường hợp...
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("PTVN)");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("PT có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Pt có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        
        sc.close();
    }

}
