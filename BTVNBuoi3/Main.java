package BTVNBuoi3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student student = new Student(); // Khởi tạo đối tượng Student trống
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Menu ===");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sinh viên: ");
                    student.setStudentCode(sc.nextLine());
                    System.out.print("Nhập họ tên: ");
                    student.setFullName(sc.nextLine());
                    System.out.print("Nhập tuổi: ");
                    student.setAge(sc.nextByte());
                    sc.nextLine(); // Đọc bỏ dòng mới sau khi nhập số
                    System.out.print("Nhập giới tính: ");
                    student.setGetGender(sc.nextLine());
                    System.out.print("Nhập số điện thoại: ");
                    student.setPhoneNumber(sc.nextLine());
                    System.out.print("Nhập email: ");
                    student.setEmail(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Thông tin sinh viên:");
                    student.display();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        sc.close();
    }
}
