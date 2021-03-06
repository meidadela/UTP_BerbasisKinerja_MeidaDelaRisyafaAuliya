package Praktikum;

import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        int N = input.nextInt();
        suratKaisar(teks,N);
    }

    public static void suratKaisar(String teks, int N){
        char huruf;
        String teksBaru = "";
        for(int i=0; i<teks.length(); i++){
            huruf = teks.charAt(i);
            if(huruf>='A' && huruf<='Z'){
                huruf = (char)(huruf+N);
                if(huruf>'Z'){
                    huruf = (char)(huruf-26);
                }
                teksBaru += huruf;
            }
            else if(huruf>='a' && huruf<='z'){
                huruf = (char)(huruf+N);
                if(huruf>'z'){
                    huruf = (char)(huruf-26);
                }
                teksBaru += huruf;
            }
            else{
                teksBaru += huruf;
            }
        }
        System.out.println(teksBaru);
    }
}
