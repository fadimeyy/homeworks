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
public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] sayilar=new int[4][4];
        array(sayilar);
    }
    public static int[][] array(int[][] dizi ){
        Scanner input=new Scanner(System.in);
        int[][] A=new int[4][4];
        int[][] B= new int[4][4];
       
        
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.println("A dizisinin "+i+". satırının "+j+" .sütunu");
                A[i][j]=input.nextInt();
            }}
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
            
                System.out.println("B dizisinin "+i+". satırının "+j+" .sütunu");
                B[i][j]=input.nextInt();
                dizi[i][j]=A[i][j]+B[i][j];
                
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" ");
              System.out.print(dizi[i][j]);  
            }
            System.out.println();
        }
        return dizi;
    }
    
}
