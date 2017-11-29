

package method;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {

    public static void main(String[] args) {
//        int[] bilanganCoba = new int[5];
//        bilanganCoba[0]=1;
//        bilanganCoba[1]=2;
//        bilanganCoba[4]=3;
//        
//        for (int i = 0; i < bilanganCoba.length ; i++) {
//            System.out.println("Total isi Array : " + bilanganCoba[i]);
//        }
//        
//        double[] cobaDouble = new double [3];
//        cobaDouble[1]=5000;
//        
//            for (int j = 0; j <cobaDouble.length; j++) {
//                System.out.println("Total isi Array : " + cobaDouble[j]);
//            }

//          String[] namaNama = new String[3];
//          namaNama[0]="Bradd Pitt";
//          
//          String[] otheNames = {"Smith","Johsnon","Will"};
//          int[] number = {1,2,3,4,5,6,7,8,9};
//          
//          for (int i = 0; i < otheNames.length; i++) {
//              System.out.println("Array otherName : " + otheNames[i]);   
//        }
//          for (int j = 0; j < number.length; j++) {
//              System.out.println("Array otherName : " + number[j]);   
//        }

//          String[] namaNama = {"Angelina","Demi More","Dewi Sandra"
//                               ,"Chelsea Islan","Raisa","Sheina","Titik Puspa","Syaila","Siva","Fatimah"};
//          
//          int index = 0;
//          double generateNumber = Math.random() * 10 ;
//          double nilaiIndex = Math.floor(generateNumber);
//          index = (int)nilaiIndex;
//          
//          System.out.println("Idolah yang terpilih : " + namaNama[index]);

//
//            String aMall = "Cilandak Town Square";
//            aMall=aMall.toUpperCase();
//            char[] hurufMall = aMall.toCharArray();
//            for (int i = 0; i < hurufMall.length;i++){
//                char C = hurufMall[i];
//                System.out.print(hurufMall[i]+",");
//               
//            }
//            Arrays.sort(hurufMall);
//            for (int j= 0; j < hurufMall.length; j++) {
//                char c = hurufMall[j];
//                System.out.print(c+",");
//            
//        }
//            
//            String kataAcak = new String(hurufMall); // Merubah char menjadi string
//            System.out.println("Kata baru :" + kataAcak);

          String[] namaNama = {"Angelina", "Demi Moore", "Dewi Sandra"
                               ,"Chelsea Islan", "Raisa", "Sheina", "Titik Puspa", "Syaila", "Siva", "Fatimah", "Syaila Siva Fatimah"};
          boolean isTrue;
          int index = 0;
          double generateNumber = Math.random() * 10 ;
          double nilaiIndex = Math.floor(generateNumber);
          index = (int)nilaiIndex;
          namaNama[index] = namaNama[index].toUpperCase(); //Merubah hasil random ke huruf KAPITAL 
          
          char[] c = namaNama[index].toCharArray();
//          for (int i = 0; i < c.length; i++) {
//              char d = c[i];
//           }
//        
            //System.out.println(namaNama[index]);

         Arrays.sort(c);
         System.out.print("Susun Menjadi Nama Seorang artis :" );
         for (int i = 0; i < c.length; i++) {
              System.out.print(c[i]+",");            
        }
         
        Scanner scan = new Scanner (System.in);
        int nyawa = 2;
        do{
        System.out.println("");
        System.out.print("Siapa ?: ");
        String namaArtis = scan.nextLine(); // pake nextLine biar kalo input 2 kata itu kabaca semua , misal "ilham fidiyantoko", kalo kaga pake nextLine yang kebaca cuma ilham.
           // System.out.println(namaArtis);
        isTrue=true;
        
        if (namaArtis.equalsIgnoreCase(namaNama[index])){
            isTrue = false;
            System.out.println("=======================");
            System.out.println("Jawaban : "+namaNama[index]);
            System.out.print("BENARRRRR !!!   ");
        }   
        else if(namaArtis!=namaNama[index]){
            System.out.println("SALAHHHH !!!");
            isTrue= true; 
            nyawa--;
            
            if (nyawa==0){
                isTrue = false;
                System.out.println("Anda sudah berusaha maksimal . IDIOT ");
            }
        }  
        
        }while(isTrue);
       
    }
   
    }

// Bisa pake yang lain juga kaya String misalnya.
// untuk membandingkan string, gunakan .equalsIgnoreCase ,contoh if (atris.equalsIgnoreCase(jawaban) <<<