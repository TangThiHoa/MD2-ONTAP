package ChuoiMang.HamXuLiChuoi;

public class CompareTo {
    public static void main(String[] args) {
        int result ;
        String str1 = "Happy new year !";
        String str2 = "Happy new year ";
        result = str1.compareTo(str2);     //tu khoa so sanh compareTo
        if (result == 0 ){
            System.out.println("Hai chuoi bang nhau ");
        }else if (result < 0 ){
            System.out.println("Chuoi str1 < chuoi str2");
        }else {
            System.out.println("Chuoi str1 > chuoi str2");
        }


    }
}
