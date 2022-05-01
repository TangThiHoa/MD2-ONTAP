package VongLap.TuKhoa;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        //Tinh tong cac so nguyen duoc nhap tu ban phim
        int i  ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao i ");
            i = sc.nextInt();
            if (i < 0 ){         // neu nhap so be hon 0 thi se ket thuc vong lap va thuc hien ngoai vong lap
                break;
            }
            sum += i ;
        }while (i >= 0 );        // con i >= 0 thi tiep tuc thuc hien
        System.out.println("Ket qua = "+ sum );
    }
}
