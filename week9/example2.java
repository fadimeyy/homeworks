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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz: ");
        String txt=input.nextLine();
        System.out.println("lütfen bir harf giriniz: ");
        char ch=input.nextLine().charAt(0);
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i)==ch){
                System.out.print((i+1)+",");
                sayac++;
            }
            
        }
        System.out.println("\n"+ch+" "+sayac+" kadar cümlede geçmektedir");
    }
    
}
