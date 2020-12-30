package BaiTapLop;

import java.util.Scanner;

public class bai1_3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang : ");
        int n=nhap.nextInt();
        int[] a= new int[n];
        System.out.println("Nhap gia tri cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if(max<a[i]){
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println();
        System.out.println("Gia tri lon nhat cua mang la : "+max);
        System.out.println("Gia tri nho nhat cua mang la : "+min);
    }
}
