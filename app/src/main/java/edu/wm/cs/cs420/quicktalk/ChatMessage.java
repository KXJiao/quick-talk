package edu.wm.cs.cs420.quicktalk;

import java.util.Date;

public class ChatMessage {
    private String message;
    private String sender;
    private long time;

    public ChatMessage(String msg, String usr){
        this.message = msg;
        this.sender = usr;
        time = new Date().getTime();
    }

    public String getMsg(){
        return message;
    }

    public void setMsg(String txt){
        this.message = txt;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
