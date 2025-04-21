
package LABTUAN3;
public class demopoint {
    public static void main(String[] args) {
        point2D p1 = new point2D(); 
       point2D p2 = new point2D(3.5f, 2.0f); 

        System.out.print("Tọa độ điểm p1: ");
        p1.inToaDo();

        System.out.print("Tọa độ điểm p2: ");
        p2.inToaDo();

        point2D tong = p1.cong(p2);
        System.out.print("Tổng p1 + p2 = ");
        tong.inToaDo();

        point2D doiXung = p2.doiXungTrucHoanh();
        System.out.print("Điểm đối xứng của p2 qua trục hoành: ");
        doiXung.inToaDo();
    }
}

