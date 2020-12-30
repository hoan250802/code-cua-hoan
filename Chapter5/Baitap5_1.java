package Chapter5;

import java.util.Scanner;

public class Baitap5_1 {
    private static Scanner nhap;

    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n=nhap.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap gia tri cua a["+i+"] : ");
            a[i]=nhap.nextInt();
        }
        for (int i=0;i<n-1;i++){
            int temp = a[i];
            for (int j=i+1;j<n;j++){
                if (temp < a[j]){
                    a[i] = a[j];
                    a[j] = temp;
                    temp = a[i];
                }
            }
        }
        System.out.print("Mang duoc sap xep giam dan : ");
        for (int x : a){
            System.out.print(x + " ");
        }
    }
}
