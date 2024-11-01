package BaiTest;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = sc.nextLine();

        String letters = "";
        String numbers = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                numbers += ch + "";
            } else if (Character.isLetter(ch)) {
                letters += ch + "";
            }
        }

        System.out.println("Chuỗi các chữ: " + letters.trim());
        System.out.println("Chuỗi các số: " + numbers.trim());
    }
}
