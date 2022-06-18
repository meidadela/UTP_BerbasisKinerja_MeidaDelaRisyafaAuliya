package Tugas6;

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, String nik, boolean jk, boolean menikah, String nim, double ipk) {
        super(nama, nik, jk, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus(){
        String angkatan = nim.substring(0,2);
        angkatan = "20"+angkatan;
        String jurusan = null;
        if (nim.charAt(6)=='2'){
            jurusan = "Teknik Meniup Gelembung";
        }
        else if (nim.charAt(6)=='3'){
            jurusan = "Teknik Berburu Ubur Ubur";
        }
        else if (nim.charAt(6)=='4'){
            jurusan = "Sistem Perhamburgeran";
        }
        else if (nim.charAt(6)=='6'){
            jurusan = "Pendidikan Chum Bucket";
        }
        else if (nim.charAt(6)=='7'){
            jurusan = "Teknologi Telepon Kerang";
        }
        return jurusan + ", " +angkatan;
    }

    public double getBeasiswa(){
        double beasiswa=0;
        if (ipk >= 3.0 && ipk <= 3.5){
            beasiswa = 50;
        }
        else if (ipk > 3.5 && ipk <= 4){
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return (super.getPendapatan() + getBeasiswa());
    }

    public String toString(){
        return  super.toString() + "\n" +
                "IPK           : " + getIpk() + "\n" +
                "NIM           : " + getNim() + "\n" +
                "Status        : " + getStatus();
    }
}
