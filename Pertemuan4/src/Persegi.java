/* Nama File    : Persegi.java */
/* Deskripsi    : berisi atribut dan method untuk objek Persegi */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 9 Maret 2026 */

public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;
    // Methode
    // Konstruktor
    public Persegi(){
        setJmlSisi(4);
    }
    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }
    // Selektor
    public double getSisi(){
        return sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    
    public double getKeliling(){
        return sisi*4;
    }
    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    // Mutator
    public void setSisi(double s){
        sisi = s;
    }
    
    @Override
    public void PrintInfo(){
        super.PrintInfo();
        System.out.println("Sisi: " + sisi);
    }
}
