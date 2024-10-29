import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sala {
    private int id;
    private int cupo;
    private ArrayList<Butaca> butacas = new ArrayList<Butaca>();

    public Sala(int id, int cupo) {
        this.id = id;
        this.cupo = cupo;
        for(int i = 0; i < cupo;++i){
            butacas.add(new Butaca(i));
        }
    }
    public int getId() {
        return id;
    }
    public int getCupo() {
        return cupo;
    }
    public int getDisponibilidad(){
        return cupo - butacas.stream().map(Butaca::getDisponible).collect(Collectors.toSet()).size();
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }
    public Butaca getButaca(int butaca){
        return butacas.get(butaca);
    }
}
