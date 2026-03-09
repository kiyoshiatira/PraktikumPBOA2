/* Nama File    : MTitik.java */
/* Deskripsi    : berisi pemanggilan fungsi-fungsi dari class Titik */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 19 Januari 2026 */
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); 
        T1.geser(2, -1);
        T1.printTitik();
        
        Titik T2 = T1;
        Titik T3 = T1.getRefleksiX();
        T2.printTitik();
        T3.printTitik();
        System.out.println("Jumlah Objek Class Titik :" + Titik.getCounterTitik());
    }
}