package OnCauTrucDieuKien.IfElse;

import java.util.Scanner;

public class KiemTraChanLeIfElse {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a ");
        a = sc.nextInt();
        if (a%2 == 0 ){
            System.out.println("So chan ");
        }else {
            System.out.println("So le ");
        }
    }
}
