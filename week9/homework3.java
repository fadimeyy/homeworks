
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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        int s=0;
        for (int i = 0; i <= txt.length()-1; i++) {
            int r=s%4;
            if(r<2){
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else{
                System.out.print(txt.charAt(i));
            }
            s++;
        }
    }
    
}
