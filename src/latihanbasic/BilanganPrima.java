package latihanbasic;

public class BilanganPrima {

 public static void main(String[] args) {
     int input = 20;

     for (int i = 2; i < input; i++) {
         boolean adalahPrima = true;

         for (int j = 2; j < i; j++) {
             if(i%j==0){
                 adalahPrima = false;
                 break;
             }
         }

         if(adalahPrima==true){
         System.out.println(i+",");
    }
  }
 }
}
