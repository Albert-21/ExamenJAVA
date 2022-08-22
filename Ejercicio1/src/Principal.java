public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(20);
        rectangulo.setBase(35);
        rectangulo.CalcularArea();
        System.out.println("El area es: "+rectangulo.getArea());
        rectangulo.CalcularArea(58,30);
        System.out.println("El area es: "+rectangulo.getArea());

    }
}
