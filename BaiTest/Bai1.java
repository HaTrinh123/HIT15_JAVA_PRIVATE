package BaiTest;
import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {

        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số (dưới 1000): ");
        int number = sc.nextInt();


        if (number < 0 || number >= 1000) {
            System.out.println("Vui lòng nhập số trong khoảng từ 0 đến 999.");
        } else {
            String result = "";

            if (number >= 100) {
                result += ones[number / 100] + " trăm ";
                number %= 100;
            }


            if (number > 0 && number < 10 && result.contains("trăm")) {
                result += "lẻ ";
            }


            if (number >= 10) {
                result += tens[number / 10] + " ";
                number %= 10;
            }

            if (number > 0) {
                result += ones[number];
            }
            System.out.println("Số đã nhập là: " + result.trim());
        }

        sc.close();
    }
}
