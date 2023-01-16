import java.util.Scanner;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fadime ERBAY
 */                         
public class example1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Random r =new Random();
        int n;
        do{
          System.out.println("lütfen bir n sayısı giriniz:");
           n =input.nextInt(); 
        }while(0>n); 
        int[] randomsayi=new int[n];
        for (int i = 0; i < randomsayi.length; i++) {
            randomsayi[i]=r.nextInt(100);
        }
        for (int i = 0; i < randomsayi.length; i++) {
            System.out.println((i+1)+". sayı: "+randomsayi[i]);
        }
        int minsayi=randomsayi[0];
        int minindex=0;
        int maxsayi=randomsayi[0];
        int maxindex=0;
        for (int i = 1; i < randomsayi.length; i++) {
            if(randomsayi[i]<minsayi){
                minsayi=randomsayi[i];
                minindex=i;    
            }
            if(randomsayi[i]>maxsayi){
                maxsayi=randomsayi[i];
                maxindex=i;        
            }
        }
        System.out.println("minimum sayı: "+minsayi);
        System.out.println("minimum index: "+minindex);
        System.out.println("maximum sayı: "+maxsayi);
        System.out.println("maximum index: "+maxindex);
    }
    
}