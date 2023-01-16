
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
         System.out.print("lütfen bir ifade giriniz: ");
         String txt = input.nextLine();
         char [] sesli = {'a','e','ı','i','u'};
         int[] yer = new int [255];
         int sayac=0;
         for (int i = 0; i<=txt.length()-1 ; i++) {
             char h = Character.toLowerCase(txt.charAt(i));
             for (int j = 0; j <= sesli.length-1; j++) {
                 if(h==sesli[j]){
                     yer[sayac]=i;
                     sayac++;
                     System.out.println((i+1)+"inci karakter");
                 }
                 
             }
             
            
        }
         for (int i = 0; i < sayac; i++) {
             System.out.print(yer[i]+",  ");
            
        }
         System.out.println("Toplam sesli harf: "+sayac);
    }
    
}
