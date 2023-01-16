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
public class example4 {

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
         a[0]=1;
         a[1]=1;
         for (int i = 2; i < a.length; i++) {
         
         a[i]=a[i-2]+a[i-1];
         }
         for (int i = 0; i < a.length; i++) {
             if(i==a.length-1){
                 System.out.print(a[i]);
             }
             else{
                 System.out.print(a[i]+",");
             }
                 
            
        }
         
    }
    
}
