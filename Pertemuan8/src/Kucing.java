// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Kucing.java
// Deskripsi: Berisi kelas Kucing yang merupakan subclass dari Anabul dengan implementasi metode suara dan gerak

public class Kucing extends Anabul2 {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return this.bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: meong.");
    }
}