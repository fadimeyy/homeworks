
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
public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        for (int i = 0; i <= txt.length()/2-1; i++) {
        System.out.print(txt.charAt(txt.length()/2+i)+""+txt.charAt(txt.length()/2-i-1));
       
           
        }
        
    }
    
}
