package BTVNBuoi4;

import java.util.Scanner;

public class Main {
    private static Book[] books = new Book[5];
    private static int count = 5;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        books[0] = new Book(1,"Mat biec", "Nguyen Nhat Anh", 1990, "chuyen tinh", 10000);
        books[1] = new Book(2,"Mat biec2", "Nguyen Nhat Anh", 1990, "chuyen tinh", 10000);
        books[2] = new Book(3,"Mat biec3", "Nguyen Nhat Anh", 1990, "chuyen tinh", 10000);
        books[3] = new Book(4,"Mat biec4", "Nguyen Nhat Anh", 1990, "chuyen tinh", 10000);
        books[4] = new Book(5,"Mat biec5", "Nguyen Nhat Anh", 1990, "chuyen tinh", 10000);
        while (true) {
            System.out.println("\n1. Thêm sách\n2. Sửa sách\n3. Hiển thị sách\n4. Hiển thị sách cổ nhất\n0. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> themSach();
                case 2 -> suaSach();
                case 3 -> hienThiTatCa();
                case 4 -> hienThiSachCoNhat();
                case 0 -> { System.out.println("Thoát!"); return; }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void themSach() {
        if (count >= books.length) {
            System.out.println("Không thể thêm sách mới.");
            return;
        }
        System.out.print("Mã sách: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tên sách: ");
        String tenSach = scanner.nextLine();
        System.out.print("Tác giả: ");
        String tacGia = scanner.nextLine();
        System.out.print("Năm xuất bản: ");
        int nam = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tóm tắt: ");
        String tomTat = scanner.nextLine();
        System.out.print("Giá tiền: ");
        double gia = scanner.nextDouble();
        books[count++] = new Book(maSach, tenSach, tacGia, nam, tomTat, gia);
    }

    private static void suaSach() {
        System.out.print("Nhập mã sách cần sửa: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (books[i].getMaSach() == maSach) {
                System.out.print("Tên mới: ");
                books[i].setTenSach(scanner.nextLine());
                System.out.print("Tác giả mới: ");
                books[i].setTenTacGia(scanner.nextLine());
                System.out.print("Năm mới: ");
                books[i].setNamSanXuat(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Tóm tắt mới: ");
                books[i].setTomTatNoiDung(scanner.nextLine());
                System.out.print("Giá mới: ");
                books[i].setGiaTien(scanner.nextDouble());
                System.out.println("Đã cập nhật sách!");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã " + maSach);
    }

    private static void hienThiTatCa() {
        if (count == 0) System.out.println("Chưa có sách nào.");
        else for (int i = 0; i < count; i++) books[i].display();
    }

    private static void hienThiSachCoNhat() {
        if (count == 0) {
            System.out.println("Chưa có sách nào.");
            return;
        }
        Book oldest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getNamSanXuat() < oldest.getNamSanXuat()) oldest = books[i];
        }
        System.out.println("Sách cổ nhất:");
        oldest.display();
    }
}

