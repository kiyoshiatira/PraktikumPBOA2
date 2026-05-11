// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Kucing.java
// Deskripsi: Berisi kelas Kucing dengan atribut Panggilan dan metode suara, gerak, serta tampil   


public class Kucing extends Anabul {
    
    public Kucing(String nama, double berat) {
        super(nama, berat); 
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