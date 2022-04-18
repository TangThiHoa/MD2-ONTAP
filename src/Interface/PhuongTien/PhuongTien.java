package Interface.PhuongTien;

public abstract  class PhuongTien {
    private String hang ;
    private  String mau ;
    private String ten ;
    private String gia ;
    PhuongTien(){}

    public PhuongTien(String hang, String mau, String ten, String gia) {

        this.hang = hang;
        this.mau = mau;
        this.ten = ten;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "hang='" + hang + '\'' +
                ", mau='" + mau + '\'' +
                ", ten='" + ten + '\'' +
                ", gia='" + gia + '\'' +
                '}';
    }
}
