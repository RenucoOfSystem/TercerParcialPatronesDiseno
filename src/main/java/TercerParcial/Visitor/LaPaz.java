package TercerParcial.Visitor;

public class LaPaz implements ICiudad{

    private String nombre;
    private int numeroProvinicias;
    private int numeroHabitantes;
    private String clima;
    private int dineroPorTurismo;

    public LaPaz(String nombre, int numeroProvinicias, int numeroHabitantes, String clima, int dineroPorTurismo) {
        this.nombre = nombre;
        this.numeroProvinicias = numeroProvinicias;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = clima;
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProvinicias() {
        return numeroProvinicias;
    }

    public void setNumeroProvinicias(int numeroProvinicias) {
        this.numeroProvinicias = numeroProvinicias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(int dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }

    @Override
    public void accept(ITurista turista) {
        turista.visitar(this);
    }
}
