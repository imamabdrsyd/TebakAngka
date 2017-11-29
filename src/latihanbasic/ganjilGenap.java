package latihanbasic;

public class ganjilGenap 
    {public static void main(String[] args) 
        {int hasil = 0;
        int ganjil = 0;
        int genap = 0;
     for (int i = 0; i <=20; i ++ )
        {if (i%2==0)
            {ganjil += i;} 
        else
            {genap += i;}}
     
        System.out.println(ganjil);
        System.out.println(genap);}}
    
