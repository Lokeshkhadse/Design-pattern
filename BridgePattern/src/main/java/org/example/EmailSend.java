package org.example;

public class EmailSend implements  MessageSender{

    @Override
    public void sendmsg(String content) {
        System.out.println("Sending Email: " + content);

    }
}
