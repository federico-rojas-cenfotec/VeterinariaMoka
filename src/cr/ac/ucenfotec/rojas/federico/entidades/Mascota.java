package cr.ac.ucenfotec.rojas.federico.entidades;

public class Mascota {
    private String nombreMascota;
    private String nombreDueno;
    private int cedulaDueno;
    private int telefonoDueno;
    private String direccionDueno;
    private String fotoMascota;
    private String observaciones;
    private int ranking;

    public void setNombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public String getNombreMascota(){
        return this.nombreMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public int getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(int cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public int getTelefonoDueno() {
        return telefonoDueno;
    }

    public void setTelefonoDueno(int telefonoDueno) {
        this.telefonoDueno = telefonoDueno;
    }

    public String getDireccionDueno() {
        return direccionDueno;
    }

    public void setDireccionDueno(String direccionDueno) {
        this.direccionDueno = direccionDueno;
    }

    public String getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(String fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return " [: " + this.nombreMascota + ", del dueño " + this.nombreDueno + ", con cédula " + this.cedulaDueno + " teléfono No. " + this.telefonoDueno + ", con dirección en " + this.direccionDueno + ". La foto es: " + this.fotoMascota + ". Observaciones: " + this.observaciones + " y ranking de: " + this.ranking + "]";
    }

    public Mascota(String nombreMascota, String nombreDueno, int cedulaDueno, int telefonoDueno, String direccionDueno, String fotoMascota, String observaciones, int ranking) {
        this.nombreMascota = nombreMascota;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.telefonoDueno = telefonoDueno;
        this.direccionDueno = direccionDueno;
        this.fotoMascota = fotoMascota;
        this.observaciones = observaciones;
        this.ranking = ranking;
    }

    public Mascota() {
    }
}
