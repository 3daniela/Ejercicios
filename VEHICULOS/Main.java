public class Main {

    public static <String> void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[3];

        vehiculos[0] = new CocheElectrico("Tesla", "Model 3", 2023);
        vehiculos[1] = new Gasolina("Toyota", "Corolla", 2020);
        vehiculos[2] = new Hibrido("Toyota", "Prius", 2022);

        for (Vehiculo v : vehiculos) {

            v.arrancar();

            if (v instanceof Electrico) {
                ((Electrico) v).cargarBateria();
            }

            if (v instanceof Combustible) {
                ((Combustible) v).repostarCombustible();
            }

            System.out.println("------------------");
        }
    }
}