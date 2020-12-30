package Chapter5;

import java.util.Scanner;

public class Baitap5_6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so hang : ");
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
        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
