package Baitapon;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so a :");
        int a = nhap.nextInt();
        System.out.print("Nhap so b :");
        int b = nhap.nextInt();
        System.out.print("Nhap so c :");
        int c = nhap.nextInt();
        if (a<2&&b<2&&c<2){
            System.out.print("Vui long nhap so a,b,c lon hon 2");
        }
        int temp = 0;
        if (a>b&&a>c){
            temp = a;
        } else if(b>a&&b>c){
            temp = b;
        } else if(c>a&&c>b){
            temp = c;
        }
        System.out.print("So lon nhat trong 3 so ban vua nhap la : "+temp);
    }
}
