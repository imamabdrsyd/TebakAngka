package latihanbasic;

public class Koplax {

    public static void main(String[] args) {
        
       for (int i = 0; i <= 50; i++){
            if (i==0)
                continue;
            else if (i%4==0 && i%8==0){
                System.out.println("KoPlax: " + i);
            }
            else if (i%4==0){
                System.out.println("Ko: " + i);
            }
            else if (i%8==0){
                System.out.println("Plax: " + i);
            }
       } 
    }
    
}

