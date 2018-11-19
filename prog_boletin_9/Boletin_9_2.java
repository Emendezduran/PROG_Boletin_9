package prog_boletin_9;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_2 {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        int suma = 10;
        BigInteger producto = new BigInteger("10");

        System.out.println("suma y producto de los numeros del 10 al 90");

        for (int i = 11; i <= 90; i++) {
            suma += i;

            BigInteger bint = BigInteger.valueOf(i);
            producto = producto.multiply(bint);
        }
        System.out.println(" Resultado de la Suma: " + suma + " Resultado del Producto: " + producto);
    }
}
