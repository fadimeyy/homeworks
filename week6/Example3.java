
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

public class Example3 {

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
         } while(a<0 || a%2==0);
         
         int col=a;
         
         for (int i = 1; i <=a; i++) {
             if(i==1 || i==a){
                 for (int j = 1; j <=a; j++) {
                     System.out.print("*");
                 }           
             }
       
             else{
                 for (int j =1; j <=col; j++) {
                     if(j==1 || j==col){
                          System.out.print("*");
                     }
                     else{
                         System.out.print(" ");
                         
                     }
                 }
             }
             System.out.println();
        }
        
    }
    
}
