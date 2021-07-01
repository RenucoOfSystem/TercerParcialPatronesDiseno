package TercerParcial.Decorator;

public class Vidrio extends Decorator{
    private int precio;
    public Vidrio(ICelular celular, int precio) {
        super(celular);
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void operation(){
        super.operation();
        System.out.println("Agregando vidrio templado");
        System.out.println("PRecio normal: " + super.getPrecio());
        super.setPrecio(super.getPrecio()+getPrecio());
        System.out.println("Precio ahora: " + super.getPrecio());
    }
}
