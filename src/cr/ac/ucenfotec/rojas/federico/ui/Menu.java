package cr.ac.ucenfotec.rojas.federico.ui;

import java.io.PrintStream;

public class Menu {
    private PrintStream output = new PrintStream(System.out);

    public void mostrarMenu(){
        output.println("");
        output.println("Bienvenido al sistema de la Veterinaria Moka"); //se puede sustituir por un System.out.println(""); y sin necesidad de la línea 6
        output.println("");
        output.println("Seleccione su opción");
        output.println("1. Registre la mascota");
        output.println("2. Listar las mascotas");
        output.println("3. Registro de usuarios del sistema");
        output.println("4. Listar los usuarios del sistema");
        output.println("5. Registre una cita médica");
        output.println("6. Listar las citas médicas");
        output.println("7. Registre una reservación");
        output.println("8. Listar las reservaciones");
        output.println("9. Salir");
        output.print("Digite su opción: ");
    }
}
