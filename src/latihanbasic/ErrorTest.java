/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

/**
 *
 * @author user
 */
public class ErrorTest {
    
    public static void main(String[] args) {
        int hasil = 100;
        for (int i = 5; i > -10; i--) {
            if (i==0)
                System.out.println("Nilai 0 tidak diproses");
            else
                hasil = hasil/i;
        }
        System.out.println("Hasil " + hasil);
    }
    
}
