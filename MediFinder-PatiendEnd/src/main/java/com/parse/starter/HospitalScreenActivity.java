package com.parse.starter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.parse.LogOutCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class HospitalScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_screen);
    }

    public void updateInfo(View view){
        Intent intent = new Intent(HospitalScreenActivity.this, SignUp2Activity.class);
        startActivity(intent);
    }

    public void logOut(View view) {
        ParseUser.logOutInBackground(new LogOutCallback() {
            @Override
            public void done(ParseException e) {
                Intent intent = new Intent(HospitalScreenActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    public void tryCall(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0123456789"));
        startActivity(intent);
    }
}
