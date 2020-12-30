import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cho mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n+1];
        System.out.println("Nhap du lieu cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = nhap.nextInt();
        }
        int loi = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 100 && a[i] <= 0) {
                loi = loi + 1;
            }
        }
        if (loi == 0) {
            System.out.print("");
        } else {
            System.out.println("Vui long nhap du lieu trong mang lon hon 0 va nho hon 100 !");
        }
        System.out.print("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // cau 1 : Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
        System.out.println();
        int max = a[0];
        int max2 = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (max2 < a[i] && a[i] < max) {
                max2 = a[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang la : " + max);
        System.out.println("Gia tri lon thu 2 trong mang la : " + max2);
        // Cau 2 : Sắp xếp mảng theo thứ tự giảm dần.
        int temp;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Ket qua sau khi xap xep la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        // Cau 3 : Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính sắp xếp giảm dần.
        System.out.print("Nhập phần tử x = ");
        int x = nhap.nextInt();
        System.out.printf("\nChèn phần tử %d vào mảng.", x);
        a = insert(a, x);
        System.out.print("\nMảng sau khi chèn: ");
        show(a);
    }
    public static void sortASC(int [] a) {
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static int [] insert(int [] a, int x) {
        int arrIndex = a.length - 1;
        int tempIndex = a.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && a[arrIndex] < x) {
                tempArr[i] = a[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = x;
                    inserted = true;
                } else {
                    tempArr[i] = a[arrIndex--];
                }
            }
        }
        return tempArr;
    }
    public static void show(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
