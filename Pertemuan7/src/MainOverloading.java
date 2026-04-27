// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: MainOverloading.java
// Deskripsi: Berisi kelas MainOverloading yang merupakan kelas utama untuk menjalankan program dengan membuat beberapa objek Mahasiswa menggunakan konstruktor yang berbeda dan menampilkan informasi mahasiswa tersebut menggunakan metode tampil

public class MainOverloading {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("123", "Budi", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");
        m3.setProgramStudi(m2);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}