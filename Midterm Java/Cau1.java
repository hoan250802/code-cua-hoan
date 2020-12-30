import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so X : ");
        int x = nhap.nextInt();
        System.out.print("Nhap so Y : ");
        int y = nhap.nextInt();
        if(x<=3&&y<=3){
            System.out.println("Vui long nhap X, Y lon hon 3");
        }
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        int doi = 0;
        doi = x;
        x = y;
        y = doi;
        System.out.println("Bat dau hoan vi . . .");
        System.out.println("Ket qua sau khi hoan vi : ");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
