package BaiTapLop.Chapter_3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = nhap.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap du lieu cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.println("Cac so nguyen to trong day vua nhap la : ");
        for (int i = 0; i < n; i++) {
            if (kiemtrasonguyento(a[i])) {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static boolean kiemtrasonguyento(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] <= 1) {
                return false;
            }
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (a[i] % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
