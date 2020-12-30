package BaiTapLop.Chapter_3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so dong : ");
        int n = nhap.nextInt();
        System.out.print("Nhap so cot : ");
        int m = nhap.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap gia tri phan tu a[" + i + "][" + j + "] : ");
                a[i][j] = nhap.nextInt();
            }
        }
        System.out.println("Mang vua nhap la :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("Cac phan tu nam tren dong thu 3 la : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 2){
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("Ban chua nhap du 3 dong !");
                }
            }
        }
    }
}
