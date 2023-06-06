package com.example.blackcoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class RefineActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    SeekBar seekBar;
    String[] country = { "Available | Het Let's Connect", "Away | Stay Discreet and Watch",
            "Busy | Do not disturb | Will catch up later", "SOS | Emergency! Need Assistance! HELP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);


        Button button = (Button) findViewById(R.id.backbtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(RefineActivity.this, MainActivity.class);
                startActivity(send);
            }
        });


        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(),"Location Distance: "+progress+" Kms", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,R.layout.spinner_list,country);
        aa.setDropDownViewResource(R.layout.spinner_list);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void savebtn(View view){
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}