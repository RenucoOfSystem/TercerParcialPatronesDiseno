package TercerParcial.Adapter;

public class CuadraElectricaAdaptada implements ICuadraNormal{
    private CuadraElectrica cuadraElectrica;

    public CuadraElectricaAdaptada(CuadraElectrica cuadraElectrica) {
        this.cuadraElectrica = cuadraElectrica;
    }

    @Override
    public void llenarGasolina(int cantidad) {
        if(cantidad<=50)
        System.out.println("Cargando combustible");
    }

    @Override
    public int estadoCombustible() {
        return 0;
    }
}
