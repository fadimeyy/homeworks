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
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
       double AO,GO,HO,KHO;
        
        do{
        System.out.println("lütfen bir n sayısı giriniz");
        n =input.nextInt();
        }while(n<0);
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+" inci sayı");
            a[i]=input.nextInt();
        }
        double b=0;
        double t2=0;
        double t=0;
        double c=1;
        for (int i = 0; i < a.length; i++) {
            b+=(double)1/a[i];
            t2+=(double)Math.pow(a[i],2);
            t+=(double)a[i];
            c*=(double)a[i];
        }
        AO=t/n;
        GO=Math.pow(c,(double)1/n);
        HO=n/b;
        KHO=t2/t;
         System.out.println("Aritmetik ortalama= "+AO);
        System.out.println("geometrik ortalama= "+GO);
        System.out.println("harmonik ortalama= "+HO);
        System.out.println("kontraharmonik ortalama= "+KHO);
       
        
    }
    
}
