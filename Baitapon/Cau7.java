package Baitapon;

import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int a = nhap.nextInt();
        System.out.print("Nhap so b : ");
        int b = nhap.nextInt();
        System.out.println("Bat dau hoan vi . . .");
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
