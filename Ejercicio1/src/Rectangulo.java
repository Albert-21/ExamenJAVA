public class Rectangulo implements Figura{
    private int Base;
    private int Altura;
    private int Area;

    public int getBase() {
        return Base;
    }

    public void setBase(int base) {
        this.Base = base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        this.Altura = altura;
    }

    public int getArea() {
        return Area;
    }

    @Override
    public void CalcularArea() {
    this.Area = this.Base*this.Altura;
    }
    public void CalcularArea(int base, int altura) {
        this.Area = base*altura;
    }

}
