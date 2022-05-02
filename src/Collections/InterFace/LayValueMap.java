package Collections.InterFace;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LayValueMap {
    public static void main(String[] args) {
        //Khai báo map và thêm các phần tử vào map
        Map<String, String> mapLanguages = new TreeMap<>();
        mapLanguages.put("CSLT", "Cơ sở lập trình");
        mapLanguages.put("C++", "C++");
        mapLanguages.put("C#", "C Sharp");
        mapLanguages.put("PHP", "PHP");
        mapLanguages.put("Java", "Java");

        //khởi tạo set chứa toàn bộ các entry ( key và value )
        Set<Map.Entry<String,String>> setLanguages = mapLanguages.entrySet();
        System.out.println("Các entry có trong setLanguages:");
        System.out.println(setLanguages);

        //Có thể sử dụng forEach lấy toàn bộ entry trong map
        System.out.println("Sau khi sd forEach : ");
        for (Map.Entry<String, String> entry : mapLanguages.entrySet()) {
            String String = entry.getKey();
            java.lang.String value = entry.getValue();
            System.out.println(value);
        }
    }
    }

