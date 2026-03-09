public class Gasolina extends Vehiculo implements Combustible {

    public Gasolina(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche de gasolina arranca con ruido");
    }

    @Override
    public void repostarCombustible() {
        System.out.println("Repostando gasolina");
    }
}