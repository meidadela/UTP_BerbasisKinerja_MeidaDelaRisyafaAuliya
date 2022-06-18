package Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String nik, boolean jk, boolean menikah, int jamKerja, int hariKerja, String nip, int lamaKerja) {
        super(nama, nik, jk, menikah, jamKerja, hariKerja, nip);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getPendapatan() {
        return (super.getPendapatan() + 15);
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }

    @Override
    public double getBonus() {
        return (super.getBonus() + (super.getBonus() * 0.3));
    }

    public String toString(){
        super.toString();
        return  super.toString() + "\n" +
                "Lama Kerja    : " + getLamaKerja();
    }
}
