package VongLap.TuKhoa;

public class Continue {
    public static void main(String[] args) {
        //viet chuong trinh thong bao lan lap
        int count ;
        for (count = 1 ; count <= 5 ; count++){
            System.out.println("Lan lap " + count);
            if (count < 4 ){   // neu count con < 4 thi quay lai vong for kiem tra dk lap
                continue;
            }
            System.out.println("Chao chao ! "); // neu cout khong nho hon 4 thi hien thi
        }

    }
}
