import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class HumanResourses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager m1 = new Manager("1","Thanh", 28, 10000.0,"20/02/1997","Business leader",1,"1");
        outer:
        while (true) {
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
            System.out.println("2. Hiển thị các bộ phận trong công ty.");
            System.out.println("3. Hiển thị các các nhân viên theo từng bộ phận.");
            System.out.println("4. Thêm nhân viên mới vào công ty.");
            System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
            System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty.");
            System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("Lựa chọn của bạn: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    break outer;
                case 1:
                    // Do something
                    break outer;
                default:
                    break;
            }
        }
    }
    /*
        id, name, age, salaryBase, startingDate, department, leaveDays
    */
    /*Just a test*/
}
