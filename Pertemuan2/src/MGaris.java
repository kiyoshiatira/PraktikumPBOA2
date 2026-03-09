/* Nama File    : MGaris.java */
/* Deskripsi    : berisi pemanggilan fungsi-fungsi dari class Garis */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 23 februari 2026 */
public class MGaris {
    public static void main(String[] args) {

        // Buat beberapa titik
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(4, 5);


        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
        Garis g3 = new Garis(); 

        g1.printGaris();
        g2.printGaris();
        g3.printGaris();


        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Panjang g2: " + g2.getPanjang());


        System.out.println("Gradien g1: " + g1.getGradien());
        System.out.println("Gradien g2: " + g2.getGradien());

        System.out.print("Titik tengah g1: ");
        g1.getTitikTengah();

        System.out.print("Titik tengah g2: ");
        g2.getTitikTengah();

        System.out.println("g1 sejajar g2: " + g1.isSejajar(g2));

        System.out.println("g1 tegak lurus g2: " + g1.isTegakLurus(g2));

        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}