package com.example.mycalendar;

public class CustomListAdapter {

    private String eventname;
    private String eventtime;
    private String eventdescription;

    public CustomListAdapter(String eventName, String eventTime, String eventDescription) {
        this.eventname = eventName;
        this.eventtime = eventTime;
        this.eventdescription = eventDescription;
    }

    public String getTitle() {
        return eventname;
    }

    public String getTime() {
        return eventtime;
    }

    public String getDescription() {
        return eventdescription;
    }
}
