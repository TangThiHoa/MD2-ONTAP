package OOP.Object_AccesModifier;

public class TaoDoiTuong {
    //Hàm tạo có đối số :
    public TaoDoiTuong(String name ){
        System.out.println("Your name :  "+ name);
    }

    public static void main(String[] args) {
        //Khởi tạo đối tượng với giá trị truyền vào là TangHoa
        TaoDoiTuong taoDoiTuong = new TaoDoiTuong("TangHoa");
    }
}
