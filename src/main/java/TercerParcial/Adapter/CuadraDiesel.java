package TercerParcial.Adapter;

public class CuadraDiesel implements ICuadraNormal{
    private int capacidad;

    public CuadraDiesel(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void llenarGasolina(int cantidad) {
        if(cantidad<=50){
            System.out.println("Cargando combustible: " + cantidad);
            setCapacidad(cantidad);
        }
        else {
            System.out.println("El monto excede la capacidad");
        }
    }

    @Override
    public int estadoCombustible() {
        return (int)Math.floor(Math.random()*(50-1+1)+1);
    }
}
