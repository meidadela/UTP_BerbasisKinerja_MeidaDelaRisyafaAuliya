package Enkapsulasi;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in));
        DataMerchant.tampilData();
    }
}
