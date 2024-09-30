package org.example;

public class Network implements Cloneable{

    private String ip;
    private String impoData;

    public void LoadData(){
        this.impoData = "this is impo data";
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpoData() {
        return impoData;
    }

    public void setImpoData(String impoData) {
        this.impoData = impoData;
    }

    @Override
    public String toString() {
        return "Network{" +
                "ip='" + ip + '\'' +
                ", impoData='" + impoData + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
