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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz: ");
        String txt=input.nextLine();
        for (int i =  txt.length()-1;i>=0; i--) {
            
            System.out.print(txt.charAt(i)+" ,");
        }
    }
    
}
