public class principal {
    public static void main(String[] args) {

        int[] listaA = new int[]{1,2,4,6,8,0,3,44,52,43,129};
        int[] listaB = new int[]{23,4,6,2,34,7,99,52,5,8};
        int[] listaC;

        if (listaA.length > listaB.length) {
            listaC = new int[listaA.length];
        }else {
            listaC = new int[listaB.length];
        }

        int posicion = 0;
        
        for (int i = 0; i < listaA.length; i++) {
            for (int j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]){
                    listaC[posicion] = listaB[j];
                    posicion++;
                }
            }
        }
        System.out.print("[ ");
        for (int elemento: listaC) {
            if (elemento != 0){
                System.out.print(elemento+" ");
            }
        }
        System.out.print(" ]");
    }
}
