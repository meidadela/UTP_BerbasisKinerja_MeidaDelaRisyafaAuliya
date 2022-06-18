package Tugas6;

public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(40));
        System.out.println("Meida Dela Risyafa Auliya");
        System.out.println("215150700111006");
        System.out.println("-".repeat(40));

        System.out.println("-".repeat(10) + " Percobaan " + "-".repeat(10));
        Manusia manusia = new Manusia("Aku", "3923842934", true, true);
        System.out.println(manusia.toString());
        System.out.println();

        MahasiswaFilkom mhs = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        System.out.println(mhs.toString());
        System.out.println();

        Pekerja pekerja = new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "195102439283");
        System.out.println(pekerja.toString());
        System.out.println();

        Manajer manajer = new Manajer("Lyra", "351707384392", false, false, 9, 20,"204837283728", 1500);
        System.out.println(manajer.toString());
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println();


        System.out.println("-".repeat(10) + " Data Manusia " + "-".repeat(10));
        Manusia manusia1 = new Manusia("Chanyeol", "35137489736", true, true);
        System.out.println(manusia1.toString());
        System.out.println();
        Manusia manusia2 = new Manusia("Irene", "35628188779", false, false);
        System.out.println(manusia2.toString());
        System.out.println();
        Manusia manusia3 = new Manusia("Suho", "35627287878", true, false);
        System.out.println(manusia3.toString());
        System.out.println();
        Manusia manusia4 = new Manusia("Wendy", "35782868863", false, true);
        System.out.println(manusia4.toString());
        System.out.println();

        System.out.println("-".repeat(10) + " Data Mahasiswa " + "-".repeat(10));
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Sehun", "351627372878", true, true, "205150300111106", 3.90);
        System.out.println(mhs1.toString());
        System.out.println();
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Joy", "3576872877112", false,false, "215151733111007", 3.65);
        System.out.println(mhs2.toString());
        System.out.println();
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Kai", "3542877288822", true, false, "205151375111106", 3.70);
        System.out.println(mhs3.toString());
        System.out.println();
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Seulgi", "351672892977", false, true, "205151290111008", 3.90);
        System.out.println(mhs4.toString());
        System.out.println();

        System.out.println("-".repeat(10) + " Data Pekerja " + "-".repeat(10));
        Pekerja pekerja1 = new Pekerja("Kyungsoo", "3516716768878", true, true,6,20, "301476145777");
        System.out.println(pekerja1.toString());
        System.out.println();
        Pekerja pekerja2 = new Pekerja("Yeri","3587109287622", false, false,7,24,"257145660951");
        System.out.println(pekerja2.toString());
        System.out.println();
        Pekerja pekerja3 = new Pekerja("Baekhyun", "3516142892792", true, false,7,18, "711080589000");
        System.out.println(pekerja3.toString());
        System.out.println();
        Pekerja pekerja4 = new Pekerja("Taeyon","35682797197172", false, true,8,28,"199067433789");
        System.out.println(pekerja4.toString());
        System.out.println();

        System.out.println("-".repeat(10) + " Data Manajer " + "-".repeat(10));
        Manajer manajer1 = new Manajer("Chen","357717682889", true, true, 9, 25, "513087333800",1200);
        System.out.println(manajer1.toString());
        System.out.println();
        Manajer manajer2 = new Manajer("Karina", "350978112979", false,false, 7, 15, "489766210007", 1700);
        System.out.println(manajer2.toString());
        System.out.println();
        Manajer manajer3 = new Manajer("Jaehyun", "357817989822", true, false, 9, 20, "632781590733", 1000);
        System.out.println(manajer3.toString());
        System.out.println();
        Manajer manajer4 = new Manajer("Winter", "357781729299", false, true, 9, 16, "788349190888", 1500);
        System.out.println(manajer4.toString());
        System.out.println();
    }
}
