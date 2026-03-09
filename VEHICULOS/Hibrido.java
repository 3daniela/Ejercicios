public class Hibrido extends Vehiculo implements Electrico, Combustible {

    private final String marca;
    private final String modelo;
    private final int año;

    protected Hibrido(marca, modelo, int año) {
        super(marca, modelo, año);
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    @java.lang.Override
    public void repostarCombustible() {

    }
}
