public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (deltaX == 0) {
            System.out.println("Garis vertikal, gradien tidak terdefinisi.");
        }
        return deltaY / deltaX;
    }

    void getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        System.out.println("(" + midX + ", " + midY + ")");
    }

    boolean isSejajar(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
        return gradien1 == gradien2;
    }

    boolean isTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
        return gradien1 * gradien2 == -1;
    }

    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }
}