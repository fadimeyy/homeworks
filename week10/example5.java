import java.util.Random;
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen öğrenci sayısı giriniz;");
        int m=input.nextInt();
        System.out.println("Lütfen ders sayısını giriniz");
        int n=input.nextInt();
       //random sınıfı
        int[][] notlar=new int[m][n];
        int[] ogrencino=new int[n];
        double[] ort=new double[m];
        int [][] rapor=new int[m][4];
        System.out.println("A nın matrisi");
         Random r=new Random(); 
        for (int i = 0; i <n; i++) {
        ogrencino[i]=(int)(10000+(20000-10000)*r.nextDouble());
            
        }
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                
                notlar[i][j]=r.nextInt(100);
                System.out.println(i+" 'inci öğrencinin ve "+j+" 'inci dersinin notu= "+notlar[i][j]);
           }
        }
        for (int i = 0; i < m; i++) {
        int toplam=0;
        for (int j = 0; j <n; j++) {
            toplam+=notlar[i][j];
        }
        ort[i]=(double)toplam/n;
       
        }
        for (int i = 0; i < m; i++) {
            int max=notlar[i][0],min=notlar[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < n; j++) {
                if(notlar[i][j]>m){
                max=notlar[i][j];
                maxid=ogrencino[j];
                }
                if(notlar[i][j]<min){
                min=notlar[i][j];
                minid=ogrencino[j];  
                }
            
            rapor[i][0]=max;rapor[i][1]=maxid;rapor[i][2]=min;rapor[i][3]=minid;       
            System.out.println(rapor[i][0]+" , "+rapor[i][1]+" , "+rapor[i][2]+" , "+rapor[i][3]);
            }
            System.out.println(i+" inci ders ortalaması= "+ort[i]);
        }
    }    
    
}
