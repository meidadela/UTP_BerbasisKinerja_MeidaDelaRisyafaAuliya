package Praktikum;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        selde();
    }

    public static void selde(){
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int temp = angka;
        int a = 0;

        while(angka!=0){
            a *= 10;
            a += angka % 10;
            angka /= 10;
        }
        if (temp==a){
            System.out.println(temp + " adalah selde.");
        }
        else{
            System.out.println(temp + " bukan selde.");
        }
    }
}
