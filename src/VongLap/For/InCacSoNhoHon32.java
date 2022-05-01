package VongLap.For;

import java.util.Scanner;

public class InCacSoNhoHon32 {
    public static void main(String[] args) {
        //vong lap 1 & 3 co 2 bieu thuc don
        int a , b  ;
        Scanner sc = new Scanner(System.in);
        for (a = 0 , b = a +3 ; b < 8 ; a++ , b++){
            System.out.println(a + "," + b );
        }
    }
}
