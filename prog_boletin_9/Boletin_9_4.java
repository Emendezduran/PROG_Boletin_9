package prog_boletin_9;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_4 {
    
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
         int numero;
         
         System.out.println("Teclea de que numero quieres visualizar su tabla de multiplicar");
         numero = scan1.nextInt();
         
         for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+(numero*i));
         }
         
    
    }
}
