/* Nama File    : Titik.java */
/* Deskripsi    : berisi atribut dan method untuk objek Titik */
/* Pembuat      : Kiyoshi Akila Tira */
/* Tanggal      : Senin, 19 Januari 2026 */
public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    private static int CounterTitik = 0;
    // Konstruktor
    public Titik(double absis,double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        CounterTitik++;
    }

    public Titik() {
        this(0,0);
        CounterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public  void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    static int getCounterTitik() {
        return CounterTitik;
    }

    public void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    public int GetKuadran() { 
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else  {
            return 0;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public double getJarak(Titik t) {
        return Math.sqrt(Math.pow(absis - t.absis, 2) + Math.pow(ordinat - t.ordinat, 2));
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}