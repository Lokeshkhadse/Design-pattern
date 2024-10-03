package org.example;

public class TextMessage extends Message{


    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String content) {
       messageSender.sendmsg(content);
    }
}
