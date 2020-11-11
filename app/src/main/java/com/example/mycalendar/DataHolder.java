package com.example.mycalendar;

import android.util.Log;

import java.util.ArrayList;

public class DataHolder {
    static ArrayList<Event> events = new ArrayList<Event>();

    static void printData() {
        for (Event event: events) {
            Log.d("eventName", event.name);
        }
    }
}
