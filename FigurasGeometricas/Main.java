public class Main {

    public static void main(String[] args) {

        Figuras[] figuras = new Figuras[3];

        figuras[0] = new Circulo("F1", "Rojo", 5);
        figuras[1] = new Rectangulo("F2", "Azul", 4, 3);
        figuras[2] = new TrianguloRectangulo("F3", "Verde", 3, 4);

        System.out.println("FIGURAS ORIGINALES");
        System.out.println("-------------------");

        for (Figuras f : figuras) {
            f.mostrar();
            System.out.println("----------------");
        }

        System.out.println("\nREDIMENSIONANDO FIGURAS...");
        System.out.println("-------------------");

        for (Figuras f : figuras) {

            if (f instanceof Dimensiones) {
                ((Dimensiones) f).redimensionar(2.0);
            }

            f.mostrar();
            System.out.println("----------------");
        }
    }
}