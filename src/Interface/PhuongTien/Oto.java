package Interface.PhuongTien;

public class Oto extends PhuongTien implements Comparable<Oto>{
    private  int soCho ;
    Oto(){}

    public Oto(int soCho) {
        this.soCho = soCho;
    }

    public Oto(String hang, String mau, String ten, String gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soCho=" + soCho + " ten " + getTen() + " gia " + getGia()+
                '}';
    }

    @Override
    public int compareTo(Oto o) {
       return 0;
    }
}
