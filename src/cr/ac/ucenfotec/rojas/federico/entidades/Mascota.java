package cr.ac.ucenfotec.rojas.federico.entidades;

public class Mascota {
    private String nombreMascota;
    private String fotoMascota;
    private String observaciones;
    private int ranking;
    private Dueno dueno;

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public void setNombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public String getNombreMascota(){
        return this.nombreMascota;
    }

/*    public String getNombreDueno() {
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
    }*/

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
    public String toString() {
        return "Mascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", fotoMascota='" + fotoMascota + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking=" + ranking +
                ", dueno=" + dueno +
                '}';
    }

    public Mascota(String nombreMascota, String fotoMascota, String observaciones, int ranking, Dueno dueno) {
        this.nombreMascota = nombreMascota;
        this.fotoMascota = fotoMascota;
        this.observaciones = observaciones;
        this.ranking = ranking;
        this.dueno = dueno;
    }

    public Mascota() {}
}
