package latihanbasic;


public class StringConcat {

    public static void main(String[] args) {
        String primes = "";
        for (int i = 0; i < 100; i++){
            primes = primes + i + "\t";
        }
        System.out.println(primes);
        
        StringBuilder sb = new StringBuilder("Urutan Bilangan: ");
        sb.append(1);
        sb.append("\t");
        sb.append(2);
        
        String urutans = sb.toString();
        System.out.println(urutans);
    }
    
}
