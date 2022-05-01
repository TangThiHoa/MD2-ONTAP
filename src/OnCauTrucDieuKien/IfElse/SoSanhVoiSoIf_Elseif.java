package OnCauTrucDieuKien.IfElse;

import java.util.Scanner;

public class SoSanhVoiSoIf_Elseif {
    public static void main(String[] args) {
        //So sanh voi so 10
        float a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so can so sanh : ");
        a = sc.nextFloat();
        if (a < 10 ){
            System.out.println("So vua nhap be hon 10");
        }else if (a == 10 ){
            System.out.println("So vua nhap bang 10 ");
        }else {
            System.out.println("So vua nhap lon hon 10");
        }

    }
}
