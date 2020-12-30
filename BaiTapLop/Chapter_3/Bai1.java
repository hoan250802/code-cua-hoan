package BaiTapLop.Chapter_3;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cho mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap gia tri cho a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Mang vua nhap la : ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        int c = a[0] + a[n];
        System.out.print("Tong cua gia tri dau tien va gia tri cuoi cung la : "+c);
    }
}
