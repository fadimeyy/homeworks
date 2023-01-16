import java.util.Scanner;
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısı giriniz;");
        int a=input.nextInt();
        System.out.println("lütfen sütun sayısı giriniz");
        int b=input.nextInt();
        int[][] A=new int[a][b];
        System.out.println("Satır A nın sütun sayısı ile aynı olmalıdır");
        int a1=b;
        System.out.println("lütfen sütun sayısı giriniz");
        int b1=input.nextInt();
        int[][] B=new int[a1][b1];
        System.out.println("A nın matrisi");
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                A[i][j]=input.nextInt();
            }           
        }
        System.out.println("B nın matrisi");
        for (int i = 0; i <a1; i++) {
            for (int j = 0; j <b1; j++) {
                System.out.println(i+" 'inci satır ve "+j+" 'inci sütun= ");
                B[i][j]=input.nextInt();
            }       
        }
        System.out.println("C nin matrisi: ");
        int[][] C=new int[a][b1];
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k <b; k++) {
                  C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b1; j++) {
            System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }   
}