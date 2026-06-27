// Programa principal
// Aqui se crean los objetos y se prueban los metodos
public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Administracion");

        // Se crean varios empleados usando el constructor
        Empleado empleado1 = new Empleado("Laura Martinez", "Auxiliar administrativo", 8500, 2);
        Empleado empleado2 = new Empleado("Carlos Perez", "Capturista", 7800, 1);
        Empleado empleado3 = new Empleado("Monica Ruiz", "Supervisora", 12000, 4);

        // Se agregan los empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);
        departamento.agregarEmpleado(empleado3);

        // Se muestra la informacion inicial
        departamento.mostrarDepartamento();

        // Prueba de algunos metodos
        empleado2.aumentarSueldo(700);
        empleado1.cambiarPuesto("Asistente de oficina");

        // Buscar empleado por nombre
        Empleado encontrado = departamento.buscarEmpleado("Monica Ruiz");

        if (encontrado != null) {
            System.out.println("\nEmpleado encontrado:");
            encontrado.mostrarDatos();
        } else {
            System.out.println("No se encontro el empleado.");
        }

        // Se muestra otra vez para ver los cambios
        System.out.println("\nInformacion actualizada:");
        departamento.mostrarDepartamento();
    }
}
