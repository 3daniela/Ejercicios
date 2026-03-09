public class TrabajoHoras extends Empleado {

    private int horasTrabajadas;

    public TrabajoHoras(String nombre, int id, double salarioBase, int horasTrabajadas, Departamento departamento) {
        super(nombre, id, salarioBase, departamento);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabajadas;
    }
}