package Chapter5;

import java.util.Scanner;

public class Baitap5_2 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = nhap.nextInt();
        int a[] = new int [n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap gia tri cua phan tu a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Nhap gia tri can tim : ");
        int f = nhap.nextInt();
        for (int i=0; i<n; i++){
            if (a[i] == f){
                System.out.print("So ban nhap o vi tri thu " + i);
            } else {
                System.out.print("So ban nhap trong co trong mang... Xin vui long nhap lai !");
                break;
            }
        }
    }
}
