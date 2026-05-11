

public class MainPiaraan {
    public static void main(String[] args) {

        // Membuat object Piaraan
        Piaraan p = new Piaraan();

        // Membuat beberapa anabul
        Anabul k1 = new Kucing("Milo", 4.5);
        Anabul k2 = new Kucing("Oyen", 5.2);
        Anabul a1 = new Anjing("Doggy");
        Anabul b1 = new Burung("Cipit");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        System.out.println("Jumlah anabul : " + p.getNbelm());

        System.out.println("\nDaftar anabul:");
        p.showAnabul();

        System.out.println("\nApakah Milo ada?");
        System.out.println(p.isMember(k1));

        System.out.println("\nAnabul paling depan:");
        System.out.println(p.getAnabul().getNama());

        System.out.println("\nJumlah kucing:");
        System.out.println(p.countKucing());

        System.out.println("\nTotal bobot kucing:");
        System.out.println(p.bobotKucing());

        System.out.println("\nJenis setiap anabul:");
        p.showJenisAnabul();

        System.out.println("\nMenghapus anabul depan:");
        System.out.println(p.dequeueAnabul().getNama());


        System.out.println("\nIsi queue setelah dequeue:");
        p.showAnabul();
    }
}
