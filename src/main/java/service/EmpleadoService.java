package service;

import model.Empleado;
import model.Direccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
    private final List<Empleado> empleados = new ArrayList<>();

    public int cargarDesdeArchivo(String rutaArchivo) {
        empleados.clear();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(rutaArchivo))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()) continue;


                String[] partes = linea.split(";");
                if (partes.length < 12) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                String rut = partes[0];
                String nombre = partes[1];
                String email = partes[2];
                String telefono = partes[3];
                String region = partes[4];
                String ciudad = partes[5];
                String calle = partes[6];
                int numero = Integer.parseInt(partes[7]);
                String cargo = partes[8];
                String area = partes[9];
                double sueldo = Double.parseDouble(partes[10]);
                boolean activo = Boolean.parseBoolean(partes[11]);

                Direccion dir = new Direccion(region, ciudad, calle, numero);
                Empleado emp = new Empleado(rut, nombre, email, telefono, dir, cargo, area, sueldo, activo);
                empleados.add(emp);
            }

            System.out.println("Empleados cargados desde archivo: " + empleados.size());
        } catch (IOException e) {
            System.out.println("⚠ Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠ Error al procesar datos: " + e.getMessage());
        }

        return empleados.size();
    }


    public void cargarDatosEjemplo() {
        empleados.clear();

        Direccion d1 = new Direccion("Los Lagos", "Puerto Montt", "Av. Costanera", 123);
        Direccion d2 = new Direccion("Los Lagos", "Calbuco", "Ruta 5 Sur", 456);
        Direccion d3 = new Direccion("Los Lagos", "Puerto Varas", "Camino Ensenada", 789);

        empleados.add(new Empleado("11.111.111-1", "Ana Pérez", "ana@salmontt.cl", "912345678",
                d1, "Operario", "Producción", 650000, true));
        empleados.add(new Empleado("22.222.222-2", "Carlos Soto", "carlos@salmontt.cl", "987654321",
                d2, "Supervisor", "Logística", 900000, true));
        empleados.add(new Empleado("33.333.333-3", "Marcela Díaz", "marcela@salmontt.cl", "956789012",
                d3, "Técnico", "Mantenimiento", 800000, false));

        System.out.println("Empleados de EJEMPLO cargados: " + empleados.size());
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }


    public List<Empleado> filtrarPorCargo(String cargoBuscado) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getCargo().equalsIgnoreCase(cargoBuscado.trim())) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
