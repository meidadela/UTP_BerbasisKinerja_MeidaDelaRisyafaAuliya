package Tugas5;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList <CarRent> rentData;

    public RentArchive() {
        rentData = new ArrayList<CarRent>();
    }

    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carRent = new CarRent(rider, car, rentDur);

        if (car.isStatus()==true){
            rentData.add(carRent);
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(String.valueOf(false));
        }
        else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("--------------------------------");
        System.out.println("       INFORMASI PELANGGAN      ");
        System.out.println("--------------------------------");
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM : "+rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL    : "+rentData.get(i).getCar().getCarType());
            System.out.println("NOMOR POLISI  : "+rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL   : "+rentData.get(i).getRentDur());
            System.out.println("--------------------------------");
        }
    }
}
