// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Anjing.java
// Deskripsi: Berisi kelas Anjing yang merupakan subclass dari Anabul dengan implementasi metode suara dan gerak

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " berbunyi: Guk-guk");
    }

    public void gerak() {
        System.out.println(nama + " bergerak: Melata");
    }
}