package BaiTapQuanLi.DocumentManagement;

public class TaiLieu {
    private static int autoId = 0;
    private int ma ;
    private int soPhatHanh ;
    private String tenNXB ;

    public TaiLieu() {
    }

    public TaiLieu( int soPhatHanh, String tenNXB) {
        this.ma = autoId;
        autoId++ ;
        this.soPhatHanh = soPhatHanh;
        this.tenNXB = tenNXB;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        TaiLieu.autoId = autoId;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    @Override
    public String toString() {
        return  ma +
        "Số PH :"+" " + soPhatHanh +
        "Tên NXB :"+" "+  tenNXB ;
    }

    public static void main(String[] args) {
        TaiLieu taiLieu = new TaiLieu(1,"TTH");
        System.out.println(taiLieu);
        TaiLieu taiLieu2 = new TaiLieu(5,"TTH");
        System.out.println(taiLieu2);
    }
}
