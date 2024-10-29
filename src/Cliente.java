import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona{
    private int id;
    private ArrayList<Entrada> entradas = new ArrayList<>();
    private int edad;


    public Cliente(String nombre, String apellido, String email, int id, int edad) {
        super(nombre, apellido, email);
        this.id = id;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comprarEntrada(Cine cine) {
        Entrada entrada = cine.getBoleteria().venderEntrada(this.id);
        if (entrada != null) {
            entradas.add(entrada);
        }

    }
}
