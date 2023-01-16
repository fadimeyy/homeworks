/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */

import java.util.Random;
import java.util.Scanner;
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       int[] randomsayilar =randomarray(150,n);
        for (int i = 0; i < randomsayilar.length; i++) {
            System.out.print(randomsayilar[i]+", ");
        }
    }
        public static int[] randomarray(int ub,int n){
        int [] array=new int[n];
        Random r=new Random();
            for (int i = 0; i < n; i++) {
              array[i]=r.nextInt(ub);
              
            }
            return array;
    }
}
