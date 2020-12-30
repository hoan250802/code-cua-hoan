package BaiTapLop.Chapter_3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap gia tri cua mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap gia tri cho phan tu a ["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Mang vua nhap la : ");
        for (int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Cac phan tu la so chan trong mang la : ");
        for (int i=0;i<n;i++){
            if (a[i] %2==0){
                System.out.print(a[i] +" ");
            }
        }
    }
}
