package TercerParcial.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements ICluster{
    private List<User> userList;
    private String ip;
    private String hostName;

    public Servidor(String ip, String hostName) {
        this.ip = ip;
        this.hostName = hostName;
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public void loguin(User user) {
        System.out.println("Agregando usuario al servidor: " + getHostName());
        userList.add(user);
        user.showInfo();

    }
}
