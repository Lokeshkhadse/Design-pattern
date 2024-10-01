package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Network network = new Network();
        network.setIp("192.184.4.4");
        network.LoadData();
        //System.out.println(network);

        //new object create by clone existing object

        try {
            Network network1 = (Network) network.clone();
            Network network2 = (Network) network.clone();

            System.out.println(network);

            network1.getDomains().remove(0);

            System.out.println(network);
            System.out.println(network1);
            System.out.println(network2);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}