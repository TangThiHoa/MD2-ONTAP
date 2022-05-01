package OnCauTrucDieuKien.IfElse;

import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        int a , b ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a = sc.nextInt();
        System.out.println("Nhap b : ");
        b = sc.nextInt();
        int min = a ;
        if (a > b ){
            min = b ;
            System.out.println("So nho nhat trong 2 so  :" + min );



        }

    }
}
