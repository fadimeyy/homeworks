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
        //int a=assignnum();
        //System.out.println(a);
        int n=assign_num();
        int[] dizi=new int[n];
        for (int i = 0; i < n; i++) {
            dizi[i]=assign_num(0,50);
            System.out.println(dizi[i]);
        }
    }
    public static int assign_num(){
        Scanner input=new Scanner (System.in);
        int sayi;
        do{
            System.out.println("lütfen bir sayı giriniz:");
            sayi=input.nextInt();
        }while(sayi<0 || sayi>100);
        return sayi;
    }
     public static int assign_num(int lb,int ub){
        Scanner input=new Scanner (System.in);
        int sayi;
        do{
            System.out.println("lütfen bir sayı giriniz:");
            sayi=input.nextInt();
        }while(sayi<lb || sayi>ub);
        return sayi;
    }
}
