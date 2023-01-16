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
        System.out.println("lütfen bir sayı giriniz");
        int N=input.nextInt();
        int x=asalmii(N);
    }
    public static int asalmii(int sayi){
        int sayac=0;
            for (int i = 1; i <=sayi; i++) {
                if(sayi%i==0){
                    sayac++;
                    
                }
            }
                if(sayac==2){
                    System.out.println("Sayı asaldır");
                    
                }
                
                else{
                    System.out.println("Sayı asal değil");
                   
                }
            
            return sayi;
    }
    
}
