package method;

public class ArrayCalculation {

    public static void main(String[] args) {
        int[] bilangan = {2,3,101,200,64,77,34,0,-1,-7,99};
        int[] bilangan2 = {2,3,101,200,64,77,34,0,-1,-7,99, 87,35};
        System.out.println("Jumlah bilangan array = " + hitungJumlahArray(bilangan2));
        System.out.println("Jumlah bilangan genap = " + cariGenap(bilangan));
        System.out.println("Jumlah bilangan negative = " + countEvenNumberFrom(bilangan));       
    }
    
    public static int hitungJumlahArray (int[] bilangan2) {
        int sum = 0;
        for (int i = 0; i < bilangan2.length; i++) {
            int j = bilangan2[i];
            sum+=j;
        }
        return sum;
//        System.out.println("Jumlah bilangan array = " + sum);
    }
    
    public static int cariGenap (int[] array){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i]%2==0) {
                sum++;
            }
        }
        return sum;
    }
    
    public static int countEvenNumberFrom(int[] numbArray) {
        int count = 0;
        //logic
        for (int i = 0; i < 10; i++) {
            int j = numbArray[i];
            if(j%2==0) {
                count++;
            }
        }
        return count;
    }
    
}
