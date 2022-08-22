import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros a ordenar");
        System.out.println("Ingresa el primer numero");
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 = entrada.nextInt();

        System.out.println("Ingresa el tercer numero");
        int num3 = entrada.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("Los numeros ordenados son: " + num1 + "," + num2 + "," + num3);
        } else {
            if (num1 > num3 && num3 > num2)
                System.out.println("Los numeros ordenados son: " + num1 + ", " + num3 + ", " + num2);
            else {
                if (num2 > num1 && num1 > num3)
                    System.out.println("Los numeros ordenados son: " + num2 + ", " + num1 + ", " + num3);
                else {
                    if (num2 > num3 && num3 > num1)
                        System.out.println("Los numeros ordenados son: " + num2 + ", " + num3 + ", " + num1);
                    else {
                        if (num3 > num1 && num1 > num2)
                            System.out.println("Los numeros ordenados son: " + num3 + ", " + num1 + ", " + num2);
                        else {
                            if (num3 > num2 && num2 > num1)
                                System.out.println("Los numeros ordenados son: " + num3 + ", " + num2 + ", " + num1);
                        }
                    }
                }
            }
        }
    }
}
