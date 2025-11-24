package util;

import java.nio.file.Paths;

public class ArchivoUtil {

    public static String obtenerRutaDatosEmpleados() {
        return Paths.get("src", "main", "resources", "datos_empleados.txt").toString();
    }
}
