package LABTUAN3;
import java.util.Scanner;
public class DSHocSinh {
    private HocSinh ds[];
    private int soluong;
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        soluong = sc.nextInt();
        ds = new HocSinh[soluong];

        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ":");
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }

    public void xuatDS() {
        System.out.println("\nDanh sách học sinh:");
        for (int i = 0; i < soluong; i++) {
            ds[i].output();
        }
    }

    public void sapXep() {
        for (int i = 0; i < soluong - 1; i++) {
            for (int j = i + 1; j < soluong; j++) {
                if (ds[i].getDtb() < ds[j].getDtb()) {
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
