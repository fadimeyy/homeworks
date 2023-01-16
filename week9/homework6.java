
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
public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        for (int i = 0; i <= txt.length()-1; i++) {
            System.out.print(txt.charAt(i)+"->");
            for (int j = 1; j <=(int)txt.charAt(i)-64; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
       
    }
    
}
