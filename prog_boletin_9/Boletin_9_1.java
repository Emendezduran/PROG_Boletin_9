package prog_boletin_9;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_1 {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Teclea 10 numeros");
        float numero;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            numero = scan1.nextFloat();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println(" Positivos " + positivos + " negativos " + negativos + " ceros " + ceros);

    }

}
