package BTVNBuoi1;

import java.util.Scanner;
public class Bai2 {
    public static int calculate(int n) {
        int res = 1;
        while( n != 0) {
            res *= n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculate(n));
    }
}
