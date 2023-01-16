
import java.util.Random;
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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         int n;
         do{
         System.out.println("lütfen bir n sayısı giriniz:");
         n=input.nextInt();
         }while(0>n);
         int[] a=new int[n];
         for (int i = 0; i < a.length; i++) {
             System.out.println((i+1)+". sayı:");
            a[i]=input.nextInt();
        }
         for (int i = 0; i <a.length/2; i++) {
             int tmp=a[i];
             a[i]=a[n-1-i];
             a[n-1-i]=tmp;            
        }
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
            
        }
          
      
    }
    
}
