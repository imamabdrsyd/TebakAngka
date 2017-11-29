package latihanbasic;


public class AllPrimeNumbers {


    public static void main(String[] args) {
        String primesNumber = "";
        
        for (int bilangan = 0; bilangan < 100; bilangan++){
            if(bilangan==0 || bilangan < 1)
                continue;
            boolean isprima = true;
            for (int j = 2; j < bilangan; j++){
                if(bilangan%j==0){
                    isprima = false;
                    break;
                }
            }
            if(isprima) {
                primesNumber = primesNumber + bilangan + "\t";            }
        }
        System.out.println(primesNumber);
    }
    
}
