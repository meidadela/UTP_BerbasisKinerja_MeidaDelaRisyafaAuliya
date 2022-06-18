package Tugas7;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(30));
        System.out.println("MEIDA DELA RISYAFA AULIYA");
        System.out.println("215150700111006");
        System.out.println("TI-A");
        System.out.println("=".repeat(30));
        System.out.println();

        System.out.println("-".repeat(10) + " PERCOBAAN " + "-".repeat(10));
        Pegawai pegawaiTetap = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(pegawaiTetap.toString());
        System.out.println();

        Pegawai pegawaiHarian = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(pegawaiHarian.toString());
        System.out.println();

        Pegawai sales = new Sales("Tika", "350728490327424892344",50,50000);
        System.out.println(sales.toString());
        System.out.println("=".repeat(50));
        System.out.println();

        System.out.println("-".repeat(10) + " DATA PEGAWAI TETAP " + "-".repeat(10));
        Pegawai pegawaiTetap1 = new PegawaiTetap("Chanyeol", "350804201227111992",5000000);
        System.out.println(pegawaiTetap1.toString());
        System.out.println();

        Pegawai pegawaiTetap2 = new PegawaiTetap("Sehun", "350804201212041994",3500000);
        System.out.println(pegawaiTetap2.toString());
        System.out.println();

        Pegawai pegawaiTetap3 = new PegawaiTetap("Baekhyun", "350804201206051992",4000000);
        System.out.println(pegawaiTetap3.toString());
        System.out.println();

        Pegawai pegawaiTetap4 = new PegawaiTetap("Wendy", "350108201421021994",2000000);
        System.out.println(pegawaiTetap4.toString());
        System.out.println();

        System.out.println("-".repeat(10) + " DATA PEGAWAI HARIAN " + "-".repeat(10));
        Pegawai pegawaiHarian1 = new PegawaiHarian("Suho", "350804201222051991",10000,50);
        System.out.println(pegawaiHarian1.toString());
        System.out.println();

        Pegawai pegawaiHarian2 = new PegawaiHarian("Lay","350804201207101991",9500,40);
        System.out.println(pegawaiHarian2.toString());
        System.out.println();

        Pegawai pegawaiHarian3 = new PegawaiHarian("Kai","350804201214011994",8000,45);
        System.out.println(pegawaiHarian3.toString());
        System.out.println();

        Pegawai pegawaiHarian4 = new PegawaiHarian("Irene", "350108201429031991", 7500, 50);
        System.out.println(pegawaiHarian4.toString());
        System.out.println();

        System.out.println("-".repeat(10) + " DATA SALES " + "-".repeat(10));
        Pegawai sales1 = new Sales("Xiumin", "350804201226031990",60,80000);
        System.out.println(sales1.toString());
        System.out.println();

        Pegawai sales2 = new Sales("Kyungsoo", "350804201212011993",50, 65000);
        System.out.println(sales2.toString());
        System.out.println();

        Pegawai sales3 = new Sales("Chen", "350804201221091992",75,100000);
        System.out.println(sales3.toString());
        System.out.println();

        Pegawai sales4 = new Sales("Seulgi","350108201410021994",45,50000);
        System.out.println(sales4.toString());



    }
}
