package Baitapon;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so bat ky : ");
        int n = nhap.nextInt();
        if(n<2){
            System.out.print("Vui long nhap so lon hon 2 !!");
        }
        if(n%2==0){
            System.out.print(n+" la so chan !!");
        } else {
            System.out.print(n+" la so le !!");
        }
    }
}
