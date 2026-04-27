// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Burung.java
// Deskripsi: Berisi kelas Burung yang merupakan subclass dari Anabul dengan implementasi metode suara dan gerak

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " berbunyi: Cuit");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Terbang");
    }
}