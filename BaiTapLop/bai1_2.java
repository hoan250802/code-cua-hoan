package BaiTapLop;

import java.util.Scanner;

public class bai1_2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang : ");
        int n=nhap.nextInt();
        int[] a= new int[n];
        System.out.println("Nhap gia tri cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]%3==0){
                if (a[i]%4!=0){
                    c=c+1;
                }
            }
        }
        System.out.print("Trong mang co "+c+" gia tri chia het cho 3 ma khong chia het cho 4 ");
    }
}
