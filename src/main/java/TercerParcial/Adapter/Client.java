package TercerParcial.Adapter;

public class Client {
    public static void main(String[]args){
        CuadraDiesel cuadraDiesel = new CuadraDiesel(10);
        cuadraDiesel.llenarGasolina(30);
        System.out.println("Estado: " + cuadraDiesel.estadoCombustible());

        CuadraElectrica cuadraElectrica = new CuadraElectrica(5);
        cuadraElectrica.cargaElectricidad(10);
        System.out.println("Bateria: " + cuadraElectrica.estadoElectricidad());

        CuadraElectricaAdaptada cuadraElectricaAdaptada = new CuadraElectricaAdaptada(cuadraElectrica);
        cuadraElectricaAdaptada.llenarGasolina(5);
        System.out.println("Estado: " + cuadraElectricaAdaptada.estadoCombustible());

    }
}
