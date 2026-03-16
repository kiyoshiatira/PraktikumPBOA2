public class Lingkaran extends BangunDatar{
    // Atribut
    private double jari;
    // Methode
    // Konstruktor
    public Lingkaran(){

    }
    public Lingkaran(double jari, String warna, String border){
        super(0,warna,border);
        this.jari = jari;
    }
    // Selektor
    public double getJari(){
        return jari;
    }
    // Mutator
    public void setJari(double s){
        this.jari = s;
    }

    public double getLuas(){
        return Math.PI*jari;
    }
    public double getKeliling(){
        return Math.PI * jari * 2;
    }

    @Override
    public void PrintInfo(){
        super.PrintInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
