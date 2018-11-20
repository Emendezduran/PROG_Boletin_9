
package prog_boletin_9;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_6 {
    
public static void main(String[] args) {

        int contTrabajadores = 0;
        int contSueldo999 = 0;
        int contSueldo1750 = 0;
        float sueldo = 0f;

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Teclea el sueldo del trabajador" + ++contTrabajadores);
        do {
            sueldo = scan1.nextFloat();

            if (sueldo >= 1000f && sueldo <= 1750f) {
                ++contSueldo1750;
            } else if (sueldo < 1000f && sueldo > 0) {
                ++contSueldo999;
                System.out.println(contTrabajadores + contSueldo999 + contSueldo1750);
            }
        } while (sueldo < 0);
    }

}
