package VongLap.For;

import java.util.Scanner;

public class ForLong {
    public static void main(String[] args) {
        //Hien thi hai so khac nhau
        int a , b;
        Scanner sc = new Scanner(System.in);
        for (a = 1 ; a <=3 ; a ++){
            for (b = 1 ; b <= 2 ; b++){
                System.out.println( "a = " + a + "," + "b = " +  b );
            }
        }
    }
}
