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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
       
        int a;
        do{
            System.out.println("lütfen satır sayısı giriniz");
            a = input.nextInt();
        }while(a<0);
        int bosluk = 0;
         for (int i = 1; i<= a; i++) {
            
            for (int j = 1; j <=bosluk; j++) {
                System.out.print(" ");
            }
             for (int j = 1; j <= a-bosluk; j++) {
                 System.out.print("*");
                 
             }
             bosluk=bosluk+1;
           System.out.println();
         }
    }
    
}
