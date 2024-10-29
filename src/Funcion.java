import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private int id;
    private Pelicula pelicula;
    private LocalDateTime horario;
    private Sala sala;
    private List<Butaca> butacas;

    public Funcion(int id, Pelicula pelicula, LocalDateTime horario, Sala sala) {
        this.id = id;
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
        this.butacas = new ArrayList<>();
        for (Butaca butaca : sala.getButacas()) {
            this.butacas.add(new Butaca(butaca.getNroButaca()));
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Butaca getButaca(int i) {
        return butacas.get(i);
    }
}
