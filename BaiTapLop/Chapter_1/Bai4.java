package BaiTapLop.Chapter_1;

import java.util.Scanner;

public class Bai4 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.println("Vui long nhap 3 canh cua tam giac : ");
        System.out.print("A = ");
        int a = nhap.nextInt();
        System.out.print("B = ");
        int b = nhap.nextInt();
        System.out.print("C = ");
        int c = nhap.nextInt();
        if (a*a+b*b==c*c) {
            System.out.print("Day la 3 canh cua tam giac vuong !");
        } else if (a*a+c*c==b*b) {
            System.out.print("Day la 3 canh cua tam giac vuong !");
        } else if (b*b+c*c==a*a) {
            System.out.print("Day la 3 canh cua tam giac vuong !");
        } else {
            System.out.print("Day khong phai 3 canh cua tam giac vuong !");
        }
    }
}
