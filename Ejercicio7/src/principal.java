import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        /*Generar un número randon de 1 a 100
        El usuario intentara adivinar el número randon generado
        Tendrá 5 intentos
        Cada intenta le dirá si el número es mayor, si el número es menor, o si el número es
        igual finaliza los intentos restantes y muestra mensaje de acertado*/

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100)+1;
        int intentos = 1;
        System.out.println("Intetata a divinar el numero tienes 5 intentos");
        while (intentos <= 5) {
            System.out.println("Intento numero: " + intentos);
            System.out.println("Ingresa el numero que cres que es: ");
            int numero = entrada.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("FELICIDADES LO HAS LOGRADO");
                break;
            } else {
                System.out.println("UPS CREO QUE HAS FALLADO!");
                System.out.println("Vuelve a intentar");
            }
            if (intentos == 5) {
                System.out.println("El numero era: " + numeroAleatorio);
            }
            intentos++;
        }


    }
}
