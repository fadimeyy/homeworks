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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner input=new Scanner(System.in);
        int[] dizi=new int[4];
        for (int i = 0; i <4; i++) {
            System.out.println(i+("inci eleman"));
            dizi[i]=input.nextInt();
        }
        array(dizi);
   }
    public static int array(int[] dizi){
        Scanner input=new Scanner(System.in);
        int gecici;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if(dizi[j]<dizi[i]){
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
            System.out.println(dizi[i]);
        }
       return 0;
    }
}
