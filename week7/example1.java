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
          double toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfwn bir n sayısı giriniz:");
        int n= input.nextInt();
        for (int i = 1; i <=n; i++) {
            int ifak=1;
            for (int j = 1; j <=i; j++) {
                ifak*=j;
            }
            toplam+=(double)i/ifak;
            
            

        }
        System.out.println(toplam);
    }
    
}
