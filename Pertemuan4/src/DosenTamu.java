import java.time.LocalDate;
class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama,
                     LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas,
                     LocalDate tanggalAkhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Tanggal Akhir Kontrak : " + tanggalAkhirKontrak);
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}