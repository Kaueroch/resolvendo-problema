import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int numero = 0;
       int A[] = new int[1];
       int B[] = new int[1];
       for(int x = 0; x < 2; x++){
           System.out.println("Digite um número" + (x+1));
           numero = sc.nextInt();
           if(numero > 0){
               numero = A[1];
           }else if(numero <= -1){
               numero = B[1];
           }
       }
        System.out.println((A[1]));
        System.out.println((B[1]));


    }
}


/*******************************************************************************
 * 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
 * negativo, em B. No final mostrar o resultado.
 *******************************************************************************/
