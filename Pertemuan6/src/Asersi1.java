// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: Asersi1.java
// Deskripsi: Program untuk menunjukan penggunaan asersi




public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}