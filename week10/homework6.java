
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
public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen şirket sayısını giriniz: ");
        int n=input.nextInt();
        int [][] A=new int[n][12];
        
        int [][] rapor=new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println(i+" inci sirketin "+j+" inci aydaki karı= ");
                A[i][j]=input.nextInt();
            }     
        }
        double[] ort=new double[n];
        int toplam=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <12; j++) {
                toplam+=A[i][j];
                ort[i]=(double)toplam/12;
            }
            System.out.println(i+" inci sirketin yıllık karı= "+ort[i]);
        }
        
        for (int i = 0; i <n; i++) {
            int max=A[i][0],min=A[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < 12; j++) {
                if(A[i][j]>max){
                max=A[i][j];
                maxid=j;
                
                }
                if(A[i][j]<min){
                min=A[i][j];
                minid=j;  
                
                }
            
            
            }
            System.out.println("maximum kar= "+max+" maximum kar olan ay= "+maxid+" minimum kar= "+min+" minimum kar olan ay= "+minid);    
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < 12; j++) {
            int maxkar=A[0][j],minkar=A[0][j];
            int maxkarid=0,minkarid=0;
             if(A[i][j]>maxkar){
                maxkar=A[i][j];
                maxkarid=i;
                
                }
                if(A[i][j]<minkar){
                minkar=A[i][j];
                minkarid=i;  
                
                }
            
                System.out.println(j+"inci ayın maximum kar= "+maxkar+" maximum kar olan şirket="+maxkarid+" minimum kar= "+minkar+" minimum kar olan şirket= "+minkarid);    
            }
            
        }
    }
}