package LABTUAN3;
public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public point2D cong(point2D other) {
        return new point2D(this.x + other.x, this.y + other.y);
    }
    public point2D doiXungTrucHoanh() {
        return new point2D(this.x, -this.y);
    }
    public void inToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
