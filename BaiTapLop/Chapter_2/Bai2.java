package BaiTapLop.Chapter_2;

import java.util.Scanner;

public class Bai2 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = nhap.nextInt();
        int c;
        for (int i=1;i<=20;i++){
            c = i*n;
            System.out.println("Ket qua cua phep nhan n voi "+ i+" la : "+c);
        }
    }
}
