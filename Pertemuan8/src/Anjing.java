public class Anjing extends Anabul2 {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: guk-guk.");
    }
}