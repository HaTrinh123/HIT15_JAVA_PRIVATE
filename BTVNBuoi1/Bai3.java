package BTVNBuoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = -1, max2 = -1; // bien max so lon nhat, bien max2 so lon thu 2
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max2 = max;
                max = a[i];
            }
            else if(max2 < a[i] && max >= a[i]){
                max2 = a[i];
            }
        }
        System.out.println(max2 + " " + max);
    }
}
