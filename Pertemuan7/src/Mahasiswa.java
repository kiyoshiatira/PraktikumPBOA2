// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Mahasiswa.java
// Deskripsi: Berisi kelas Mahasiswa dengan atribut NIM, Nama, dan ProgramStudi serta beberapa konstruktor dan metode untuk mengatur ProgramStudi dan menampilkan informasi mahasiswa

public class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = prodi;
    }

    
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    public void tampil() {
        System.out.println(NIM + " | " + Nama + " | " + ProgramStudi);
    }
}