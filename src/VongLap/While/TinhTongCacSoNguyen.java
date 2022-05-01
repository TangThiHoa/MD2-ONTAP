package VongLap.While;

import java.util.Scanner;

public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        int a ;
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        while (sum < 100){
            System.out.println("Nhap vao so nguyen bat ki : ");
            a = sc .nextInt();
            sum += a ;
        }
        System.out.println("Tong cac so nguyen vua nhap " + sum);
    }
}
