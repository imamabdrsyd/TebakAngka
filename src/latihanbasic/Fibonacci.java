package latihanbasic;

public class Fibonacci {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Fibonacci: ");
        int temp = 0;
        int x = 0;
        int y = 1;
        sb.append(x);
        sb.append(",");
        sb.append(y);
        sb.append(",");
        
        for (int i = 0; i < 20; i++){
        temp = x;
        x = y;
        y = temp + y;
        sb.append(y);
        sb.append(",");
        }
    
    
    String result = sb.toString();
    System.out.println(result);
    }
    
}
