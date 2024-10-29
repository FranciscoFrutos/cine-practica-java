import java.util.Scanner;

public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public String solicitarFecha() {
        System.out.println("Ingrese la fecha de la función (ej: 2024-10-29): ");
        return scanner.nextLine();
    }

    public String solicitarHorario() {
        System.out.println("Ingrese el horario de la función (ej: 18:00:00): ");
        return scanner.nextLine();
    }

    public int solicitarNroFuncion() {
        System.out.println("Ingrese el número de función: ");
        return scanner.nextInt();
    }

    public int solicitarNroButaca() {
        System.out.println("Ingrese el número de butaca: ");
        return scanner.nextInt();
    }

    public int select(){
        System.out.println("Elija una opción: ");
        return scanner.nextInt();
    }

}
