
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
public class homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır ve ssutün sayısı girniz:");
        int n=input.nextInt();
        int [][] A=new int[n][n];
        int[] B=new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            B[i]=1;
            for (int j = 0; j < n; j++) {
                B[i]*=A[j][i];
            }
            System.out.print(B[i]+",");
        }
    }
    
}
