


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
        Scanner input =new Scanner(System.in);
        int n;
        do{
            System.out.println("lütfen bir n sayısı giriniz:");
            n=input.nextInt();
        }while(n<0);
        int[] a=new int[n];
        for (int i = 1; i <=n; i++) {
            System.out.println(i+". terim");
            a[i]=input.nextInt();
        }
       int x=0;
       int y=0;
        for (int i = 1; i <=n; i++) {
            if(a[i]==0){
                
            }
            else if(a[i]>0){
                x=x+1;
                int[] b=new int[x];
                b[x]=a[i];
                System.out.println("b dizisinin" +x+". terimi "+b[x]);
            }
            else{
                y=y+1;
                int[] c=new int[y];
                c[y]=a[i];
                System.out.println("c dizisinin " +y+". terimi "+c[y]);
            }
            
            
        }
        
        
    }
}
