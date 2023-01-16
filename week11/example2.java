/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sayilar={12,5,8,22,13,6};
        double ort=array_avg(sayilar);
        System.out.println("ortalama= "+ort);
        int[] sayilar2={55,33,25,37,47};
        array_avg2(sayilar2);
        
        array_mean(sayilar);
        array_mean(sayilar2);
        
    }
    public static double array_avg(int[] array){
        int sum=0;
        for (int i = 0; i <array.length; i++) {
            sum+=array[i];
        }
        double avg=(double) sum/array.length;
        return avg;
    }
    public static void array_avg2(int[] array){
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
        }
        double ortalam=(double)sum/array.length;
        System.out.println("ortalam= "+ortalam);
               
    }
        
    public static void array_mean(int[] array){
        int min=array[0];
        int minid=0;
        int max=array[0];
        int maxid=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<array[0]){
                min=array[i];
                minid=i;
            }
            if(array[i]>array[0]){
                max=array[i];
                maxid=i;
            }
            
        }
        System.out.println("MAXİMUM SAYI= "+max+" MAX İNDEX= "+maxid+" MİNİMUM SAYI= "+min+" MİN İNDEX= "+minid);
    }
}
