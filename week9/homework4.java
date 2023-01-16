
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
public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        char [] sesli = {'a','e','ı','i','u'};
        int kon;
        String k1="";
        String k2="";
        for (int i = 0; i <= txt.length()-1; i++) {
            kon=0;
            for (int j = 0; j <= sesli.length-1; j++) {
                
            if(txt.charAt(i)==sesli[j]){
                
                k1+=txt.charAt(i);
                
             
            }
            if(txt.charAt(i)!= sesli[j]){
                k2+=txt.charAt(i);
            
            }
            }
        }
        System.out.println("sesli harflerden kelime: "+k1);
        System.out.println("sessiz harflerden kelime: "+k2);
        
    }
    
}
