package latihanbasic;

import java.util.Scanner;

public class String2Primitive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        
        
        String angka = scan.next();
        int x = 10;
        // mengubah String menjadi Integer
        int aHundred = Integer.parseInt(angka);
        int y = aHundred + x;
        System.out.println(y);
        
        System.out.print("Sekarang masukkan angka double: ");
        String setengah = scan.next();
        // mengubah string menjadi
        double half = Double.parseDouble(setengah);
        System.out.println("Setengah: " + half);
    }
    
}
