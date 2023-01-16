/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        int[] sayi=new int[n];
        for (int i = 0; i <= sayi.length-1; i++) {
            System.out.print((i+1)+"inci sayı");
            sayi[i]=input.nextInt();
        }
        for (int i = 0; i <= sayi.length-1; i++) {
            System.out.println(i+ "indis:"+sayi[i]);
        }
        
        
        
    }
    
}
