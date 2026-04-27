// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: MainAnabul.java
// Deskripsi: Berisi kelas MainAnabul yang merupakan kelas utama untuk menjalankan program dengan membuat array Anabul dan memanggil metode suara dan gerak untuk setiap objek Anabul dalam array tersebut

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing("Milo"),
            new Anjing("Doggo"),
            new Burung("Cici")
        };

        for (Anabul a : hewan) {
            a.suara();
            a.gerak();
            System.out.println();
        }
    }
}