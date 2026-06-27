// Clase Empleado
// Aqui se guardan los datos principales de un empleado
public class Empleado {
    private String nombre;
    private String puesto;
    private double sueldoMensual;
    private int aniosTrabajando;

    // Constructor para crear un empleado con sus datos desde el inicio
    public Empleado(String nombre, String puesto, double sueldoMensual, int aniosTrabajando) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldoMensual = sueldoMensual;
        this.aniosTrabajando = aniosTrabajando;
    }

    // Este metodo calcula cuanto ganaria el empleado en un año
    public double calcularSueldoAnual() {
        return sueldoMensual * 12;
    }

    // Metodo para subir el sueldo del empleado
    public void aumentarSueldo(double cantidad) {
        if (cantidad > 0) {
            sueldoMensual += cantidad;
            System.out.println("Se aumento el sueldo de " + nombre + " en $" + cantidad);
        } else {
            System.out.println("La cantidad debe ser mayor a cero.");
        }
    }

    // Metodo para cambiar el puesto del empleado
    public void cambiarPuesto(String nuevoPuesto) {
        puesto = nuevoPuesto;
        System.out.println(nombre + " ahora tiene el puesto de: " + puesto);
    }

    // Muestra los datos del empleado en consola
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo mensual: $" + sueldoMensual);
        System.out.println("Años trabajando: " + aniosTrabajando);
        System.out.println("Sueldo anual: $" + calcularSueldoAnual());
        System.out.println("-----------------------------");
    }

    // Getters usados para poder buscar y calcular desde otra clase
    public String getNombre() {
        return nombre;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
