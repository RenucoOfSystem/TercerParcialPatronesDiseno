package TercerParcial.Decorator;

public class Xiomi implements ICelular{
    private String ram;
    private int almacenamiento;
    private int precio;
    private String cpu;

    public Xiomi(){}
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void operation() {
        System.out.println("Precio: " + getPrecio());
        System.out.println("Almacenamiento: " + getAlmacenamiento());
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
