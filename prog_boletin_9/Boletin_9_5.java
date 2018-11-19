package prog_boletin_9;

/**
 *
 * @author emendezduran
 */
public class Boletin_9_5 {
    
    public static void main(String[] args) {

        suma(8, 0);
        sumaResta(8, 0);
        fibonacci(8, 0);
    }

    private static void suma(int ciclos, int numero) {
        int contador = 0;
        System.out.println(++contador + ": " + numero);
        while (ciclos - 1 > 0) {
            numero += 2;
            System.out.println(++contador + ": " + numero);
            ciclos--;
        }
    }

    private static void sumaResta(int ciclos, int numero) {
        int contador = 0;

        System.out.println(++contador + ": " + numero);
        while (ciclos - 1 > 0) {
            if (numero > 0) {
                numero += 1;
                numero *= -1;
            } else {
               
                numero -= 1;
                numero *= -1;
            }
            System.out.println(++contador + ": " + numero);
            ciclos--;
        }
    }

    private static void fibonacci(int ciclos, int numero) {
        int contador = 0;
        int numero1 = 0, numero2 = 0;
        System.out.println(++contador + ": " + numero);
        while (ciclos - 1 > 0) {
            if (numero == 0) {
                numero1 = 1;
            }
            numero = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero;

            System.out.println(++contador + ": " + numero);
            ciclos--;
        }
    }
}



    
