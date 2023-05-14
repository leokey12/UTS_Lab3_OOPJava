package SoalNomor4;
public class Matematika {
    private double panjangrusuk;

    //  Ini untuk menghitung rumus Volume kubus

    public Matematika(){
        this.panjangrusuk = 15;
    }
    public Matematika(double panjangrusuk) {
        this.panjangrusuk = panjangrusuk;
    }

    public double hitungResult() {
        return panjangrusuk* panjangrusuk* panjangrusuk;
    }
}

