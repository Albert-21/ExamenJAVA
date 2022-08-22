import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        int[] lista = new int[]{1,8,5,2,33,54,22,6,88,13};
        Arrays.stream(lista).forEach(elemento ->{
            if (elemento%2 == 0) {
                System.out.println(elemento);
            }
        });
    }
}
