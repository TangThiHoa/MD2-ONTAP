package QuanLiPhongChoThue;

import java.util.Scanner;

public class HoaDon extends DsPhong{
    private int id ;
    private String tenNV;
    private String tenKH;
    private int ngayBĐ;
    private int ngayKT ;
    DsPhong dsPhong = new DsPhong();
    public HoaDon( int gia, int id, String tenNV, String tenKH, int ngayBĐ, int ngayKT ) {

//        super(gia);
        this.id = id;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.ngayBĐ = ngayBĐ;
        this.ngayKT = ngayKT;
        dsPhong.getGia();




    }

    public HoaDon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNgayBĐ() {
        return ngayBĐ;
    }

    public void setNgayBĐ(int ngayBĐ) {
        this.ngayBĐ = ngayBĐ;
    }

    public int getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(int ngayKT) {
        this.ngayKT = ngayKT;
    }

    @Override
    public String toString() {
        return "HoaDo: id: " + id + ", tenNV: "
                + tenNV + ", tenKH: " + tenKH + ", ngayBĐ: "
                + ngayBĐ + ", ngayKT: " + ngayKT + "gia: " + dsPhong.getGia();
    }
    public void inHoaDon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        System.out.println("Nhap ten nv : ");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay BĐ: ");
        int ngayDatPhong = scanner.nextInt();
        System.out.println("Nhap nhay KT: ");
        int ngayKetThuc = scanner.nextInt();




    }
}
