
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
        int n=input.nextInt();
        ucgen(n);
    }
    public static int ucgen(int satir){
         Scanner input=new Scanner(System.in);
        satir= input.nextInt();
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j<= satir-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i+i-1; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
        return satir;
    }
    
}
