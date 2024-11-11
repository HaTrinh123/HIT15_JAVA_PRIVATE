package Buoi4;

import java.util.Arrays;
import java.util.Scanner;

class Person {
    String name;
    String id;
    int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age;
    }
}

     class Main {
    static Person[] people = new Person[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        people[0] = new Person("Alice", "123456789", 30);
        people[1] = new Person("Bob", "987654321", 25);
        people[2] = new Person("Charlie", "456789123", 35);
        people[3] = new Person("David", "789123456", 28);
        people[4] = new Person("Eve", "321654987", 22);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tìm kiếm theo tên");
            System.out.println("2. Tìm kiếm theo mã căn cước công dân");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên cần tìm: ");
                    String name = scanner.nextLine();
                    TimKiemTheoTen(name);
                    break;
                case 2:
                    System.out.print("Nhập mã căn cước công dân cần tìm: ");
                    String id = scanner.nextLine();
                    TimKiemTheoMaCanCuocCongDan(id);
                    break;
                case 3:
                    SapXepTheoTuoi();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void TimKiemTheoTen(String name) {
        boolean found = false;
        for (Person person : people) {
            if (person.name.equalsIgnoreCase(name)) {
                System.out.println(person);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có tên: " + name);
        }
    }

    public static void TimKiemTheoMaCanCuocCongDan(String id) {
        boolean found = false;
        for (Person person : people) {
            if (person.id.equals(id)) {
                System.out.println(person);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có mã căn cước công dân: " + id);
        }
    }

    public static void SapXepTheoTuoi() {
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age));
        System.out.println("Danh sách sau khi sắp xếp theo tuổi:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
