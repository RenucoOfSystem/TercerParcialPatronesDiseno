package TercerParcial.Visitor;

public class Turista implements ITurista{

    private String nombre;
    private int montoDinero;
    private int ci;

    public Turista(String nombre, int montoDinero, int ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }



    @Override
    public void visitar(LaPaz laPaz) {
        System.out.println("visitando La Paz");
        int gasto = (int)Math.floor(Math.random()*(100-1+1)+1);
        System.out.println("Monto inicial: "+ getMontoDinero());
        setMontoDinero(getMontoDinero()-gasto);
        System.out.println("Monto Final: "+ getMontoDinero());
        laPaz.setDineroPorTurismo(laPaz.getDineroPorTurismo()+gasto);

    }

    @Override
    public void visitar(Cochabamba cochabamba) {
        System.out.println("visitando Cocha");
        double gasto = cochabamba.getNumeroHabitantes()*0.10;
        System.out.println("Monto inicial: "+ getMontoDinero());
        setMontoDinero(getMontoDinero()-(int)gasto);
        System.out.println("Monto Final: "+ getMontoDinero());
        cochabamba.setDineroPorTurismo(cochabamba.getDineroPorTurismo()+(int)gasto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(int montoDinero) {
        this.montoDinero = montoDinero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public void visitar(SantaCruz santaCruz) {
        System.out.println("visitando Santa");
        double gasto = santaCruz.getNumeroProvinicias()*0.50;
        System.out.println("Monto inicial: "+ getMontoDinero());
        setMontoDinero(getMontoDinero()-(int)gasto);
        System.out.println("Monto Final: "+ getMontoDinero());
        santaCruz.setDineroPorTurismo(santaCruz.getDineroPorTurismo()+(int)gasto);
    }
}
