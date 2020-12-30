package BaiTapLop;

import java.util.Scanner;

public class bai1_6 {
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
        System.out.println();
        int[] chan = new int[n];
        int[] le = new int[n];
        int c=0,d=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0){
                chan[c]=a[i];
                c++;
            }else{
                le[d]=a[i];
                d++;
            }
        }
        System.out.print("Phan tu chan trong mang la :");
        for (int i = 0; i < c; i++) {
            System.out.print(chan[i]+" ");
        }
        System.out.println();
        System.out.print("Phan tu le trong mang la :");
        for (int i = 0; i < d; i++) {
            System.out.print(le[i]+" ");
        }
    }
}
