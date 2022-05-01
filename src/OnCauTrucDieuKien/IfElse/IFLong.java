package OnCauTrucDieuKien.IfElse;

import java.util.Scanner;

public class IFLong {
    public static void main(String[] args) {
        int a , b , c , max ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a ");
        a = scanner.nextInt();
        System.out.println("Nhap vao b");
        b = scanner.nextInt();
        System.out.println("Nhap vao c ");
        c = scanner.nextInt();
        if (a >= b){
            if (a >= c ){
                max = a ;
            }else {
                max = c ;
            }

        }else if (b >= c ){
            max = b ;
        }else {
            max = c ;
        }
        System.out.println("So lon nhat la " + max);


    }

}
