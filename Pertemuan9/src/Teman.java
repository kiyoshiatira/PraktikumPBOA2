// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Teman.java
// Deskripsi: Berisi kelas Teman yang mengelola daftar nama teman dengan berbagai metode untuk menambah, menghapus, dan memanipulasi nama dalam daftar.


import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Gagal setNama: Indeks di luar jangkauan.");
        }
    }

    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        } else {
            System.out.println(nama + " tidak ditemukan.");
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int index = Lnama.indexOf(namaLama);
        if (index != -1) {
            Lnama.set(index, namaBaru);
            System.out.println("Nama " + namaLama + " berhasil diganti menjadi " + namaBaru);
        } else {
            System.out.println(namaLama + " tidak ditemukan dalam daftar.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equalsIgnoreCase(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman (" + nbelm + " orang):");
        if (Lnama.isEmpty()) {
            System.out.println("- (Daftar Kosong)");
        } else {
            for (int i = 0; i < Lnama.size(); i++) {
                System.out.println((i + 1) + ". " + Lnama.get(i));
            }
        }

    }

}





