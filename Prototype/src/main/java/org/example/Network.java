package org.example;

import java.util.ArrayList;
import java.util.List;

public class Network implements Cloneable{

    private String ip;
    private String impoData;

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    private List<String> domains = new ArrayList<>();

    public void LoadData() {
        this.impoData = "this is impo data";
        domains.add("www.learncodewithdurgesh.com");
        domains.add("www.substringtechnologies.com");
        domains.add("www.lcwd.com");
        domains.add("www.google.com");

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
                ", domains=" + domains +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Network network = new Network();
        network.setIp(this.getIp());
        network.setImpoData(this.getImpoData());

        for (String d : this.getDomains()) {
            network.getDomains().add(d);
        }

        return network;

    }
}
