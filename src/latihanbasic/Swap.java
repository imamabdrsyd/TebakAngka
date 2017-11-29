package latihanbasic;

public class Swap {

    public static void main(String[] args) {
        int temp = 0; 
        int x = 1;
        int y = 2;
        
        temp = 0; //nampung nilai x sementara
        x = y;
        y = x + y;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
