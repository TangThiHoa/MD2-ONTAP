package ChuoiMang.HamXuLiChuoi;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        String chuoi ;
        int aoDai ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki tu ban phim ");
        chuoi = sc.nextLine();
        aoDai = chuoi.length();               //Tinh do dai chuoi
        System.out.println( " Chuoi " + chuoi +" co do dai la "+ aoDai);
    }
}
