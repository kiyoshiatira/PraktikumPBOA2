// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Seminar.java
// Deskripsi: Berisi kelas Seminar yang memiliki atribut array CivitasAkademika untuk menyimpan peserta seminar, serta metode untuk registrasi peserta, menghitung jumlah peserta, menampilkan informasi peserta, dan menghitung jumlah mahasiswa yang terdaftar dalam seminar tersebut

public class Seminar {
    CivitasAkademika[] pesertas = new CivitasAkademika[100];
    int banyakPeserta;

    public Seminar() {
        banyakPeserta = 0;
    }

    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta++] = c;
        }
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) { // 🔥 INI YANG DIGANTI
                count++;
            }
        }
        return count;
    }
}