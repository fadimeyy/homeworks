

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=assign_num();
        int[] sayilar=new int[n];
        for (int i = 1; i <=n; i++) {
        
        }
         assign_num(sayilar,n);
    }
    
     public static void assign_num(int[] array,int sayi){
        Scanner input=new Scanner (System.in); 
        System.out.println("lütfen bir sayı giriniz:");
        sayi=input.nextInt();
        int toplam=0;
        for (int i = 1; i <= sayi; i++) {
              array[i]=i*i;
              toplam+=array[i];
              System.out.println(array[i]+","+toplam);
            }
  
        
    }
     public static int assign_num(){
        Scanner input=new Scanner (System.in);
        int sayi;
            System.out.println("lütfen bir sayı giriniz:");
            sayi=input.nextInt();
        return sayi;
    }
    
}
