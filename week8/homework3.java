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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir b sayısı giriniz:");
        double b= input.nextDouble();
        int n;
        do{
            System.out.println("lütfen bir n sayısı giriniz:");
            n=input.nextInt();
        }while(n<0);
        double[] a=new double[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.println(i+" inci sayı");
            a[i]=input.nextDouble(); 
            
        }   double t=0;
            for (int i = 0; i <=n; i++) {
            t+=a[i]*Math.pow(b,i);
            System.out.println(t);
        }
    }
    
}
