package org.example;

public class SmsSend implements MessageSender{
    @Override
    public void sendmsg(String content) {
        System.out.println("Sending sms: " + content);

    }
}
