// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Kucing.java
// Deskripsi: Berisi kelas Kucing yang merupakan subclass dari Anabul dengan implementasi metode suara dan gerak

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " berbunyi: Meong");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}