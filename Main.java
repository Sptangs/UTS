public class Main {
    public static void main(String[] args) {
        LayananTransportasi[] layanan = new LayananTransportasi[2];

        layanan[0] = new MadiunMotor("Budi", 5, 20000);
        layanan[1] = new MadiunMobil("Andi", 10, 60000, 14);
        for (LayananTransportasi l : layanan) {
            System.out.println("Tarif: Rp " + l.hitungTarif());
            l.prosesTransaksi();    
        }
    }
}