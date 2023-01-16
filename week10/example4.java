
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
public class example4 {

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
        int enb=A[0][0];
        int enk=A[0][0];
        int enbsatir=0;
        int enksatir=0;
        int enbsutun=0;
        int enksutun=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <a; j++) {
                if(A[i][j]>enb){
                    enb=A[i][j];
                    enbsatir=i;
                    enbsutun=j;
                }
                else if(A[i][j]<enk){
                    enk=A[i][j];
                    enksatir=i;
                    enksutun=j;
                }
            }
           
        }
         System.out.println("en büyük sayı= "+enb+" en küçük sayı= "+enk+" en büyüğün satırı= "+enbsatir+" en küçüğün satırı= "+enksatir+" en büyüğün sütunu= "+enbsutun+" en küçüğün sütunu "+enksutun);
    }
    
}
