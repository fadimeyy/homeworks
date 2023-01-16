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
public class example7 {

    
      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        int n=txt.length();
        int x=n/2;
        for (int i = 0; i <x; i++) {
            System.out.print(Character.toLowerCase(txt.charAt(i)));
            System.out.print(Character.toLowerCase(txt.charAt(n-1-i)));
        }
        if(n%2==1){
            System.out.print(Character.toLowerCase(txt.charAt(n/2)));
        }}}                                                     
    