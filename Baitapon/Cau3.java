package Baitapon;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap a : ");
        double a=nhap.nextDouble();
        System.out.print("Nhap b : ");
        double b=nhap.nextDouble();
        if(a==0){
            if(b==0){
                System.out.print("Phuong trinh vo so nghiem !");
            } else {
                System.out.print("Phuong trinh vo nghiem !");
            }
        } else {
            System.out.print("Phuong trinh co nghiem x = "+(-b/a));
        }
    }
}
