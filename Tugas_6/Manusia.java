package Tugas6;

public class Manusia {
    private String nama, nik;
    private boolean jk, menikah;

    public Manusia(String nama, String nik, boolean jk, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jk = jk;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJk() {
        return jk;
    }

    public void setJk(boolean jk) {
        this.jk = jk;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String jk(){
        String jenisKelamin = null;
        if (isJk() == true){
            jenisKelamin = "Laki-Laki";
        }
        else if (isJk()==false){
            jenisKelamin = "Perempuan";
        }
        return jenisKelamin;
    }
    public double getTunjangan(){
        double tunjangan = 0;
        if (isMenikah()==true){
           if (isJk()==true){
               tunjangan = 25;
           }
           else if (isJk()==false){
               tunjangan = 20;
           }
        }
        else if (isMenikah()==false){
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        return  "Nama          : " + getNama() + "\n" +
                "NIK           : " + getNik() + "\n" +
                "Jenis Kelamin : " + jk() + "\n" +
                "Pendapatan    : " + getPendapatan() + "$";
    }
}
