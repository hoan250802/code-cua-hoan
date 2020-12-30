package Chapter6;

import java.util.Scanner;

public class Vidu6_17 {
    public static void main(String[] args) {
        String chuoi;
        int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
            chuoi = scanner.nextLine();
        } while (chuoi.length() > 80);

        for (int i = 0; i < chuoi.length(); i++) {

            if (Character.isUpperCase(chuoi.charAt(i))) {
                soKyTuInHoa++;
            }

            if (Character.isLowerCase(chuoi.charAt(i))) {
                soKyTuInThuong++;
            }

            if (Character.isDigit(chuoi.charAt(i))) {
                soChuSo++;
            }
        }
        System.out.println("Trong chuỗi " + chuoi +
                " có " + soKyTuInHoa + " ký tự in hoa," +
                " có " + soKyTuInThuong + " ký tự in thường" +
                " và có " + soChuSo + " số.");
    }
}
