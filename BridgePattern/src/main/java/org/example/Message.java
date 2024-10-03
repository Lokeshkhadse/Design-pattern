package org.example;

abstract class  Message {

    protected MessageSender messageSender;

    protected Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public abstract void send(String content);
}
