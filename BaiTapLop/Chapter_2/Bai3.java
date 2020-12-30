package BaiTapLop.Chapter_2;

import java.util.Scanner;

public class Bai3 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = nhap.nextInt();
        System.out.print("Tat ca so nguyen tu 0 toi n la :");
        for (int i=0; i<=n; i++) {
            System.out.print(i+ " ");
        }
    }
}
