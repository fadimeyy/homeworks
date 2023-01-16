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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double toplam=0;
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        for (int i = 0; i <=n; i++) {
            int temp=2*i+1;
            int fak=1;
            for (int j = 1; j <=temp; j++) {
                
                fak*=j;
            }
            toplam+=(double)(temp+1)/fak;
        }
         System.out.println(toplam);
    }
    
}
