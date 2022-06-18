package Tugas5;

public class Main {
    public static void main(String[] args) {

        System.out.println("NAMA  : MEIDA DELA RISYAFA AULIYA");
        System.out.println("NIM   : 215150700111006");
        System.out.println("KELAS : TI-A");

        CarRider chanyeol =new CarRider("Park Chanyeol", 30, "081546927670");
        CarRider sehun = new CarRider("Oh Sehun", 28, "081098653722");
        CarRider baekhyun = new CarRider("Byun Baekhyun", 30, "081276333999");

        CarData data = new CarData();
        data.addCar("SUV", "N 111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 333 AB", "Suzuki");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(chanyeol, data.getCarList().get(1), 9);
        arsip.Rent(sehun, data.getCarList().get(0), 3);
        arsip.Rent(baekhyun, data.getCarList().get(1), 1);

        System.out.println("");
        arsip.info();
    }
}
