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
        System.out.println("lütfen satır sayısı giriniz;");
        int a=input.nextInt();
        System.out.println("satır ve sütun eşit");
        int b=a;
        int[][] A=new int[a][b];
        System.out.println("A nın matrisi");
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                A[i][j]=input.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                if(i<j){
                    sum +=A[i][j];
                }
            }
        }
        System.out.println("ana köşegen toplamı: "+sum);
    }   
}