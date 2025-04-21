package LABTUAN3;
import java.util.Scanner;
public class PhanSo {
    private int tu;
    private int mau;
    public PhanSo() {
        tu = 0;
        mau = 1;
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = (mau == 0) ? 1 : mau;
    }
    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tu = sc.nextInt();
        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            mau = sc.nextInt();
        } while (mau == 0);
    }
    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }
    public int USCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }
    public void rutGon() {
        int uscln = USCLN(tu, mau);
        tu = tu / uscln;
        mau = mau / uscln;
    }
    public PhanSo cong(PhanSo p) {
        int t = this.tu * p.mau + p.tu * this.mau;
        int m = this.mau * p.mau;
        PhanSo kq = new PhanSo(t, m);
        kq.rutGon();
        return kq;
    }
    public PhanSo tru(PhanSo p) {
        int t = this.tu * p.mau - p.tu * this.mau;
        int m = this.mau * p.mau;
        PhanSo kq = new PhanSo(t, m);
        kq.rutGon();
        return kq;
    }
    public PhanSo nhan(PhanSo p) {
        int t = this.tu * p.tu;
        int m = this.mau * p.mau;
        PhanSo kq = new PhanSo(t, m);
        kq.rutGon();
        return kq;
    }
    public PhanSo chia(PhanSo p) {
        int t = this.tu * p.mau;
        int m = this.mau * p.tu;
        PhanSo kq = new PhanSo(t, m);
        kq.rutGon();
        return kq;
    }
}
