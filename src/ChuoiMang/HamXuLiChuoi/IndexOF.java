package ChuoiMang.HamXuLiChuoi;

public class IndexOF {
    public static void main(String[] args) {
        //Ham tra ve vi tri xuat hien dau tien cua chuoi str2 trong str1 .
        //Neu chuoi str2 khong co trong str1 thi result = -1
        int result ;
        String str1 = "Happy year new";
        String str2 = "Happy new";
        result =str1.indexOf(str2);
        System.out.println("Vi tri xuat hien dau tien cua str2 trong str1 la : "+ result);

    }
}
