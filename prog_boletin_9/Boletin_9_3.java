package prog_boletin_9;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_3 {
   
     public static void main(String[] args) {
         
         Scanner scan1 = new Scanner(System.in);
         float altura;
         float base;
            
         System.out.println("Teclea la Altura:");
         altura = scan1.nextFloat();
         
         System.out.println("Teclea la Base");
         base = scan1.nextFloat();
         
         if (altura<1 || base<1 ) {
         System.out.println("ERROR los valores no pueden ser negativos");
         } else {
         System.out.println("Area del rectangulo: " + (base * altura));
                 
         }
         
     }
}
