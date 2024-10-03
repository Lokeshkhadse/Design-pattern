package org.example;
// question :- i want to send msg (textmsg) via mail or sms

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Message msg1 = new TextMessage(new EmailSend());
        msg1.send("Hello, this is sent through Email!");

        // Sending message via SMS
        Message msg2 = new TextMessage(new SmsSend());
        msg2.send("Hello, this is sent through SMS!");


    }
}