package Collections.InterFace;

import java.util.ArrayList;
import java.util.List;

public class KhoiTaoList {
    public static void main(String[] args) {
        //Khai báo tên stringList , kiểu dữ liệu String
        List<String> stringList = new ArrayList<>();

        //Thêm các phần tử :
        stringList.add("hoa");
        stringList.add("hồng");
        stringList.add("đào");
        stringList.add("mai");

        for (int i = 0; i < stringList.size(); i++) {   //Duyệt mảng theo kích thước của stringList
            stringList.get(i);                          //lấy phần tử tại vị trí i thông qua hàm get
            System.out.println(stringList.get(i));
        }
        System.out.println("Duyệt theo 2 cách : ");
        for (String element: stringList) {             //Duyệt mảng theo đối tượng stringList có kiểu dữ liệu String
            System.out.println(element);               //element ở đây là tên biến
            
        }

    }
}
