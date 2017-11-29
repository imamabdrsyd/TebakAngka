package latihanbasic;

public class MathTest {

    public static void main(String[] args) {
        double acak = Math.random();
        double dadu = acak * 6;
        double topUp = Math.ceil(dadu);
        
        System.out.println("Angka acak: " + topUp);
        System.out.println("Kali seratus: " + (int) topUp);
        
        // ceiling: pembulatan ke atas
        double pecahan = 4.09344;
        double seil = Math.ceil(pecahan);
        System.out.println("Ceil dari 4.09344 = " + seil);
        // floor: pembulutan ke bawah
        double floor = Math.floor(pecahan);
        System.out.println("Floor dari 4.09344 = " + floor);
        
        
        double akar = Math.sqrt(81);
        System.out.println("Akar 81 = " + akar);
        double pangkat = Math.pow(7, 3);
        System.out.println("7^3 = " + pangkat);
    }
    
}
