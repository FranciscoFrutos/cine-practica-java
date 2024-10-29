import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Entrada {
    private int nroBoleto;
    private LocalDateTime fechaHorario;
    private int nroSala;
    private int nroButaca;
    private int nroCliente;

    public Entrada(int nroBoleto, Funcion funcion, int nroButaca, int nroCliente) {
        this.nroBoleto = nroBoleto;
        this.fechaHorario = funcion.getHorario();
        this.nroSala = funcion.getSala().getId();
        this.nroButaca = nroButaca;
        this.nroCliente = nroCliente;
    }

    public int getNroBoleto() {
        return nroBoleto;
    }

    public void setNroBoleto(int nroBoleto) {
        this.nroBoleto = nroBoleto;
    }

    public LocalDateTime getFechaHorario() {
        return fechaHorario;
    }

    public int getNroSala() {
        return nroSala;
    }

    public int getNroButaca() {
        return nroButaca + 1;
    }

    public int getNroCliente() {
        return nroCliente;
    }
}
