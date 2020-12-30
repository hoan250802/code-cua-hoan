package BaiTapLop;

import java.util.Scanner;

public class bai1_4 {
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
        System.out.print("Nhap gia tri X can tim : ");
        int x=nhap.nextInt();
        int c=0;
        for (int i = 0; i < n; i++) {
            if(x==a[i]){
                c=c+1;
            }
        }
        if(c==1){
            System.out.println("Phan tu X co trong mang");
        }else{
            System.out.println("Phan tu X khong co trong mang");
        }
    }
}
