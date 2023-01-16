/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */import java.util.Scanner;
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        int[] sayi=new int[n];
        System.out.println();
        System.out.println( sayi[sayi.length-1]);
        
         System.out.println("dizinin uzunluğu= " +sayi.length);
         
         
         
            for (int i = 0; i <= sayi.length-1; i++) {
            System.out.print((i+1)+"inci sayı= ");
            sayi[i]=input.nextInt();
        }
            int toplam=0;
            for (int i = 0; i <=sayi.length-1; i++) {
            toplam+=sayi[i];
        }
            System.out.println("toplam= " +toplam);
            double ort=(double)toplam/sayi.length;
            System.out.println("ortalam= "+ort);
    }
    
}
