# SalmonttApp

## Sistema de Gestión de Empleados - Empresa Salmontt

Este proyecto corresponde a la actividad “Organización modular y creación de una librería personalizada” del curso Desarrollo Orientado a Objetos I.

El sistema permite gestionar información de empleados de la empresa salmonera Salmontt, cargando datos desde un archivo de texto, almacenándolos en una colección y permitiendo su visualización y filtrado por cargo desde consola.

---

## 📦 Estructura del proyecto

El sistema está organizado en paquetes funcionales:

- app  
  Contiene la clase principal Main desde donde se ejecuta el programa.

- model  
  Contiene las clases del dominio:
    - Persona
    - Empleado
    - Direccion

- service  
  Contiene la lógica de negocio:
    - EmpleadoService (carga de datos, filtrado y gestión de empleados)

- util  
  Utilidades adicionales para apoyo del sistema.

---

## ⚙️ Funcionalidades principales

✔ Carga de empleados desde archivo datos_empleados.txt  
✔ Almacenamiento en ArrayList  
✔ Visualización completa de empleados  
✔ Búsqueda de empleados por cargo  
✔ Validación básica con try-catch  
✔ Menú interactivo por consola

---

## ▶️ Cómo ejecutar el sistema

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo datos_empleados.txt esté en la carpeta correcta.
3. Ejecutar la clase:

##  Autora
Nombre: María Florencia Burgos   
Carrera: Analista Programador  
Institución: Duoc UC  
Año: 2025