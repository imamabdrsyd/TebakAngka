package latihanbasic;

public class MethodWithResult {

    public static void main(String[] args) {
//        int hasil = giveMeANumber();
//        System.out.println("hasil pertama " + hasil);
        int hasil2 = giveMeARandomNumber();
        System.out.println("hasil kedua " + hasil2);
//        int hasil = giveMeRandomNumberInRange(45, true);
//        System.out.println("Hasil = " + hasil);
    }
    
    public static int giveMeANumber() {
        int angka = 6;
        return angka;
    }
    
    public static int giveMeARandomNumber() {
        int hasil;
        double acak = Math.random() * 100;
        double ceil = Math.ceil(acak);
        hasil = (int) ceil;
        return hasil;
    }
    
    public static int giveMeRandomNumberInRange(int range) {
        int hasil;
        double acak = Math.random() * range;
        double ceil = Math.ceil(acak);
        hasil = (int) ceil;
        return hasil;
    }
    
    public static int giveMeRandomNumberInRange(int range, boolean isCeil) {
        int hasil;
        double acak = Math.random() * range;
        
        
        if(isCeil) {
            double ceil = Math.ceil(acak);
            hasil = (int) ceil;
            return hasil;
        }
        else {
            double floor = Math.floor(acak);
            hasil = (int) floor;
            return hasil;
        }      
    }
    
    public static String acakNama(String artisSoal) {
        atisSoal = artisSoal.toUpperCase(); //Jadi huruf kapital semua
        char[] hurufArtis = artisSoal.toCharArray(); //String jadi array
        Arrays.sort(hurufArtis);
        String kataAcak = new  String(hurufArtis);
        retun kataAcak;
    }
    
}
