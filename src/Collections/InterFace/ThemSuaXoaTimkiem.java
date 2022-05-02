package Collections.InterFace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThemSuaXoaTimkiem {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        //thêm
        System.out.println("Sau khi thêm : ");
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add(2,"ni"); //thêm ni vào  sau chỉ số 2
        for ( String str :stringList) {
            System.out.println(str);

        }

        //xóa
        System.out.println("Sau khi xóa : ");
        stringList.remove(3);      //xóa phần tử có chỉ số 3
        stringList.remove("4");     //xóa trực tiếp kh thông qua chỉ số
        for ( String str :stringList) {
            System.out.println(str);

        }

        //Tìm kiếm một phần tử
        if (stringList.contains("2")){                     //tìm kiếm trực tiếp , sd contains
            System.out.println("Tìm thấy : ");
        }else {
            System.out.println("Khong tìm thấy : ");
        }
        for ( String str :stringList) {
            System.out.println(str);

        }
        System.out.println("Tìm kiếm theo vị trí : ");        //tìm kiếm vị trí xuất hiện đầu tiên của 1 phần tử trong list
        int indexOf1 = stringList.indexOf("mo");
        System.out.println("Chỉ số xuất hiện phầ tử " + indexOf1);

        System.out.println("Sau khi sắp xếp ");
        Collections.sort(stringList);
        for ( String str :stringList) {
            System.out.println(str);

        }







    }
}
