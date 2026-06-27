import java.util.ArrayList;

// Clase Departamento
// Esta clase junta varios empleados en una misma area
public class Departamento {
    private String nombreDepartamento;
    private ArrayList<Empleado> empleados;

    // Constructor del departamento
    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        empleados = new ArrayList<>();
    }

    // Agrega un empleado a la lista del departamento
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    // Busca un empleado por su nombre
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    // Calcula cuanto se paga al mes entre todos los empleados
    public double calcularNominaMensual() {
        double total = 0;

        for (Empleado empleado : empleados) {
            total += empleado.getSueldoMensual();
        }

        return total;
    }

    // Muestra todos los empleados registrados
    public void mostrarDepartamento() {
        System.out.println("\n=== DEPARTAMENTO: " + nombreDepartamento + " ===");

        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
        }

        System.out.println("Total de empleados: " + empleados.size());
        System.out.println("Nomina mensual total: $" + calcularNominaMensual());
    }
}
