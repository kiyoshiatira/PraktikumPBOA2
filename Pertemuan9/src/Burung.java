// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Burung.java
// Deskripsi: Berisi kelas Burung dengan atribut Panggilan dan metode suara, gerak, serta tampil   


public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: cuit.");
    }
}