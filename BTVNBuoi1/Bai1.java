package BTVNBuoi1;

import java.util.Scanner;
public class Bai1{
public static void convert(int soBiChia, int soChia) {
    if ( soBiChia == 0){
        return;
    }
    convert(soBiChia/soChia, soChia);
    int kq = soBiChia % soChia;
    if(kq < 10) {
        System.out.print(kq);
    }else{
        char tmp = (char) (kq + 55);
        System.out.print(tmp);
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soBiChia = sc.nextInt();
        int soChia = sc.nextInt();
        convert(soBiChia,soChia);
    }
}
