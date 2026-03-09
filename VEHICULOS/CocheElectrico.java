public class CocheElectrico extends Vehiculo implements Electrico {

    public CocheElectrico(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    @Override
    public void arrancar() {
        System.out.println("El coche eléctrico arranca silenciosamente");
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería del coche eléctrico");
    }

}
