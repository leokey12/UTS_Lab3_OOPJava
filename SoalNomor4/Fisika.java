package SoalNomor4;

public class Fisika {
    private double massa;
    private double gravitasi;
    private double ketinggian;


    //  Ini untuk menghitung rumus Energi Potensial
   public Fisika (){
       this.massa = 5;
       this.gravitasi = 10;
       this.ketinggian = 20;
   }
    public Fisika(double massa,double gravitasi, double ketinggian) {
        this.massa = massa;
        this.gravitasi =gravitasi;
        this.ketinggian = ketinggian;
    }

    public double hitungResult() {
        return massa * gravitasi * ketinggian;
    }
}
