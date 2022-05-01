package File;

import java.io.File;
import java.io.PrintWriter;

public class TaoFile {
    public static void main(String[] args) throws Exception {
        //Tạo file
        File file = new File("File/inputfile");
        file.createNewFile();
        File file1 = new File("File/outputfile");
        file1.createNewFile();
        PrintWriter pw = new PrintWriter(file1);
        pw.write("Hế lô các đại ca ");
        pw.close();



    }
}
