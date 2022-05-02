package Collections.InterFace;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SdMap {
    public static void main(String[] args) {
        //Khai bao Map có tên hashMap và Class là HashMap
        //Mỗi phần tử trong map gồm: key(interger) , value(String)
        Map<Integer, String> hashMap = new HashMap<>();

        //Sd phương thức put để thêm value vào key
        //đối số thứ nhất  trong put  key : có kiểu Interger ,  value : đối số thứ 2 có kiểu string
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");
        hashMap.put(21, "Twenty first");
        hashMap.put(5, "Five");

        //khai báo map có tên linkedMap và Class là LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(21, "Twenty first");

        //Khai báo map có tên treemap và Class là TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(0, "Zero");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(21, "Twenty first");
        treeMap.put(5, "Five");


        System.out.println("Các phần tử có trong hashMap: ");
        System.out.println(hashMap);
        System.out.println("Các phần tử có trong linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Các phần tử có trong treeMap: ");
        System.out.println(treeMap);


    }
}
