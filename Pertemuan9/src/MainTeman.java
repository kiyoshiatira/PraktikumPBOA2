public class MainTeman {
    public static void main(String[] args) {
        Teman daftar = new Teman();

        daftar.addNama("Andi");
        daftar.addNama("Budi");
        daftar.addNama("Caca");
        daftar.addNama("Andi"); 

        daftar.showTeman();


        daftar.setNama(2, "Dodi");
        System.out.println("\nSet indeks 2 jadi Dodi:");
        daftar.showTeman();

        System.out.println("\nApakah Budi ada? " + daftar.isMember("Budi"));
        System.out.println("Apakah Eko ada? " + daftar.isMember("Eko"));

        
        System.out.println("\n");
        daftar.gantiNama("Andi", "Andika");
        daftar.showTeman();

        System.out.println("\nJumlah 'Andika': " + daftar.countNama("Andika"));

        System.out.println("\n");
        daftar.delNama("Budi");
        daftar.showTeman();
    
        
        System.out.println("\nTotal teman: " + daftar.getNbelm());
    }
}