package BaiTapQuanLi.DocumentManagement;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang ;

    public Sach() {
    }

    public Sach(int soPhatHanh, String tenNXB ,String tenTacGia ,int soTrang )
    {
        super(soPhatHanh, tenNXB);
        this.tenTacGia= tenTacGia;
        this.soTrang=soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sách : " + super.toString() +
                "Tên tác giả :" + tenTacGia
                +"Số trang :" +  soTrang ;
    }

    public static void main(String[] args) {
        TaiLieu sach = new TaiLieu(1,"TTH");
        TaiLieu sach2 = new TaiLieu(13,"TTH");
        System.out.println(sach);
        System.out.println(sach2);
    }
}
