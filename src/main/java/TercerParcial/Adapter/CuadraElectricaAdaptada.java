package TercerParcial.Adapter;

public class CuadraElectricaAdaptada implements ICuadraNormal{
    private CuadraElectrica cuadraElectrica;

    public CuadraElectricaAdaptada(CuadraElectrica cuadraElectrica) {
        this.cuadraElectrica = cuadraElectrica;
    }

    @Override
    public void llenarGasolina(int cantidad) {
        if(cantidad<=50){
            System.out.println("Cargando combustible: " + cantidad);
            this.cuadraElectrica.setBateria(cantidad);
        }
        else {
            System.out.println("Monto excedido");
        }

    }

    @Override
    public int estadoCombustible() {
        return (int)Math.floor(Math.random()*(50-1+1)+1);
    }
}
