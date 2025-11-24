package app;

import model.Empleado;
import service.EmpleadoService;
import util.ArchivoUtil;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        EmpleadoService servicio = new EmpleadoService();


        String ruta = ArchivoUtil.obtenerRutaDatosEmpleados();
        System.out.println("Cargando empleados desde: " + ruta);


        servicio.cargarDesdeArchivo(ruta);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== SISTEMA SALMONTT - GESTIÓN DE PERSONAS =====");
            System.out.println("1) Ver todos los empleados");
            System.out.println("2) Buscar empleados por cargo");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leerEntero();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nLISTADO COMPLETO:\n");
                    mostrarLista(servicio.getEmpleados());
                }
                case 2 -> {
                    System.out.print("Ingrese el cargo a buscar (ej: Operario, Supervisor): ");
                    String cargo = sc.nextLine();
                    List<Empleado> filtrados = servicio.filtrarPorCargo(cargo);
                    System.out.println("\nResultados para cargo '" + cargo + "':\n");
                    if (filtrados.isEmpty()) {
                        System.out.println("No se encontraron empleados con ese cargo.");
                    } else {
                        mostrarLista(filtrados);
                    }
                }
                case 3 -> {
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }


    private static int leerEntero() {
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            sc.next();
        }
        int val = sc.nextInt();
        sc.nextLine(); // limpiar Enter
        return val;
    }

    private static void mostrarLista(List<Empleado> lista) {
        if (lista.isEmpty()) {
            System.out.println("(No hay empleados para mostrar)");
            return;
        }
        for (Empleado e : lista) {
            System.out.println(e);
            System.out.println("------------------------");
        }
    }
}