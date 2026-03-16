import java.time.LocalDate;
import java.time.Period;
class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * gajiPokok;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang : " + bidang);
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}