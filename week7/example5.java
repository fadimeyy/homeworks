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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        double toplam=0;
        for (int i = 2; i <=n; i+=2) {
            int temp=i-1;
            double fak=1;
            for (int j = 1; j <=temp; j++) {
                fak*=j;
                
            }
            toplam+=i/fak;
        }
        System.out.println(toplam);
        
    }
    
}
