// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Dosen.java
// Deskripsi: Berisi kelas Dosen yang merupakan subclass dari CivitasAkademika dengan atribut NIP dan implementasi metode getNomor untuk mengembalikan NIP dosen

public class Dosen extends CivitasAkademika {
    String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    public String getNomor() {
        return NIP;
    }
}