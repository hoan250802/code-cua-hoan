package Baitapon;

import java.util.Scanner;

public class Cau9_4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cho mang : ");
        int n = nhap.nextInt();
        int[] a = new int[n];
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
        System.out.print("Nhap gia tri X : ");
        int x = nhap.nextInt();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]==x){
                dem = dem+1;
            }
        }
        if(dem==0){
            System.out.println("So X ban nhap khong co trong mang");
        }else{
            System.out.print("So X ban nhap xuat hien "+dem+" lan trong mang");
        }
    }
}
