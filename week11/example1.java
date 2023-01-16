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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //firstmethod();
        //int a =5,b=6;
        //int c=a+b;
        //System.out.println(c);
        //firstmethod();
        //int a=5,b=3;
        //numsum(a,b);
        //numsum(10,2);
        //Scanner input= new Scanner(System.in);
        //System.out.println("lütfen 1. sayıyı giriniz:");
        //int a=input.nextInt();
        //System.out.println("lütfen 2. sayıyı giriniz:");
        //int b=input.nextInt();
        //numsum(a,b);
        //Scanner input= new Scanner(System.in);
        //System.out.println("lütfen 1 sayı giriniz:");
        //int a=input.nextInt();
        //num(a);
        int num=5;
        num=incrementby(num);
        int x=incrementby(5);
        int c=x*4;
        System.out.println(c);
    }
    public static void firstmethod(){
        System.out.println("program başlangıç bitiş");
    } 
    public static void numsum(int num1,int num2){
        int result =num1+num2;
        System.out.println("result= "+ result);
    }
    public static void num(int num){
        num++;
        System.out.println(num);
    }
    public static int incrementby(int num){
        num++;
        return num;
    }
    
}
