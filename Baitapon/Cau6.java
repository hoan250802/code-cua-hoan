package Baitapon;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = nhap.nextInt();
        if(kiemtrascp(n)){
            System.out.println(n+" la so chinh phuong");
        } else {
            System.out.println(n+" khong phai la so chinh phuong");
        }
    }
    static boolean kiemtrascp(double n)
    {
        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0);
    }
}
