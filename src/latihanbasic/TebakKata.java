package latihanbasic;

import java.util.Arrays;

public class TebakKata {

      public static void main(String[] args) {
          String[] namaNama = {"Angelina", "Demi Moore", 
                             "Dewi Sandra", "Chelsea Islan",
                             "Raisa", "Sheina", 
                             "Titik Puspa", "Titik Sandora"};
        
        boolean isTrue;
        int index = 0;
        //proses secara acak
        double generateNumber = Math.random() * 10;   // mengacak nama
        double nilaiIndex = Math.floor(generateNumber);
        index = (int)nilaiIndex;
        namaNama[index] = (namaNama[index].toUpperCase());
        
        char[] c = namaNama[index].toCharArray(); // dari char ke array
        for (int i = 0; i < c.length; i++){
            char d = c[i];
            System.out.print(d);
        }
        
        Arrays.sort(c);                                 // menyusun nama artis berdasarkan abjad
          System.out.println(" Susun Menjadi Nama");
          for (int i = 0; i < c.length; i++); {
          System.out.println(c[i] + ",");
      }
      do {
          System.out.println("Masukkan tebakanmu: ");
          Scanner scan = new Scanner (System.in);
          System.out.println("Siapa?: ");
          String namaArtis = scan.nextLine(); //
          
          isTrue = false;
      }   
        
            
        
        //System.out.println("Idola yg terpilih: " + namaNama[index]);
        
        
        
        }
    
    
    
}





// - 

