
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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
 
        int BS,tahmin;
        int s=1;
        BS=(int)(Math.random()*98)+1;
        do{
            System.out.print("Tahmininiz: ");
            tahmin=input.nextInt();
            s++;
            if(tahmin>BS){
                System.out.println("lütfen daha küçük sayı giriniz.");
            }
            else if (tahmin<BS){
                System.out.println("lütfen daha büyük sayı giriniz.");
                
            }
            else{
               System.out.println("Buldunuz."); 
            }
        }while(tahmin!=BS);
        System.out.println(s+ " tahminde bulundunuz.");
    }
    
}
