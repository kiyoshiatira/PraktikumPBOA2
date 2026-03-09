/* Nama File    : MClass.java */
/* Deskripsi    : Class untuk mengetes Mahasiswa, Dosen, Kendaraan, dan MataKuliah */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 9 Maret 2026 */

public class MClass {
    public static void main(String[] args) {
        // Buat objek Dosen
        Dosen d1 = new Dosen("D001", "Dr. Budi Santoso", "Informatika");

        //  Buat objek Kendaraan
        Kendaraan k1 = new Kendaraan("B1234XYZ", "Motor");

        //  Buat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("IF12345", "Kiyoshi Akila", "Informatika");

        //  Set dosen wali & kendaraan
        m1.setDosenWali(d1);
        m1.setKendaraan(k1);

        //  Buat beberapa MataKuliah
        MataKuliah mk1 = new MataKuliah("MK101", "Algoritma dan Pemrograman", 3);
        MataKuliah mk2 = new MataKuliah("MK102", "Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("MK103", "Basis Data", 3);

        //  Tambahkan MataKuliah ke Mahasiswa
        m1.addMatkul(mk1);
        m1.addMatkul(mk2);
        m1.addMatkul(mk3);

        //  Print informasi Mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        m1.printDetailMhs();

        //  Contoh update data Mahasiswa
        m1.setNamaMhs("Kiyoshi A. Tira");
        System.out.println("\n=== UPDATE NAMA MAHASISWA ===");
        m1.printMhs();

        //  Print total SKS & jumlah matkul
        System.out.println("\nJumlah Mata Kuliah: " + m1.getJumlahMatkul());
        System.out.println("Total SKS: " + m1.getJumlahSks());
    }
}