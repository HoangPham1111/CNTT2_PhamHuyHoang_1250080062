package LABTUAN3;
import java.util.Scanner;
public class HocSinh {
    private int maSo;
    private String hoTen;
    private float dtb;
    public int getMaSo() {
        return maSo;
    }
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDtb() {
        return dtb;
    }
    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
    public HocSinh() {
        this.maSo = 0;
        this.hoTen = null;
        this.dtb = 0f;
    }
    public HocSinh(int maSo, String hoTen, float dtb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }
    public HocSinh(HocSinh tmp) {
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.dtb = tmp.dtb;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        maSo = sc.nextInt();
        sc.nextLine();  
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        dtb = sc.nextFloat();
    }
    public void output() {
        System.out.println("MaSo = " + maSo + " - HoTen = " + hoTen + " - DTB = " + dtb);
    }
    public void rank() {
        if (dtb < 5)
            System.out.println("Xếp loại yếu");
        else if (dtb >= 5 && dtb < 7)
            System.out.println("Xếp loại trung bình");
        else {
         
        }
    }
}
