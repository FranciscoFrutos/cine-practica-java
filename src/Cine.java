import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Funcion> funciones = new ArrayList<Funcion>();
    private Boleteria boleteria = new Boleteria(this);
    private ArrayList<Sala> salas = new ArrayList<Sala>();

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }
    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void programarFuncion(Pelicula pelicula, LocalDateTime horario, int nroSala){
        Funcion newFuncion = new Funcion(funciones.size(), pelicula, horario, salas.get(nroSala));
        funciones.add(newFuncion);
    }
    public void cancelarFuncion(int id){
        funciones.removeIf(func -> func.getId() == id);
    }

    public Boleteria getBoleteria() {
        return boleteria;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public Sala getSala(int i){
        return salas.get(i);
    }
    public void addSala(int cupo){
        salas.add(new Sala(salas.size(), cupo ));
    }
    public Boolean verificarCompraEntrada(int id){
        return this.boleteria.getEntradas().stream().anyMatch(entrada -> entrada.getNroBoleto() == id);
    }
}

