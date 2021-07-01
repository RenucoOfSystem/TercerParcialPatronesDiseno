package TercerParcial.Bridge;

public class Colegio implements ISistema{
    private String nombre;
    private int capacidad;
    private int numeroEstudiantes;
    private String requisitos;
    protected IRedSocial redSocial;

    public Colegio(String nombre, int capacidad, int numeroEstudiantes, String requisitos, IRedSocial redSocial) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.numeroEstudiantes = numeroEstudiantes;
        this.requisitos = requisitos;
        this.redSocial = redSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    @Override
    public void showInfo() {
        this.redSocial.showInfo();
        System.out.println("Nombre: " + getNombre());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("NumeroDeEstudiantes: " + getNumeroEstudiantes());
        System.out.println("Requisitos: " + getRequisitos());
    }
}
