package Chapter5;

import java.util.Scanner;

public class Baitap5_3 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap gia tri phan tu a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        for (int i=0; i<n-1; i++){
            int temp = a[i];
            for (int j=i+1; j<n; j++) {
                if (a[j] > temp){
                    a[i]=a[j];
                    a[j]=temp;
                    temp=a[i];
                }
            }
            System.out.print("Gia tri lon nhat cua mang la : "+temp);
            break;
        }
    }
}
