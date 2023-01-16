
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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz: ");
        String txt=input.nextLine();
        int sayac=0;
        for (int i =  txt.length()-1;i>=0; i--) {
            if(sayac%2==0){
                System.out.println(Character.toLowerCase(txt.charAt(i)));
            }
            else{
                System.out.println(Character.toUpperCase(txt.charAt(i)));
            }
            sayac++;
            
        }
    }
    
}
