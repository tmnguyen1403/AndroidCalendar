package com.example.mycalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CalendarEventInfoActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<CustomListAdapter> list;
    EventListAdapter adapterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_event_info);

        listView = findViewById(R.id.eventList);

        listShow();

        adapterList = new EventListAdapter(this, list);
        listView.setAdapter((ListAdapter) adapterList);
    }

    private void listShow() {
        list = new ArrayList<CustomListAdapter>();

        list.add(new CustomListAdapter("Robotics lab", "10am to 11:30am", "Join us for the 5th annual robotics lab at UHD"));
        list.add(new CustomListAdapter("Android Studio Basics", "2pm to 3:30pm", "Create your first Android Mobile app in this short seminar"));
        list.add(new CustomListAdapter("Hackathon", "6pm to 7pm", "Join us to learn the basics in cyber security"));

    }
}