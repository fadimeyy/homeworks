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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input=new Scanner(System.in);
         int n;
         double ort;
         do{
         System.out.println("lütfen bir n sayısı giriniz:");
         n=input.nextInt();
         }while(0>n);
         int[] a=new int[n];
         for (int i = 0; i < a.length; i++) {
             System.out.println((i+1)+". sayı:");
            a[i]=input.nextInt();
        }
         int t=0;
         for (int i = 0; i < a.length; i++) {
            t=t+a[i];
            
        }
         int gecen=0;
         ort =(double)t/n;
         for (int i = 0; i < a.length; i++) {
            if(a[i]< ort){
                System.out.println((i+1)+" kaldı.");
                
            }
            else{
               System.out.println((i+1)+" geçti."); 
               gecen++;
            }
        }
         int kalan=a.length-gecen;
         System.out.println("geçen öğrenci sayısı: " +gecen+" kalan öğrenci sayısı: "+kalan);
    }
    
}
