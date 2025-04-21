package LABTUAN3;
public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0;
        this.heSoLuong = 1;
    }
    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    public NhanVien(NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
    }
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public String getMaSo() {
        return maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập mã số nhân viên: ");
        maSo = sc.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
    }
    public void xuat() {
        System.out.println("Mã số: " + maSo + " | Họ tên: " + hoTen +
                " | Lương cơ bản: " + luongCoBan + " | Hệ số lương: " + heSoLuong +
                " | Lương: " + tinhLuong());
    }
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
}
