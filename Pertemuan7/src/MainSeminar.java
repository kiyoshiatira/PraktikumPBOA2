// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: MainSeminar.java
// Deskripsi: Berisi kelas MainSeminar yang merupakan kelas utama untuk menjalankan program dengan membuat objek Dosen dan Mahasiswa, melakukan registrasi ke seminar, dan menampilkan informasi peserta serta data mahasiswa yang terdaftar dalam seminar tersebut

public class MainSeminar {
    public static void main(String[] args) {
        Seminar s = new Seminar();

        Dosen d1 = new Dosen("Pak A", "001");
        Dosen d2 = new Dosen("Pak B", "002");

        Mahasiswa2 m1 = new Mahasiswa2("Ali", "101");
        Mahasiswa2 m2 = new Mahasiswa2("Budi", "102");
        Mahasiswa2 m3 = new Mahasiswa2("Cici", "103");
        Mahasiswa2 m4 = new Mahasiswa2("Dodi", "104");
        Mahasiswa2 m5 = new Mahasiswa2("Eka", "105");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total peserta: " + s.countPeserta());
        System.out.println("Total mahasiswa: " + s.countMahasiswa());

        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}