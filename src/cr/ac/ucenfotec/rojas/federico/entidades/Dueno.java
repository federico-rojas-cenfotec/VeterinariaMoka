package cr.ac.ucenfotec.rojas.federico.entidades;

public class Dueno {
    private String nombreDueno;
    private int cedulaDueno;
    private int telefonoDueno;
    private String direccionDueno;

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

    public Dueno(String nombreDueno, int cedulaDueno, int telefonoDueno, String direccionDueno) {
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.telefonoDueno = telefonoDueno;
        this.direccionDueno = direccionDueno;
    }

    public Dueno() {}

    @Override
    public String toString() {
        return "{" +
                "nombre '" + nombreDueno + '\'' +
                ", cédula " + cedulaDueno +
                ", teléfono " + telefonoDueno +
                ", dirección '" + direccionDueno + '\'' +
                '}';
    }
}
