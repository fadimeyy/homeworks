
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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ders sayısı giriniz");
        int m =input.nextInt();
        System.out.println("ögrenci sayısı giriniz");
        int n =input.nextInt();
        //1.aşama
        int[] ogrencino=generatearray(n,20000,10000);
        arr_print(ogrencino);
        //2. aşama
        int[][] notlar=new int[m][n];
        notlar=generate_notes(notlar);
        arr_print(notlar);
        //3.aşama
        double[] ortalama=avg_grades(notlar);
        arr_print(ortalama);
        //4.aşama
        int[][] rapor=maxmin_grades(notlar,ogrencino);
        arr_print(rapor);
    }
    public static int[] generatearray(int n,int  ub,int lb){
        
        
        int[] array=new int[n];
         Random r=new Random(); 
        for (int i = 0; i <array.length; i++) {
        array[i]=(int)(lb+(ub-lb)*r.nextDouble());
            
        }
        return array;
    }
    public static int[][] generate_notes(int[][] grades){
        int row=grades.length;//ders sayısı
        int col=grades[0].length;//öğrenci sayısı
        Random r=new Random();
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                grades[i][j]=r.nextInt(100);
            }
        }
        return grades;
    }
    public static double[] avg_grades(int[][]grades){
        int row=grades.length;
        int col=grades[0].length;
        double[] ort=new double[row];
        for (int i = 0; i < row; i++) {
        int toplam=0;
        for (int j = 0; j <col; j++) {
            toplam+=grades[i][j];
        }
        ort[i]=(double)toplam/col;
       
        }
        return ort;
    }
    public static int[][] maxmin_grades(int[][]grades,int[] student_id){
        int row=grades.length;
        int col=grades[0].length;
        int[][] report=new int[row][4];
        for (int i = 0; i < row; i++) {
            int max=grades[i][0],min=grades[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < col; j++) {
                if(grades[i][j]>max){
                max=grades[i][j];
                maxid=student_id[j];
                }
                if(grades[i][j]<min){
                min=grades[i][j];
                minid=student_id[j];  
                }
            }
            report[i][0]=max;report[i][1]=maxid;report[i][2]=min;report[i][3]=minid;  
        }
        return report;
    }
    public static void arr_print(int[] array){
        for (int i = 0; i < array.length; i++) {
         System.out.println((i+1)+"inci eleman "+array[i]);
        }
    }
     public static void arr_print(double[] array){
        for (int i = 0; i < array.length; i++) {
         System.out.println((i+1)+"inci eleman "+array[i]);
        }
    }
    public static void arr_print(int[][] array){
        int row=array.length;
        int col=array[0].length;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println((i+1)+" , "+(j+1)+" eleman "+array[i][j]);
            }
         
        }
    }
    
}