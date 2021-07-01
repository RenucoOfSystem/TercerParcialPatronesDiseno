package TercerParcial.Adapter;

public class CuadraElectrica implements ICuadraElectrica{
    private int bateria;

    public CuadraElectrica(int bateria) {
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public void cargaElectricidad(int carga) {
        if(carga<=20){
            System.out.println("Cargando bateria: " + bateria);
            setBateria(carga);
        }
        else {
            System.out.println("El monto excede la capacidad");
        }
    }

    @Override
    public int estadoElectricidad() {
        return (int)Math.floor(Math.random()*(20-1+1)+1);
    }
}
