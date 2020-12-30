package BaiTapLop.Chapter_1;

import java.util.Scanner;

public class Bai2 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap mot so bat ki : ");
        int n = nhap.nextInt();
        switch (n) {
            case 1 : System.out.print("Mot");
            break;
            case 2 : System.out.print("Hai");
            break;
            case 3 : System.out.print("Ba");
            break;
            case 4 : System.out.print("Bon");
            break;
            case 5 : System.out.print("Nam");
            break;
            case 6 : System.out.print("Sau");
            break;
            case 7 : System.out.print("Bay");
            break;
            case 8 : System.out.print("Tam");
            break;
            case 9 : System.out.print("Chin");
            break;
        }
    }
}
