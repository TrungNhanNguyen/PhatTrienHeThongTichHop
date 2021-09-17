public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }


    // Ham hien thi phan so
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Ham cong 2 phan so
    public PhanSo tong(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham tru 2 phan so
    public PhanSo hieu(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nhan 2 phan so
    public PhanSo tich(PhanSo ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nghich dao phan so
    public void inverse() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // Chia 2 phan so
    public PhanSo thuong(PhanSo ps2) {
        // Nghich dao ps2
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;

        // Nhan this vs ps2 (da nghich dao)
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2,4);
        PhanSo ps2 = new PhanSo(3,4);
        PhanSo tong;
        PhanSo hieu;
        System.out.println("phân sô thứ nhất là:");
        ps1.display();
        System.out.println("phân sô thứ hai là:");
        ps2.display();
        System.out.println("tổng 2 phân số là:");
        tong = ps1.tong(ps2);
        tong.display();
        System.out.println("hiệu 2 phân số là:");
        hieu = ps1.hieu(ps2);
        hieu.display();
    }
}
