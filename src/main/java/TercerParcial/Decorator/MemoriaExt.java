package TercerParcial.Decorator;

public class MemoriaExt extends Decorator{
    private int cantidad;
    public MemoriaExt(ICelular celular, int cantidad) {
        super(celular);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void operation(){
        super.operation();
        System.out.println("Agregando cmemoria");
        System.out.println("memoria normal: " + super.getAlmacenamiento());
        super.setAlmacenamiento(super.getAlmacenamiento()+getAlmacenamiento());
        System.out.println("memoria ahora: " + super.getAlmacenamiento());
    }
}
