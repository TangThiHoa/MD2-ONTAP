package OOP.Object_Class;

public class PhuongThuc {
    //Khai báo thuộc tính
    public String name ;
    private int age ;
    //Tạo một phương thức có kiểu trả về là void và không có tham số truyền vào
    //để gọi phương thức này trong main()thì phải khai báo là Static
    public static void nhapDe(){
        System.out.println("Có kiểu trả về void và kh có tham số truyền vào ");
    }

    //Tạo một phương thức có kiểu trả về là void , tham số truyền vào
    public static void themChuoi(String str ){
        System.out.println(str);
    }
    //Tạo một phương thức có kiểu trả về là int và có 2 tham số truyền vào
    public static int tinhTong(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        nhapDe();                                       //gọi phương thuc nhapDue
        themChuoi("chuối gì cũng ăn ");             //gọi phương thức themChuoi
        int c = tinhTong(6,8);                    //Tính tổng c=a+b
            System.out.println("Tổng = " + c );

    }
}
