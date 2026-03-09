public class Main {

    public static void main(String[] args) {

        Departamento ventas = new Departamento("Ventas", "Piso 2");

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new HorasTrabajadas("Ana", 1, 2000, ventas);
        empleados[1] = new TrabajoHoras("Luis", 2, 20, 80, ventas);
        empleados[2] = new Gerente("Carlos", 3, 4000, ventas, "Ventas");

        for (Empleado e : empleados) {

            e.mostrarInfo();

            if (e instanceof Bonos) {
                Bonos b = (Bonos) e;
                System.out.println("Bono adicional: " + b.calcularBono());
            }

            System.out.println("------------------------");
        }
    }
}