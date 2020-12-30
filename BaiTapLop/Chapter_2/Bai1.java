package BaiTapLop.Chapter_2;

import java.util.Scanner;

public class Bai1 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = nhap.nextInt();
        int c=0;
        for (int i=0; i<=n; i++){
            if (i%2==0){
                c = c+i;
            }
        }
        System.out.print("Tong cac so chan tu 0 den n la : "+c);
    }
}
