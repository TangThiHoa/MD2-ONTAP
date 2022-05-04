package BaiTapQuanLi.DocumentManagement;

public class Bao extends TaiLieu{
    private int thangPH;

    public Bao(int soPhatHanh, String tenNXB) {
        super(soPhatHanh, tenNXB);
    }

    public Bao(int soPhatHanh, String tenNXB, int thangPH) {
        super(soPhatHanh, tenNXB);
        this.thangPH = thangPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "thangPH=" + thangPH +
                '}';
    }

    public static void main(String[] args) {
        TaiLieu bao = new TaiLieu(1,"TTH");
        TaiLieu bao1 = new TaiLieu(14,"TTH");
        System.out.println(bao);
        System.out.println(bao1);
    }
}
