
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
            Scanner input=new Scanner(System.in);
         int n;
         int c=0;
         do{
         System.out.println("lütfen bir n sayısı giriniz:");
         n=input.nextInt();
         }while(0>n);
         int[] a=new int[n];
         int[] b=new int[n];
         for (int i = 0; i < a.length; i++) {
             System.out.println("a'nın "+(i+1)+". sayı:");
            a[i]=input.nextInt();
            System.out.println("b'nin "+(i+1)+". sayı:");
            b[i]=input.nextInt();
            c+=a[i]*b[i];
        }   
          System.out.println("scaler çarpım"+c);
    }
    
}
