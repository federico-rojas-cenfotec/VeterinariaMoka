package cr.ac.ucenfotec.rojas.federico.entidades;

public class Citas {
    private String nombreMascota;
    private String fechaCita;
    private String horaCita;
    private String observaciones;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    @Override
    public String toString(){
        return " [de la mascota: " + this.nombreMascota + " el día " + this.fechaCita + ", a las " + this.horaCita + ", por " + this.observaciones + "]";
    }
    public Citas(String nombreMascota, String fechaCita, String horaCita, String observaciones){
        this.nombreMascota = nombreMascota;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.observaciones = observaciones;
    }
    public Citas(){}
}
