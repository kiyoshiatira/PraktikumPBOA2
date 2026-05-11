// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Anjing.java
// Deskripsi: Berisi kelas Anjing dengan atribut Panggilan dan metode suara, gerak, serta tampil   


public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: guk-guk.");
    }
}