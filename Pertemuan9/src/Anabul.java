// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Anabul.java
// Deskripsi: Berisi kelas Anabul dengan atribut Panggilan dan metode suara, gerak, serta tampil   


public class Anabul {
    protected String panggilan;
    protected double berat; 

    public Anabul() {}

    public Anabul(String nama) {
        this.panggilan = nama;
    }

    public Anabul(String nama, double berat) {
        this.panggilan = nama;
        this.berat = berat;
    }

    public String getNama() {
        return this.panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBerat() {
        return this.berat;
    }

    public void Gerak() {
        System.out.println(panggilan + " sedang bergerak.");
    }

    public void Bersuara() {
        System.out.println(panggilan + " sedang bersuara.");
    }
}