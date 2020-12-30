package BaiTapLop.Chapter_1;

import java.util.Scanner;

public class Bai1 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap mot so cua ban vao : ");
        int n = nhap.nextInt();
        if (n>=0) {
            System.out.print("So ban vua nhap la so nguyen duong !");
        } else {
            System.out.print("So ban vua nhap la so nguyen am !");
        }
    }
}
