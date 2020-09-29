package cr.ac.ucenfotec.rojas.federico.entidades;

public class Reservaciones {
    private String nombreMascota;
    private String fechaEntrada;
    private String fechaSalida;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString(){
        return " [La mascota: " + this.nombreMascota + " tiene reservación para ingresar el día " + this.fechaEntrada + " y salir el " + this.fechaSalida + "]";
    }

    public Reservaciones(String nombreMascota, String fechaEntrada, String fechaSalida){
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Reservaciones(){}
}
