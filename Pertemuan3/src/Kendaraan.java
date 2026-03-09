/* Nama File    : Kendaraan.java */
/* Deskripsi    : berisi atribut dan method untuk objek Kendaraan */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 2 Maret 2026 */

public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;
    // Method
    // Konstruktor
    public Kendaraan(){
    }
    
    // Konstruktor Overload
    public Kendaraan(String NoPlat, String jenis){
        this.noPlat = NoPlat;
        this.jenis = jenis ;
    }
    // Selektor
    public String getnoPlat(){
        return noPlat;
    }
    public String getjenis(){
        return jenis;
    }
    // Mutator
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    public void setjenis(String Jenis){
        this.jenis = Jenis;
    }
}
