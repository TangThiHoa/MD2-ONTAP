package BaiTapQuanLi.DocumentManagement;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public TapChi(int soPhatHanh, String tenNXB, int soPH, int thangPH) {
        super(soPhatHanh, tenNXB);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public TapChi(int soPhatHanh, String tenNXB) {
        super(soPhatHanh, tenNXB);

    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPH=" + soPH +
                ", thangPH=" + thangPH +
                '}';
    }

    public static void main(String[] args) {
        TaiLieu tapChi = new TaiLieu(1,"tth");
        TaiLieu tapChi2 = new TaiLieu(1,"tth");
        System.out.println(tapChi);
        System.out.println(tapChi2);
    }
}
