package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();

        // Create Command objects to control the light
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the remote control (Invoker)
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton(); // Output: Light is ON

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton(); // Output: Light is OFF
    }

}