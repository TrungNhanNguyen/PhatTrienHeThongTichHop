public class Point {
    private int ox;
    private int oy;



    Point(int ox,int oy) {
        this.ox = ox;
        this.oy = oy;
    }

    void inThongTin(){
        System.out.println("( "+ox+" , "+oy+" )");
    }

    public double khoancach() {
        double kc;
        kc = Math.sqrt(Math.pow((0 - this.ox), 2) + Math.pow((0 - this.oy), 2));
        return kc;
    }
    public static void main(String[] args) {
        Point a=new Point(3, 4);
        System.out.println("Điểm A có giá trị là");
        a.inThongTin();
        double kc = a.khoancach();
        System.out.println("Khoảng cách từ A điếm gốc tọa độ là: " +kc);
    }
}
