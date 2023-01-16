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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n= input.nextInt();
        int[] A=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println(i+" 'inci sayıyı giriniz");
            A[i]=input.nextInt();
        }
        array_mean(A);
    }
    public static void array_mean(int[] array){
        int min=array[0];
        int minid=0;
        int max=array[0];
        int maxid=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<array[0]){
                min=array[i];
                minid=i;
            }
            if(array[i]>array[0]){
                max=array[i];
                maxid=i;
            }
            
        }
        System.out.println("MAXİMUM SAYI= "+max+" MAX İNDEX= "+maxid+" MİNİMUM SAYI= "+min+" MİN İNDEX= "+minid);
    }
    
}
