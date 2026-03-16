import java.time.LocalDate;
class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Tunjangan : " + hitungTunjangan());
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
    }
}