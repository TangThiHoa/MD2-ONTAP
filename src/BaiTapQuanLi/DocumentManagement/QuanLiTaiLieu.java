package BaiTapQuanLi.DocumentManagement;

public interface QuanLiTaiLieu <T>{
    void them (T t );
    void timKiem (int id );
    void findByName (String name );
    void sua(String name ,int id );
    void xoa(int id );
    void hienThi();
    void thoat();

}
