package BaiTest;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int y;

        while (true) {
            System.out.print("Nhập số thực x (-100 <= x <= 100): ");
            x = sc.nextDouble();
            if (x >= -100 && x <= 100) {
                break;
            } else {
                System.out.println("Giá trị của x không hợp lệ. Vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập số nguyên y: ");
        y = sc.nextInt();

        double result = Math.pow(x, y);

        System.out.println("Giá trị của " + x + " mũ " + y + " là: " + result);
    }
}
