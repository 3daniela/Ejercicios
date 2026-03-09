public class HorasTrabajadas extends Empleado {

        public HorasTrabajadas(String nombre, int id, double salarioBase, Departamento departamento) {
            super(nombre, id, salarioBase, departamento);
        }

        @Override
        public double calcularSalario() {
            return salarioBase * 1.2;
        }
    }





