package BaiTapLop;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so hang ban muon hien thi : ");
        int n = nhap.nextInt();
        int i,j;
        i=1;
        while (i<n) {
            for (j=n-1; j>i; j--) {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(""+j);
            }
            for(j=2;j<=i;j++){
                System.out.print(""+j);
            }
            System.out.println();
            i=i+1;
        }
    }
}
