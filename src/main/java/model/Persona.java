package model;

public class Persona {
    private String rut;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private Direccion direccion;

    public Persona() {
        this.rut = "Sin RUT";
        this.nombreCompleto = "Sin nombre";
        this.email = "sin-correo@salmontt.cl";
        this.telefono = "Sin teléfono";
        this.direccion = new Direccion();
    }

    public Persona(String rut, String nombreCompleto, String email,
                   String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut +
                "\n  Nombre: " + nombreCompleto +
                "\n  Email: " + email +
                "\n  Teléfono: " + telefono +
                "\n  Dirección: " + direccion;
    }
}
