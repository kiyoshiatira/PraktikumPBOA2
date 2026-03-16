public class MClass {
    public static void main(String[] args) {
        Persegi bd1 = new Persegi(5, "Merah", "Solid");
        Lingkaran bd2 = new Lingkaran(3, "Biru", "Dashed");
        
        bd1.PrintInfo();
        System.out.println("Luas Persegi: " + bd1.getLuas());
        System.out.println("Keliling Persegi: " + bd1.getKeliling());

        bd2.PrintInfo();
        System.out.println("Luas Lingkaran: " + bd2.getLuas());
        System.out.println("Keliling Lingkaran: " + bd2.getKeliling());
        
    }
}
