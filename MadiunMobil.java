public class MadiunMobil extends LayananTransportasi {

    private final int Nim;

    public MadiunMobil(String namaDriver, double jarak, double saldoUser, int nim) {
        super(namaDriver, jarak, saldoUser);
        this.Nim     = nim;
    }

    @Override
    public double hitungTarif() {
        double biayaAdmin = 3000 + (Nim * 100); 
        return (jarak * 5000) + biayaAdmin;
    }

    @Override
    public void prosesTransaksi() {
        double tarif = hitungTarif();

        if (saldoUser >= tarif) {
            saldoUser -= tarif ;
            System.out.println("Driver      : " + namaDriver);
            System.out.println("Jarak       : " + jarak + " Km");
            System.out.println("Total Bayar : Rp " + tarif );
            System.out.println("Sisa Saldo  : Rp " + saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
        System.out.println();
    }
}