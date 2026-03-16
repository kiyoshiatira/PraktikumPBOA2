/* Nama File    : BangunDatar.java */
/* Deskripsi    : berisi atribut dan method untuk objek BangunDatar */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 9 Maret 2026 */

public class BangunDatar {
    // Atribut
    private int jmlSisi;
    private String warna;    
    private String border;
    // Method
    // Konstruktor
    public BangunDatar() {
        }   
    public BangunDatar(int sisi, String warna, String border){
       this.jmlSisi = sisi;
        this.warna = warna;
        this.border = border;
    }
    // selektor 
    public String getWarna(){
        return warna;
    }
    public int getJmlSisi(){
        return jmlSisi;
    }
    public String getBorder(){
        return border;
    }
    // mutator
    public void setJmlSisi(int s){
        jmlSisi = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setBorder(String s){
        border = s;
    }

    public void PrintInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
