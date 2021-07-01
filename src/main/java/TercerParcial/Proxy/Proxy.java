package TercerParcial.Proxy;

public class Proxy implements ICluster{
    private String ip;
    private Servidor servidor1 = new Servidor("192.168.10", "Servidor de impares");
    private Servidor servidor2 = new Servidor("192.168.20", "Servidor de Pares");

    public Proxy(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public void loguin(User user) {
        if(user.getId()%2==0){
            System.out.println("Id par");
            System.out.println("Atendiendo en el servidor2");
            servidor2.loguin(user);
        }else{
            System.out.println("Id par");
            System.out.println("Atendiendo en el servidor1");
            servidor1.loguin(user);
        }
    }
}
