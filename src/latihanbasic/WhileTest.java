package latihanbasic;

public class WhileTest {

    public static void main(String[] args) {
        int x = 0;
        int jumlah = 0;
        while (x < 20) {            
            System.out.println("run " + x);
            jumlah += x;
            x++;
        }
        System.out.println("Hasil jumlah = " + jumlah);
    }
    
}
