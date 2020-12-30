package Baitapon;

import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int a = nhap.nextInt();
        System.out.print("Nhap so b : ");
        int b = nhap.nextInt();
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
    }
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
}
