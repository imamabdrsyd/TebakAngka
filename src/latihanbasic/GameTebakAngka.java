package latihanbasic;

import java.util.Scanner;

public class GameTebakAngka {

    public static void main(String[] args) {
        System.out.println("Mulai permainan menebak angka.. ");
        int angkaYangDiTebak = 0;
        double generateNumber = Math.random() * 100;
        double nilaiAtas = Math.ceil(generateNumber);
        angkaYangDiTebak = (int) nilaiAtas;
        
        boolean isTrue = false;
        int jalan =0;
        
        do{
            jalan ++;
            Scanner scan = new Scanner (System.in);
            System.out.println("Masukkan Angka");
            String userInput = scan.next();
            int angkaUser = Integer.parseInt(userInput);
            
            if(angkaYangDitebak==angkaUser) {
                isTrue = true;
                System.out.println("Ntaps !!");
            }
        }
        // Bandingkan angkaUser dan angkaYangDitebak sampai sukses
        
        
    }
    
}
