package TercerParcial.Decorator;

public class Decorator implements ICelular{
    private ICelular celular;

    public Decorator(ICelular celular) {
        this.celular = celular;
    }

    @Override
    public void operation() {
        this.celular.operation();
    }

    @Override
    public void setPrecio(int precio) {

    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public void setAlmacenamiento(int capacidad) {

    }

    @Override
    public int getAlmacenamiento() {
        return 0;
    }
}
