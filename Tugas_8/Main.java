package Tugas8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = in.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        System.out.print("Pilih karakter : ");
        int pilih = 0;

        while (pilih != 1 && pilih != 2 && pilih != 3){
            try {
                pilih = in.nextInt();
                if (pilih != 1 && pilih != 2 && pilih != 3){
                    throw new NullPointerException();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Masukkan pilihan berupa angka!");
                System.out.print("Pilih karakter : ");
                in.nextLine();
            }
            catch (NullPointerException e){
                System.out.println("Masukkan pilihan yang sesuai!");
                System.out.print("Pilih karakter: ");
                in.nextLine();
            }
        }

        Titan titan = new Titan();
        Character character = null;
        System.out.println();
        System.out.println("Selamat datang, "+nama+ " !");
        System.out.println("-".repeat(15) + " STATUS " + "-".repeat(15));
        if (pilih==1){
            character = new Magician();
            character.info();
        }
        else if (pilih==2){
            character = new Healer();
            ((Healer)character).info();
        }
        else if (pilih==3){
            character = new Warrior();
            ((Warrior)character).info();
        }

        while (titan.getHP() > 0 && character.getHP() > 0){
            System.out.println("=".repeat(10) + " TURN " + count + "=".repeat(10));
            if (character.attack()){
                titan.receiveDamage(character.getAttack());
            }
            count++;
            System.out.println("Enemy's HP : "+titan.getHP());
            System.out.println(nama + "'s HP : "+character.getHP());
            if (titan.getHP() == 0)
                break;

            System.out.println("=".repeat(10) + " TURN " + count + "=".repeat(10));
            if (count % 2 == 0 && character instanceof Healer){
                System.out.println("Menggunakan skill Heal.");
                ((Healer) character).heal();
            }
            if (titan.attack() == true){
                character.receiveDamage(titan.getAttack());
            }
            System.out.println("Enemy's HP : "+titan.getHP());
            System.out.println(nama + "'s HP : "+character.getHP());
            count++;
        }

        if (titan.getHP() <= 0){
            titan.setHP(0);
            System.out.println("=".repeat(25));
            System.out.println(nama + " menang");
        }
        else if (character.getHP() <= 0){
            character.setHP(0);
            System.out.println("=".repeat(25));
            System.out.println("Titan menang");
        }

        System.out.println("=".repeat(10) + " PLAYER " + "=".repeat(10));
        character.info();
        System.out.println("=".repeat(10) + " MUSUH " + "=".repeat(10));
        titan.info();

    }
}
