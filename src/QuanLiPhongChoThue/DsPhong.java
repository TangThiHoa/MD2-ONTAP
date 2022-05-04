package QuanLiPhongChoThue;

public class DsPhong {
    private static int autoid ;
    private int id ;
    private String levelPhong ;
    private int soNVS ;
    private int soPhongNgu ;
    private int gia  ;

    public DsPhong() {
    }

    public DsPhong( String levelPhong, int soNVS, int soPhongNgu, int gia) {
        this.id = autoid;
        autoid++ ;
        this.levelPhong = levelPhong;
        this.soNVS = soNVS;
        this.soPhongNgu = soPhongNgu;
        this.gia = gia;
    }

    public static int getAutoid() {
        return autoid;
    }

    public static void setAutoid(int autoid) {
        DsPhong.autoid = autoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevelPhong() {
        return levelPhong;
    }

    public void setLevelPhong(String levelPhong) {
        this.levelPhong = levelPhong;
    }

    public int getSoNVS() {
        return soNVS;
    }

    public void setSoNVS(int soNVS) {
        this.soNVS = soNVS;
    }

    public int getSoPhongNgu() {
        return soPhongNgu;
    }

    public void setSoPhongNgu(int soPhongNgu) {
        this.soPhongNgu = soPhongNgu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "DsPhong{" +
                "id=" + id +
                ", levelPhong='" + levelPhong + '\'' +
                ", soNVS=" + soNVS +
                ", soPhongNgu=" + soPhongNgu +
                ", gia=" + gia +
                '}';
    }

    public static void main(String[] args) {
        DsPhong dsPhong = new DsPhong("A",2,2,2000);
        DsPhong dsPhong2 = new DsPhong("B",3,3,4000);
        System.out.println(dsPhong);
        System.out.println(dsPhong2);

    }
}
