// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Anabul.java
// Deskripsi: Berisi kelas Anabul dengan atribut nama dan metode suara, gerak, serta tampil

public class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void Gerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    public void Bersuara() {
        System.out.println(nama + " sedang bersuara.");
    }
}