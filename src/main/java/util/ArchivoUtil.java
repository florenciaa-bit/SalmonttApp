package util;

import java.nio.file.Paths;

public class ArchivoUtil {
    // Devuelve la ruta completa al archivo dentro de src/main/resources
    public static String obtenerRutaDatosEmpleados() {
        return Paths.get("src", "main", "resources", "datos_empleados.txt").toString();
    }
}
