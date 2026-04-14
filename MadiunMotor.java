public class MadiunMotor extends LayananTransportasi {
    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak *2500;
    }

    @Override
    public void prosesTransaksi() {
        double tarif = hitungTarif();

        if(saldoUser >= tarif) {
            saldoUser -= tarif;
            System.out.println("Nama Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " Km");
            System.out.println("Sisa Saldo: " + saldoUser);
        } else {
            System.out.println("Transaksi Gagal: Saldo Tidak Cukup");
        }
        System.out.println();
    }
}
