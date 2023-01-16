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
import java.util.Random;
public class homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir seçenek giriniz:");
        int player1=input.nextInt();
        Random r=new Random();
        int player2=r.nextInt(3);
        String[] secenek={"tas","kagit","makas"};
        for (int i = 0; i <=2; i++) {
            
        
        if(secenek[player1]==secenek[0] && secenek[player2]==secenek[1]){
            System.out.println("player2 kazandı "+secenek[player2]);
        }
        else if(secenek[player1]==secenek[2] && secenek[player2]==secenek[1]){
            System.out.println("player1 kazandı "+secenek[player2]);
        }
        else if(secenek[player1]==secenek[2] && secenek[player2]==secenek[0]){
            System.out.println("player2 kazandı "+secenek[player2]);
        }
        else if(secenek[player1]==secenek[1] && secenek[player2]==secenek[2]){
            System.out.println("player2 kazandı "+secenek[player2]);
        }
        else if(secenek[player1]==secenek[0] && secenek[player2]==secenek[2]){
            System.out.println("player1 kazandı " +secenek[player2]);
        }
        else if(secenek[player1]==secenek[1] && secenek[player2]==secenek[0]){
            System.out.println("player1 kazandı "+secenek[player2]);
        }
        else{
           System.out.println("berabere");
        }
    }
    }
    
}
        
