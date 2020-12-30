package Baitapon;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        double a = nhap.nextDouble();
        System.out.print("Nhap so b : ");
        double b = nhap.nextDouble();
        double delta = b*b-4*a;
        if(delta<0){
            System.out.print("Phuong trinh vo nghiem !");
        }else if(delta==0){
            System.out.print("Phuong trinh co nghiem kep x = "+(-b/a));
        }else if(delta>0){
            System.out.println("Phuong trinh co 2 nghiem : ");
            System.out.println("x1 = "+((-b+Math.sqrt(delta))/(2*a)));
            System.out.println("x2 = "+((-b-Math.sqrt(delta))/(2*a)));
        }
    }
}
