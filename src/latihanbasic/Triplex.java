package latihanbasic;

public class Triplex {

    public static void main(String[] args) {
        
       for (int i = 0; i <= 30; i++){
            if (i==0)
                continue;
            else if (i%3==0 & i%5==0){
                System.out.println("TriPlex: " + i);
            }
            else if (i%3==0){
                System.out.println("Tri: " + i);
            }
            else if (i%5==0){
                System.out.println("Plex: " + i);
            }
       } 
    }
    
}
