package com.acnonline.aws.model;

/**
 * Created by Aranga on 24/04/2016.
 */
public class Message
{
    private long messageId;
    private String message;
    private int priority;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", message='" + message + '\'' +
                ", priority=" + priority +
                '}';
    }
}
