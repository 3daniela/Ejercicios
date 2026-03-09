public class Rectangulo extends Figuras implements Dimensiones {

    private double base;
    private double altura;

    public Rectangulo(String id, String color, double base, double altura) {
        super(id, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void redimensionar(double factor) {
        base = base * factor;
        altura = altura * factor;
    }
}