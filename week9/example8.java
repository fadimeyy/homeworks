
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
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        int sayac=0;
        char[] is={' ',',','!',';',':','?'};
        for (int i = 0; i<txt.length(); i++) {
            char h=txt.charAt(i);
            for (int j = 0; j < is.length; j++) {
                if(is[j]==h){
                    sayac++;
                }
            }
            
            
        }
        System.out.println("\n cümlede "+(sayac+1)+" kelime vardır");
    }
    
}
