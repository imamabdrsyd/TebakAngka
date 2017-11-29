package latihanbasic;

public class BreakAndContinueTest {

    public static void main(String[] args) {
        int hasil = 0 ;
        int amount = 0;
        for (int i = 0; i < 100; i++){
            if(i==3 || i==5 || i==7 || i==9)
                continue;
            if (hasil > 100)
                    break;
            amount += i;
            hasil += i;
            System.out.println("Angka yang diproses: " + i);
        }
        System.out.println("Hasil 1-100 = " + amount);
        System.out.println("Hasil pertama di atas 100: " + hasil); 
    }
    
}
