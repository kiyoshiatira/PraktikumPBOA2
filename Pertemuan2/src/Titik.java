public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int CounterTitik = 0;
    // Konstruktor
    Titik(double absis,double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        CounterTitik++;
    }

    Titik() {
        this(0,0);
        CounterTitik++;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    static int getCounterTitik() {
        return CounterTitik;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    int GetKuadran() { 
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

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik t) {
        return Math.sqrt(Math.pow(absis - t.absis, 2) + Math.pow(ordinat - t.ordinat, 2));
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}