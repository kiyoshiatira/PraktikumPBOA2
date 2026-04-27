// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Mahasiswa2.java
// Deskripsi: Berisi kelas Mahasiswa dengan atribut NIM, Nama, dan ProgramStudi serta beberapa konstruktor dan metode untuk mengatur ProgramStudi dan menampilkan informasi mahasiswa

public class Mahasiswa2 extends CivitasAkademika {
    String NIM;
    Dosen dosenWali;

    public Mahasiswa2(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }

    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println(NIM + " | " + nama + " | Wali: " + dosenWali.getNama());
    }
}