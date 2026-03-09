/* Nama File    : Dosen.java */
/* Deskripsi    : berisi atribut dan method untuk objek Dosen */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 2 Maret 2026 */

public class Dosen {
    /********** ATRIBUT **********/
    private String nip;
    private String nama;
    private String prodi;

    /********* METHOD **********/
    /******* KONSTRUKTOR ******/
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    /******* KONSTRUKTOR OVERLOADING ******/
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /********* SELECTOR **********/
    public String getNIP() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }

    /********* SELECTOR **********/
    public void setNIP(String NIP){
        nip = NIP;
    }
    public void setNama(String Nama){
        nama = Nama;
    }
    public void setProdi(String Prodi){
        prodi = Prodi;
    }
}