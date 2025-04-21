package LABTUAN3;
public class demobai4 {
    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien();
        nv1.nhap();
        nv1.xuat();
        NhanVien nv2 = new NhanVien("NV02", "Nguyễn Văn A", 3000, 2.5);
        nv2.xuat();
        NhanVien nv3 = new NhanVien(nv2);
        nv3.setHoTen("Lê Thị B");
        nv3.xuat();
        NhanVien max = nv1;
        if (nv2.getHeSoLuong() > max.getHeSoLuong()) max = nv2;
        if (nv3.getHeSoLuong() > max.getHeSoLuong()) max = nv3;

        System.out.println("\nNhân viên có hệ số lương cao nhất:");
        max.xuat();
        DsachNvien ds = new  DsachNvien();
        ds.nhapDanhSach();
        System.out.println("\nDanh sách nhân viên:");
        ds.xuatDanhSach();
        System.out.println("\nSố lượng nhân viên: " + ds.soLuongNhanVien());
    }
}
