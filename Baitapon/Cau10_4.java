package Baitapon;

import java.util.Scanner;

public class Cau10_4 {
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
        int tb = 0;
        for (int i = 0; i < n; i++) {
            tb = tb+a[i];
        }
        tb=tb/n;
        System.out.println();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]>tb){
                dem = dem+1;
            }
        }
        System.out.print("Co "+ dem+ " gia tri lon hon gia tri trung binh cua cac so trong mang");
    }
}
