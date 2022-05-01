package File;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaiPt {
    public static void main(String[] args) throws Exception {
        //Tạo file
        File Pt = new File("inputPt.txt");
        Pt.createNewFile();
        File Pt1 = new File("outputPt.txt");
        Pt1.createNewFile();
        PrintWriter pw = new PrintWriter("Pt1");
        // Nhập số
        Scanner sc = new Scanner(Pt);
        List<Integer>integers = new ArrayList<>();
        while (sc.hasNext()){
            integers.add(sc.nextInt());
        }
//        if ()



    }
}
