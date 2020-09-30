package cr.ac.ucenfotec.rojas.federico.entidades; //ajuste final

public class Usuario {
    private String nombreUsuario;
    private int cedulaUsuario;
    private int telefonoUsuario;
    private String direccionUsuario;
    private String estadoUsuario;
    private String rolUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    @Override
    public String toString(){
        return " [: " + this.nombreUsuario + ", con cédula " + this.cedulaUsuario + ", teléfono No. " + this.telefonoUsuario + ", con dirección en " + this.direccionUsuario + ". Su estado es: " + this.estadoUsuario + " y su rol es: " + this.rolUsuario + "]";
    }
    public Usuario(String nombreUsuario, int cedulaUsuario, int telefonoUsuario, String direccionUsuario, String estadoUsuario, String rolUsuario){
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.estadoUsuario = estadoUsuario;
        this.rolUsuario = rolUsuario;
    }
    public Usuario(){}
}

