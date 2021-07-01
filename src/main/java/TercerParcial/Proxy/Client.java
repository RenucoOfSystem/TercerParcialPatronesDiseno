package TercerParcial.Proxy;

public class Client {
    public static void main(String[]args){
        Proxy proxy = new Proxy("111");
        proxy.loguin(new User(4, "rrr", "12345"));
        proxy.loguin(new User(5, "aaa", "9876"));
    }
}
