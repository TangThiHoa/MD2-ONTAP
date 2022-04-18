package Interface.PhuongTien;

import java.util.Arrays;

public class QuanLiOto implements  QuanLi <Oto>{
     private  Oto []danhsach = new Oto[3];
     private int size = 0;
     private String  xe = "audi";

    @Override
    public void them(Oto oto) {
        danhsach[size]=oto;
        size++;


    }

    @Override
    public void sua(String name, Oto oto) {
        danhsach[timkiem(name)]=oto;

    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timkiem(String name) {
        for (int i =0;i<size;i++){
            if (name==danhsach[i].getTen());
            return i ;
        }
        return -1;
    }

    @Override
    public void print() {
        for ( int i= 0 ; i<size;i++){
            System.out.println(danhsach[i]);
        }

    }

    @Override
    public void sapxep() {
        Arrays.sort(danhsach);
    }

    public static void main(String[] args) {
        QuanLiOto ql = new QuanLiOto();
        Oto mec=new Oto("hoda","pink","mé","12345",12);
        ql.them(mec);
        ql.print();
     }
}
