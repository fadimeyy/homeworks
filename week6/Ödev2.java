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
public class Ödev2 {
public static boolean asalmi(int x){
    {
        for (int i = 2; i < x; i++) {
            if(x%i==0){
                return false;
            }
            
        }
        return true;
    }
}
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz:");
        int a=input.nextInt();
        
            if(asalmi(a)){
                System.out.println("asaldır.");
           
            }
            if(asalmi(a+2)){
               System.out.println("chen asalıdır");
               
           }      
           else {
               System.out.println("Chen asalı değildir");
           }
        }
        
    }
    

