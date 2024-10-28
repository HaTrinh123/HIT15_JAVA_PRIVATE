package BTVNBuoi2;

import java.util.Scanner;

import java.util.Arrays;

public class BaiTap1 {
    public static int search(int [] a, int n, int k){
        int index=-1;
        int l=0, r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==k){
                index=m;
                r=m-1;
            }
            else if(a[m]>k){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println(search(a,n,k));

    }
}

