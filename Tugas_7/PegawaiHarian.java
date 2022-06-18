package Tugas7;

public class PegawaiHarian extends Pegawai{

    private double upahPerJam;
    private int totalJam;
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji(){
        double gaji = 0;
        if (getTotalJam() <= 40){
            gaji = (int)getUpahPerJam() * getTotalJam();
        }
        else if (getTotalJam() > 40){
            gaji = (int)(40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() *1.5);
        }
        return gaji;
    }

    public String toString(){
        return  "Pegawai Harian  : " + getNama() + "\n" +
                "No KTP          : " + getNoKTP() + "\n" +
                "Upah/Jam        : Rp " + getUpahPerJam() + "\n" +
                "Total jam kerja : " + (double)getTotalJam() + "\n" +
                "Pendapatan      : Rp " + (int)gaji();
    }
}
