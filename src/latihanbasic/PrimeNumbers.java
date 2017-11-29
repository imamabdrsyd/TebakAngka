package latihanbasic;

public class PrimeNumbers {


    public static void main(String[] args) {
        int bilangan = 11;
        boolean isPrima = true; // asumsi bilangan yg diatas adalah prima
        // berikutnya dibagi dengan bilangan antara 2 sampai (bilangan -1)
        for (int i = 2; i < bilangan; i++) {
            if(bilangan%i==0){ //kalau bisa diabgi berarti asumsi salah
                isPrima = false;
                break;
            }
        }
        if(isPrima) {
            System.out.println(bilangan + " adalah prima");
        }
        else {
            System.out.println(bilangan + " bukan prima");
        }
    }
    
}
