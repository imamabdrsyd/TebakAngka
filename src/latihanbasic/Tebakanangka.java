package latihanbasic;

import java.util.Scanner;
public class Tebakanangka{
public static void main(String[] args){

  int a = (int)(Math.random() *20);   // acak angka dari 0-20
  int kesempatan = 6;
    System.out.println("--------------------------------------------------");
    System.out.println("   MARI MENEBAK ANGKA 0 - 20 ");
    System.out.println("   Anda memiliki 7x Kesempatan ");
    System.out.println("---------------------------------------------------");
do{
    System.out.print("    MASUKKAN ANGKA YANG ANDA TEBAK --> ");
    Scanner jawab = new Scanner (System.in);
    int jawabanYgBenar = jawab.nextInt();
    System.out.println("---------------------------------------------------");
    

if (kesempatan > 0 ){
if ( jawabanYgBenar == a ){
    System.out.println("CONGRATULATIONS!!! Angka yang anda masukkan BENAR!");
    break;}
else if ( jawabanYgBenar < a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu KECIL.");}
else if ( jawabanYgBenar > a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu BESAR.");}

    System.out.println(" ");
    System.out.println("\t \t \t \t Kesempatan: " + kesempatan + "");
    System.out.println("---------------------------------------------------");
    kesempatan--;}
else{
    System.out.println("---------------------------------------------------");
    System.out.println("ANDA SALAH!!KESEMPATAN HABIS. SILAHKAN COBA LAGI");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + a);
    System.out.println("---------------------------------------------------");
    break;
    }
   }
while ( kesempatan >=0 ); 
    }
   }
