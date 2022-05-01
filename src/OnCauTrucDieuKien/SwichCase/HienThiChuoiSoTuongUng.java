package OnCauTrucDieuKien.SwichCase;

import java.util.Scanner;

public class HienThiChuoiSoTuongUng {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ki  ");
        number = sc.nextInt();
        switch (number){
            case 0 :
                System.out.println("So 0");
                break;
            case 1 :
            case 2 :
                System.out.println("So nho ");
                break;
            case 3:
            case 4 :
            case 5 :
                System.out.println("So trung binh ");
                break;
            default:
                System.out.println("So lon nhat ");

        }

    }
}
