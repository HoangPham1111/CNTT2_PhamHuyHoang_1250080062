package LABTUAN3;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        System.out.print("Phân số p1 (mặc định): ");
        p1.xuatPhanSo();
        System.out.println("Nhập phân số p1:");
        p1.nhapPhanSo();
        System.out.print("Phân số p1 sau khi nhập: ");
        p1.xuatPhanSo();
        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("Phân số p2 = ");
        p2.xuatPhanSo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số cho p3: ");
        int t = sc.nextInt();
        System.out.print("Nhập mẫu số cho p3: ");
        int m;
        do {
            m = sc.nextInt();
            if (m == 0) System.out.print("Mẫu phải khác 0. Nhập lại: ");
        } while (m == 0);
        PhanSo p3 = new PhanSo(t, m);
        System.out.print("Phân số p3 = ");
        p3.xuatPhanSo();
        PhanSo p4 = p1.cong(p3);
        System.out.print("Phân số p1 + p3 = ");
        p4.xuatPhanSo();
        PhanSo p5 = new PhanSo(p4);
        System.out.print("Phân số p5 (sao chép từ p4) = ");
        p5.xuatPhanSo();
        PhanSo p6 = p4.nhan(p2);
        System.out.print("Phân số p4 * p2 = ");
        p6.xuatPhanSo();
    }
}

