package Praktikum;

import java.util.Scanner;

class Persegi{
    public void luasPersegi(int sisi){
        int luas = sisi*sisi;
        System.out.println(luas);
    }
}
class Segitiga{
    public void luasSegitiga(int alas, int tinggi){
        int luas = (alas * tinggi)/2;
        System.out.printf("%.0f",(double)luas);
    }
}
class Lingkaran{
    public void luasLingkaran(int jari){
        if (jari % 7 == 0){
            int luas = (int) (22/7 * jari * jari);
            System.out.println((double)luas);
        }
        else {
            int luas = (int) (3.14 * jari * jari);
            System.out.println((double)luas);
        }
    }
}

public class MenghitungLuas {
    static Scanner input = new Scanner(System.in);
    static int menu, sisi, alas, tinggi, jari;
    public static void main(String[] args) {
        menu = input.nextInt();

        switch(menu){
            case 1: MenuPersegi();break;
            case 2: MenuSegitiga();break;
            case 3: MenuLingkaran();break;
            default: System.out.println("Input yang anda masukan tidak sesuai");break;
        }
    }

    public static void MenuPersegi(){
        Persegi persegi = new Persegi();
        sisi = input.nextInt();
        persegi.luasPersegi(sisi);
    }

    public static void MenuSegitiga(){
        Segitiga segitiga = new Segitiga();
        alas = input.nextInt();
        tinggi = input.nextInt();
        segitiga.luasSegitiga(alas, tinggi);
    }

    public static void MenuLingkaran(){
        Lingkaran lingkaran = new Lingkaran();
        jari = input.nextInt();
        lingkaran.luasLingkaran(jari);
    }
}
