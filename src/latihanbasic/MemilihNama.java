package latihanbasic;

public class MemilihNama {

    public static void main(String[] args) {
        
        String[] namaNama = {"Angelina", "Demi Moore", 
                             "Dewi Sandra", "Chelsea Islan",
                             "Raisa", "Sheina", 
                             "Titik Puspa", "Titik Sandora"};
        
        int index = 0;
        double generateNumber = Math.random() * 10;
        double nilaiIndex = Math.floor(generateNumber);
        index = (int)nilaiIndex;
        
        System.out.println("Idola yg terpilih: " + namaNama[index]);
    }
    
}
