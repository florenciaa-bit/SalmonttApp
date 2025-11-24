package model;

public class Direccion {
    private String region;
    private String ciudad;
    private String calle;
    private int numero;

    public Direccion() {
        this.region = "Sin región";
        this.ciudad = "Sin ciudad";
        this.calle = "Sin calle";
        this.numero = 0;
    }

    public Direccion(String region, String ciudad, String calle, int numero) {
        this.region = region;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + ciudad + ", " + region;
    }
}
