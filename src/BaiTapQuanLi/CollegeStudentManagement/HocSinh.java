package BaiTapQuanLi.CollegeStudentManagement;

public class HocSinh {
    private int id ;
    private String hoTen ;
    private String diaChi;
    private String mucUuTien ;
    private String khoi;

    public HocSinh() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    @Override
    public String toString() {
        return "hocSinh{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                ", khoi='" + khoi + '\'' +
                '}';
    }
}
