package method;

public class SumOfNumber {


    public static void main(String[] args) {
//        System.out.println("Bilangan ganjil: " + sumBilanganGanjil(67));
        System.out.println("Jumlah Bilangan 0 - 45 " + hitungJumlah(45.5, 0.7));
    }
    
//    public static int sumBilanganGanjil(int limit) {
//        
//        int sum = 0;
//        for (int i = 0; i < limit; i++) {
//        if(i%2!=0){
//            sum +=i;
//        }
//        
//        } 
//        return sum;
//        
//    }
    
    public static double hitungJumlah(double limit, double increment) {
        // misal limit 45.5;
        // misal increment 0.5, 0.7, 2.3
        int sum = 0;
        for (double i = 0; i < limit; i+=increment) {
                sum +=i;
        }
        return sum;
    }


}

// hasilJumlahBilanganGanjil()