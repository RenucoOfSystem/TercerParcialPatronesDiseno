package TercerParcial.Proxy;

public class User {
    private int id;
    private String nombre;
    private String pwd;

    public User(int id, String nombre, String pwd) {
        this.id = id;
        this.nombre = nombre;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void showInfo(){
        System.out.println("id: " + getId());
        System.out.println("No,bre: " + getNombre());
        System.out.println("Pwd: " + getPwd());
    }
}
