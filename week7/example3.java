/*pi sayısı hesaplama
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
        double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n =input.nextInt();
        for (int i = 0; i <=n; i++) {
            if(i%2==0){
                toplam+=(double)1/(2*i+1);
            }
            else{
                toplam-=(double)1/(2*i+1);
            }
        }
        toplam=toplam*4;
        System.out.println(toplam);
        
    }
    
}
