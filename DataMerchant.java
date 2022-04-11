package Enkapsulasi;

import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merch = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] temp = new Merchant[DataMerchant.merch.length+1];
        for (int i=0; i<DataMerchant.merch.length; i++){
            temp[i]=DataMerchant.merch[i];
        }
        temp[DataMerchant.merch.length]=merchant;
        return temp;
    }

    public static void tampilData(){
        System.out.println("NAMA : MEIDA DELA RISYAFA AULIYA");
        System.out.println("NIM  : 215150700111006");
        for (Merchant mch1 : merch){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk    : "+mch1.getNamaProduk());
            System.out.println("Harga          : "+(int)mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama){
        for (Merchant mch1 : merch) {
            if (mch1.getNamaMerchant().equals(nama)) {
                return mch1;
            }
        }
        return null;
    }
    public static void tampilMerchant(Merchant merchant){
        System.out.println("NAMA : MEIDA DELA RISYAFA AULIYA");
        System.out.println("NIM  : 215150700111006");
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant  : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk    : "+merchant.getNamaProduk());
        System.out.println("Harga          : "+(int)merchant.getHargaMakanan());
    }
    public static void updateMerchant(Merchant merchant){
        System.out.print("Masukkan Nama Merchant Baru : ");
        String namaBaru = in.nextLine();
        merchant.setNamaMerchant(namaBaru);
        System.out.print("Masukkan Nama Produk Baru  : ");
        String produkBaru = in.nextLine();
        merchant.setNamaProduk(produkBaru);
        System.out.print("Masukkan Harga Baru        : ");
        double hargaBaru = in.nextDouble();
        merchant.setHargaMakanan(hargaBaru);
    }
}
