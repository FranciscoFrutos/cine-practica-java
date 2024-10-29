public class Butaca {
    private int nroButaca;
    private Boolean disponible = true;

    public Butaca(int nroButaca) {
        this.nroButaca = nroButaca;
    }
    public void cambiarDisponibilidad(){
        disponible = !disponible;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public int getNroButaca() {
        return nroButaca;
    }
}

