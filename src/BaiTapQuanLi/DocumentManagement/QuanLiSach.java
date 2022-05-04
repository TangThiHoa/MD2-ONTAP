package BaiTapQuanLi.DocumentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSach implements QuanLiTaiLieu<TaiLieu> {
    private List<TaiLieu> taiLieuList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QuanLiSach() {

    }

    public  TaiLieu taoSach() {
        System.out.println("Nhập tên NXB ");
        String tenNXB = sc.nextLine();
        System.out.println("Nhập số phát hành  ");
        int soPH = sc.nextInt();
        System.out.println("Nhập tên Tác giả  ");
        sc.nextLine();
        String tacGia = sc.nextLine();
        System.out.println("Nhập số trang  ");
        int soTrang = sc.nextInt();


        return new Sach(soPH,tenNXB,tacGia,soTrang );

    }
    public QuanLiSach(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }


    @Override
    public void them(TaiLieu taiLieu) {
        taiLieuList.add(taiLieu);


    }

    @Override
    public void timKiem(int id) {
        for (int i = 0; i < taiLieuList.size(); i++) {
            System.out.println(taiLieuList.get(i));

        }
    }

    @Override
    public void findByName(String name) {

    }

    @Override
    public void sua(String name, int id) {

    }

    @Override
    public void xoa(int id) {

    }

    @Override
    public void hienThi() {
        for (TaiLieu t : taiLieuList) {
            System.out.println(t);

        }

    }


    @Override
    public void thoat() {

    }

    public static void main(String[] args) {
            QuanLiSach quanLiSach = new QuanLiSach();
            quanLiSach.hienThi();
            quanLiSach.them(quanLiSach.taoSach());
            quanLiSach.hienThi();
    }

}