package VongLap.DoWhile;

import java.util.Scanner;

public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        //Nhap casc so nguyen va tinh tong cac so do
        int a ;
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so nguyen bat ki ");
            a = sc .nextInt();
            sum += a ;
        }while (sum < 100);
        System.out.println("Tong cac so nguyen vua nhap la " + sum);
    }
}
