import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema");
        Cine cine = new Cine("Hoyts", "ABC 1234");
        Pelicula pelicula1 = new Pelicula("Una pelicula");
        cine.addSala(30);
        cine.programarFuncion(pelicula1, LocalDateTime.now(), cine.getSala(0).getId());
        cine.programarFuncion(pelicula1, LocalDateTime.parse("2024-11-18T12:30:00"), cine.getSala(0).getId());
        Cliente cliente1 = new Cliente("Manolo", "Lama", "example@email", 1, 18);
        InputHandler input = new InputHandler();
        System.out.println("0 to exit");
        int choice = input.select();
        while (choice != 0) {
            cliente1.comprarEntrada(cine);
            if (!cliente1.getEntradas().isEmpty()) {
                cliente1.getEntradas().forEach(entrada -> System.out.println("Boleto nro: " + entrada.getNroBoleto() + " butaca: " + entrada.getNroButaca() + " Cliente: " + entrada.getNroCliente() + " sala: " + entrada.getNroSala() + " funcion: " + entrada.getFechaHorario()));
            }
            System.out.println("0 to exit");
            choice = input.select();
        }


        }

}