package lapTrinhJavabuoi06.com; // Đã sửa tên package theo yêu cầu của bạn

import java.util.*;

// StaffMember
abstract class StaffMember {
    protected String name, address, phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return "Tên: " + name + "\nĐịa chỉ: " + address + "\nSDT: " + phone;
    }

    public abstract double pay(); 
}

//Volunteer
class Volunteer extends StaffMember {
    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0.0; 
    }
}

//Lớp Employee
class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSSN: " + socialSecurityNumber;
    }

    @Override
    public double pay() {
        return payRate;
    }
}

//Lớp Executive (Kế thừa Employee)
class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        bonus = 0; 
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0; 
        return payment;
    }
}

//Lớp Hourly (Kế thừa Employee)
class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0; 
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSố giờ làm: " + hoursWorked;
    }
}

//  Staff quản lý danh sách
class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();
        //Khởi tạo vài dữ liệu mẫu
        staffList.add(new Executive("Nguyễn Văn A", "Hà Nội", "0123", "SSN-001", 5000.0));
        staffList.add(new Hourly("Trần Thị B", "TP.HCM", "0456", "SSN-002", 20.0));
        staffList.add(new Volunteer("Lê Văn C", "Đà Nẵng", "0789"));
        
        // Thử nghiệm thêm thưởng và giờ 
        ((Executive)staffList.get(0)).awardBonus(1000.0);
        ((Hourly)staffList.get(1)).addHours(40);
    }

    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member);
            double amount = member.pay();
            if (amount == 0.0) {
                System.out.println("Cảm ơn vì sự đóng góp tình nguyện!");
            } else {
                System.out.println("Lương thực nhận: " + amount);
            }
            System.out.println("-------------------------");
        }
    }
}

// Main
public class Bai1 { 

	public static void main(String[] args) {
		try {
            Staff personnel = new Staff();
            personnel.payday();
        } catch (Exception ex) {
            System.out.println("Có lỗi xảy ra: " + ex.getMessage());
        }
	}

}