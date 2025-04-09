package org.example.projektmadspild.Model;

public class Event {
    private String name;
    private String email;
    private String eventType;

    public Event(String name, String email, String eventType) {
        this.name = name;
        this.email = email;
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
