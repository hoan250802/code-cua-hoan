package Chapter6;

import java.util.Scanner;

public class Vidu6_7 {
    public static void main(String[] args) {
        String chuoi;
        int doDai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ từ bàn phím: ");
        chuoi = scanner.nextLine();
        doDai = chuoi.length();
        System.out.println("Chuỗi " + chuoi + " có độ dài = " + doDai);
    }
}
