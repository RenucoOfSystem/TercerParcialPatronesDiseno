package TercerParcial.Bridge;

public class Client {
    public static void main(String[]args){
        Colegio colegio = new Colegio("San ignacio", 100, 80, "carnet", new Facebook());
        colegio.showInfo();
        Escuela escuela = new Escuela("Montesori", 80, 60, "CertificadoNacimiento", new Twiter());
        escuela.showInfo();
        Universidad universidad = new Universidad("upb", 500, 450, "bachillerato", new WhatsApp());
        universidad.showInfo();
    }
}
