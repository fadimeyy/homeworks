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
public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır ve sutün sayısı girniz:");
        int n=input.nextInt();
        int [][] A=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A[i][j]==A[j][i]){
                   System.out.println("Simetriktir."); 
                }
                else{
                   System.out.println("Simetrik değildir");
                }
            
        }
   
    }
    }
    
}
