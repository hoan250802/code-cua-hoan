package Baitapon;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = nhap.nextInt();
        if(kiemtrasnt(n)){
            System.out.println(n+" la so nguyen to");
        } else {
            System.out.println(n+" khong phai la so nguyen to");
        }
    }
    public static boolean kiemtrasnt(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
