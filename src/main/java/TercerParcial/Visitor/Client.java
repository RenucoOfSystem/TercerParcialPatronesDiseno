package TercerParcial.Visitor;

public class Client {
    public  static void main(String[]args){
        LaPaz laPaz = new LaPaz("La Paz", 5, 10000, "frio", 0);
        Cochabamba cochabamba = new Cochabamba("Cocha", 3, 200, "Calido", 0);
        SantaCruz santaCruz = new SantaCruz("Santa", 50, 10000, "Caluroso", 0);

        Turista turista = new Turista("Renuco", 500, 111);
        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);

        System.out.println("Total ganado LaPaz: "+laPaz.getDineroPorTurismo());
        System.out.println("Total ganado cocha: "+cochabamba.getDineroPorTurismo());
        System.out.println("Total ganado santacruz: "+santaCruz.getDineroPorTurismo());
    }
}
