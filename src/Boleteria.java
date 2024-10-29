import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Boleteria {
    private ArrayList<Entrada> entradas = new ArrayList<>();
    private int ticketCounter = 0;
    private final Cine cine;

    public Boleteria(Cine cine) {
        this.cine = cine;
    }

    public Entrada venderEntrada(int nroCliente){

        InputHandler inputHandler = new InputHandler();
        int nroFuncion = inputHandler.solicitarNroFuncion();
        Funcion funcion = cine.getFunciones().stream().filter(func -> func.getId() == nroFuncion ).findFirst().orElse(null);
        if(funcion != null){
            int nroButaca = inputHandler.solicitarNroButaca();
            if (nroButaca <= funcion.getSala().getDisponibilidad()){
                Butaca butaca = funcion.getButaca(nroButaca);
                if(butaca != null && butaca.getDisponible() ){
                    Entrada newEntrada = new Entrada(ticketCounter++, funcion, butaca.getNroButaca(), nroCliente);
                    butaca.cambiarDisponibilidad();
                    entradas.add(newEntrada);
                    System.out.println("Entrada vendida: " + "Butaca: " + (butaca.getNroButaca() + 1) + " Pelicula: "+ funcion.getPelicula().getNombre()) ;
                    return newEntrada;
                }else {
                    System.out.println("Butaca no disponible.");
                }
            }

        }
        System.out.println("Venta fallida");
        return null;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }
}
