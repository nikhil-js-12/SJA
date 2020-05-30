package com.nikhilstudios12.sja;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button mlogoutBtn;
    TextView mprofileBtn, mstudentBtn, mattendanceBtn, mreportBtn, mcircularBtn, mcontactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mprofileBtn = findViewById(R.id.profileBtn);
        mstudentBtn = findViewById(R.id.studentBtn);
        mattendanceBtn = findViewById(R.id.attendanceBtn);
        mreportBtn = findViewById(R.id.reportBtn);
        mcircularBtn = findViewById(R.id.circularBtn);
        mcontactBtn = findViewById(R.id.contactBtn);
        mlogoutBtn = findViewById(R.id.logoutBtn);


        mprofileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Profile.class));
            }
        });


        mstudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Student_Details.class));
            }
        });

        mattendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Attendance.class));
            }
        });

        mreportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Report_Card.class));
            }
        });

        mcircularBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Circular.class));
            }
        });

        mcontactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Contact_Us.class));
            }
        });

        mlogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });

    }
}



