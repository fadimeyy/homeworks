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
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir satır ve sutün sayısı giriniz:");
        int n=input.nextInt();
        int[][] A=new int[n][n];
        int t=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n-1; i++) {
           t+=A[i][n-2]+A[n-2][i];
        }
        System.out.println("toplam= "+(t-A[n-2][n-2]));
  
    }
    
}
