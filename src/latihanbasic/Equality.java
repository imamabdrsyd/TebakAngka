package latihanbasic;

public class Equality {

    public static void main(String[] args) {
        String artis = "Chelsea Islan";
        artis = artis.toUpperCase();
        String jawaban = "CHELSEA ISLAN";
        
        if(artis.equalsIgnoreCase(jawaban)) {
            System.out.println("Jawaban Benar");
        } else {
            System.out.println("Jawaban salah");
        }
    }
    
}
