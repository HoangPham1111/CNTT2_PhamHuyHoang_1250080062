package LABTUAN3;
import java.util.ArrayList;
public class DsachNvien {
    private ArrayList<NhanVien> danhSach = new ArrayList<>();
    public void nhapDanhSach() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            NhanVien nv = new NhanVien();
            nv.nhap();
            danhSach.add(nv);
        }
    }
    public void xuatDanhSach() {
        for (NhanVien nv : danhSach) {
            nv.xuat();
        }
    }
    public int soLuongNhanVien() {
        return danhSach.size();
    }
    public void inNhanVienCoHeSoLuongCaoNhat() {
        if (danhSach.isEmpty()) return;

        NhanVien max = danhSach.get(0);
        for (NhanVien nv : danhSach) {
            if (nv.getHeSoLuong() > max.getHeSoLuong()) {
                max = nv;
            }
        }
        System.out.println("Nhân viên có hệ số lương cao nhất:");
        max.xuat();
    }
}
