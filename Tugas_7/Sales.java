package Tugas7;

public class Sales extends Pegawai{

    private int penjualan;
    private double komisi;
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        double gaji = (int)getPenjualan() * getKomisi();
        return gaji;
    }

    public String toString(){
        return  "Sales           : " + getNama() + "\n" +
                "No KTP          : " + getNoKTP() + "\n" +
                "Total penjualan : " + (double)getPenjualan() + "\n" +
                "Besaran komisi  : " + getKomisi() + "\n" +
                "Pendapatan      : Rp " + (int)gaji();
    }
}
