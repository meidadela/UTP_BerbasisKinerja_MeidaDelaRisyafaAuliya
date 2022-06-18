package Tugas6;

public class Pekerja extends Manusia {
    private double gaji, bonus;
    private int jamKerja, hariKerja;
    private String nip;

    public Pekerja(String nama, String nik, boolean jk, boolean menikah, int jamKerja, int hariKerja, String nip) {
        super(nama, nik, jk, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
    }

    public double getGaji() {
        gaji = getHariKerja() * getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        double bukanLibur;
        double bonusLembur = 0;
        double bonus;
        if (getJamKerja() > 7){
            bukanLibur = getHariKerja() - ((double)(getHariKerja() / 7) * 2);
            bonusLembur = bukanLibur * getJamKerja() * 7;
        }
        double bonusLibur = ((double)(getHariKerja() / 7) * 2) * getJamKerja() * 20;
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStatus(){
        String kantorCabang = null;
        char cabang;
        String departemen = null;
        if (nip.charAt(0)=='1'){
            kantorCabang = "Mondstadt";
        }
        else if (nip.charAt(0)=='2'){
            kantorCabang = "Liyue";
        }
        else if (nip.charAt(0)=='3') {
            kantorCabang = "Inazuma";
        }
        else if (nip.charAt(0)=='4'){
            kantorCabang = "Sumeru";
        }
        else if (nip.charAt(0)=='5'){
            kantorCabang = "Fontaine";
        }
        else if (nip.charAt(0)=='6'){
            kantorCabang = "Natlan";
        }
        else if (nip.charAt(0)=='7'){
            kantorCabang = "Snezhnaya";
        }

        cabang = nip.charAt(2);

        if (nip.charAt(6)=='1') {
            departemen = "Pemasaran";
        }
        else if (nip.charAt(6)=='2'){
            departemen = "Humas";
        }
        else if (nip.charAt(6)=='3'){
            departemen = "Riset";
        }
        else if (nip.charAt(6)=='4'){
            departemen = "Teknologi";
        }
        else if (nip.charAt(6)=='5'){
            departemen = "Personalia";
        }
        else if (nip.charAt(6)=='6'){
            departemen = "Akademik";
        }
        else if (nip.charAt(6)=='7'){
            departemen = "Administrasi";
        }
        else if (nip.charAt(6)=='8'){
            departemen = "Operasional";
        }
        else if (nip.charAt(6)=='9'){
            departemen = "Pembangunan";
        }
        return departemen + ", " + kantorCabang + " cabang ke-" + cabang;
    }

    @Override
    public double getPendapatan() {
        return (super.getPendapatan() + getGaji() + getBonus());
    }

    public String toString(){
        return  super.toString() + "\n" +
                "Bonus         : " + getBonus() + "$\n" +
                "Gaji          : " + getGaji() + "$\n" +
                "Status        : " + getStatus();
    }
}
