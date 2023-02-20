package com.example.emanagex.ui.cevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.emanagex.R;
import com.example.emanagex.ui.home.HomeFragment;

public class CreateEventActivity extends AppCompatActivity {
    EditText eventname,eventdate,eventtime,eventspeaker,eventlocation,eventregistration,eventdesc;
    Button createBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        eventname= findViewById(R.id.eventname);
        eventdate= findViewById(R.id.eventDate);
        eventtime= findViewById(R.id.eventTime);
        eventspeaker= findViewById(R.id.eventSpeaker);
        eventlocation= findViewById(R.id.eventLocation);
        eventregistration= findViewById(R.id.eventRegistration);
        eventdesc= findViewById(R.id.eventDescription);

        createBtn= findViewById(R.id.createbtn);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value_name=eventname.getText().toString().trim();
                String value_date=eventdate.getText().toString().trim();
                String value_time=eventtime.getText().toString().trim();
                String value_speaker=eventspeaker.getText().toString().trim();
                String value_location=eventlocation.getText().toString().trim();
                String value_registration=eventregistration.getText().toString().trim();
                String value_desc=eventdesc.getText().toString().trim();

                if (value_name.isEmpty()){
                    eventname.setError("This field is required");
                } else if (value_date.isEmpty()) {
                    eventdate.setError("This field is required");
                }else if (value_time.isEmpty()) {
                    eventtime.setError("This field is required");
                }else if (value_speaker.isEmpty()) {
                    eventspeaker.setError("This field is required");
                }else if (value_location.isEmpty()) {
                    eventlocation.setError("This field is required");
                }else if (value_registration.isEmpty()) {
                    eventregistration.setError("This field is required");
                }else if (value_desc.isEmpty()) {
                    eventdesc.setError("This field is required");
                } else {
                    Toast.makeText(CreateEventActivity.this, "Event Created Successfully", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(), HomeFragment.class);
                    startActivity(intent);
                }
            }
        });


    }
}