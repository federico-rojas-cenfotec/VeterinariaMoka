package cr.ac.ucenfotec.rojas.federico;

import cr.ac.ucenfotec.rojas.federico.entidades.Citas;
import cr.ac.ucenfotec.rojas.federico.entidades.Mascota;
import cr.ac.ucenfotec.rojas.federico.entidades.Reservaciones;
import cr.ac.ucenfotec.rojas.federico.entidades.Usuario;
import cr.ac.ucenfotec.rojas.federico.ui.Menu;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\\n");
    private static PrintStream output = new PrintStream(System.out);

    private static Mascota[] arregloDeMascotas = new Mascota[2];
    private static int posicion = 0;
    private static Usuario[] arregloDeUsuarios = new Usuario[2];
    private static Citas[] arregloDeCitas = new Citas[2];
    private static Reservaciones[] arregloDeReservaciones = new Reservaciones[2];

    public static void main(String[] args) {
        Menu interfaz = new Menu();
        int opcion = 0;

        do {
            interfaz.mostrarMenu();
            opcion = leer.nextInt();
            procesarOpcion(opcion);
        }while (opcion != 9);
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarMascota();
                break;
            case 2:
                listarMascotas();
                break;
            case 3:
                registrarUsuario();
                break;
            case 4:
                listarUsuarios();
                break;
            case 5:
                registrarCitasMedicas();
                break;
            case 6:
                listarCitasMedicas();
                break;
            case 7:
                registrarReservacionesHotel();
                break;
            case 8:
                listarReservaciones();
                break;
            case 9:
                System.out.println("Salida del sistema.");
                break;
            default:
                System.out.println("Opción inválida. Tenga la bondad de elegir una opción válida.");
        }
    }

    private static void listarReservaciones() {
        for (int i = 0; i < arregloDeReservaciones.length; i++) {
            output.println("Reservación No." + (i + 1) + arregloDeReservaciones[i]);
        }
    }

    private static void registrarReservacionesHotel() {
        output.print("Digite el nombre de la mascota: ");
        String nombreMascota = leer.next();
        output.print("Fecha de ingreso al hotel: ");
        String fechaEntrada = leer.next();
        output.print("Fecha de salida del hotel: ");
        String fechaSalida = leer.next();

        Reservaciones nuevaReservacion = new Reservaciones(nombreMascota, fechaEntrada, fechaSalida);
        arregloDeReservaciones[posicion++] = nuevaReservacion;
    }

    private static void registrarCitasMedicas() {
        System.out.print("Digite el nombre de la mascota: ");
        String nombreMascota = leer.next();
        System.out.print("Digite la fecha de la cita: ");
        String fechaCita = leer.next();
        System.out.print("Digite la hora de la cita: ");
        String horaCita = leer.next();
        System.out.print("Digite observaciones sobre la consulta de la mascota: ");
        String observaciones = leer.next();

        Citas nuevaCita = new Citas(nombreMascota, fechaCita, horaCita, observaciones);
        arregloDeCitas[posicion++] = nuevaCita;
    }

    private static void listarCitasMedicas() {
        for (int i = 0; i < arregloDeCitas.length; i++) {
            System.out.println("La cita #:" + (i + 1) + " es " + arregloDeCitas[i]);
        }
    }

    private static void registrarMascota() {
        output.print("Digite el nombre de la mascota: ");
        String nombreMascota = leer.next();
        output.print("Digite el nombre del dueño: ");
        String nombreDueno = leer.next();
        output.print("Digite el número de cédula del dueño: ");
        int cedulaDueno = leer.nextInt();
        output.print("Digite el número de teléfono del dueño: ");
        int telefonoDueno = leer.nextInt();
        output.print("Digite la dirección del dueño: ");
        String direccionDueno = leer.next();
        output.print("Suba una foto de la mascota: ");
        String fotoMascota = leer.next();
        output.print("Espacio para observaciones: ");
        String observaciones = leer.next();
        output.print("Registre el ranking de la mascota: ");
        int ranking = leer.nextInt();
        System.out.println("");
        Mascota nueva = new Mascota(nombreMascota, nombreDueno, cedulaDueno, telefonoDueno, direccionDueno, fotoMascota, observaciones, ranking);
        /*arregloDeMascotas[posicion++] = nueva;*/
        for (int i = 0; i < arregloDeMascotas.length; i++) {
            if (arregloDeMascotas[i] != null) {
                if (arregloDeMascotas[i].getNombreMascota().equals(nueva.getNombreMascota())) {
                    System.out.println("El nombre de la mascota ya está registrado");
                    /*arregloDeMascotas[i] = null;*/
                    break;
                }
            } else {
                arregloDeMascotas[i] = nueva;
                System.out.println("La mascota se registró exitosamente");
                break;
            }
        }
    }

    private static void listarMascotas() {
        for (int i = 0; i < arregloDeMascotas.length; i++) {
            System.out.println("Mascota #:" + (i + 1) + " es" + arregloDeMascotas[i]);
        }
    }

    private static void registrarUsuario() {
        System.out.print("Registre el nombre del usuario: ");
        String nombreUsuario = leer.next();
        System.out.print("Registre la cédula del usuario: ");
        int cedulaUsuario = leer.nextInt();
        System.out.print("Registre el teléfono del usuario: ");
        int telefonoUsuario = leer.nextInt();
        System.out.print("Registre la dirección de usuario: ");
        String direccionUsuario = leer.next();
        System.out.print("Registre el estado del usuario: ");
        String estadoUsuario = leer.next();
        System.out.print("Registre el rol del usuario: ");
        String rolUsuario = leer.next();
        Usuario nuevoUsuario = new Usuario(nombreUsuario, cedulaUsuario, telefonoUsuario, direccionUsuario, estadoUsuario, rolUsuario);
        //arregloDeUsuarios[posicion++] = nuevoUsuario;
        for (int i = 0; i < arregloDeUsuarios.length; i++) {
            if (arregloDeUsuarios[i] != null) {
                if (arregloDeUsuarios[i].getCedulaUsuario() == nuevoUsuario.getCedulaUsuario()) {
                    System.out.println("");
                    System.out.println("Este usuario ya existe en el sistema.");
                    break;
                }
            } else{
                arregloDeUsuarios[i] = nuevoUsuario;
                System.out.println("Usuario registrado exitosamente");
                break;
            }
        }
    }

    private static void listarUsuarios() {
        for (int i = 0; i < arregloDeUsuarios.length; i++) {
            System.out.println("Usuario #" + (i + 1) + " es " + arregloDeUsuarios[i]);
        }
    }
}
