public class Gerente extends Empleado implements Bonos {

    private String departamentoACargo;

    public Gerente(String nombre, int id, double salarioBase, Departamento departamento, String departamentoACargo) {
        super(nombre, id, salarioBase, departamento);
        this.departamentoACargo = departamentoACargo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.5;
    }

    @Override
    public double calcularBono() {
        return salarioBase * 0.3;
    }
}