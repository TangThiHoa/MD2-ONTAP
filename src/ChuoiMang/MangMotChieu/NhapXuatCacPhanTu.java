package ChuoiMang.MangMotChieu;

import java.util.Scanner;

public class NhapXuatCacPhanTu {
    public static void main(String[] args) {
        int size ;                                  //Kích thước mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng :");
        size = sc.nextInt();
        int[]arr = new int[size];      // mảng có tên arr và kích thước = size
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ i " + i + ": ");
            arr[i]= sc.nextInt();                  //NHập giá trị cho phần tử

        }
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i +": "+ arr[i]);

        }

    }
}
