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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt=input.nextLine();
        for (int i = 0; i <=txt.length()-1; i++) {
            System.out.println(txt.charAt(i)+"'nin ASCI kodu: "+(int)txt.charAt(i));
        }
        
        int a=txt.charAt(1);
        System.out.println("a nın değeri: "+a);
        
    }
    
}
