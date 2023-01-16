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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        for (int i = 0; i <=n; i++) {
            toplam+=(double)Math.pow(-1, i)/(2*i+1);
        }
        toplam=toplam*4;
        System.out.println(toplam);
    }
    
}
