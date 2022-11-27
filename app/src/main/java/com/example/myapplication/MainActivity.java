package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button plusButton, minusButton,bookButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = (Button) findViewById(R.id.plusBtn);
        minusButton = (Button) findViewById(R.id.minusBtn);
        bookButton = (Button) findViewById(R.id.bookBtn);
        editText = (EditText) findViewById(R.id.numberOfRooms);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOfRooms = Integer.parseInt(editText.getText().toString());
                numberOfRooms = numberOfRooms+1;
                editText.setText(String.valueOf(numberOfRooms));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOfRooms = Integer.parseInt(editText.getText().toString());
                numberOfRooms = numberOfRooms-1;
                editText.setText(String.valueOf(numberOfRooms));
            }
        });

        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("room_type","Delux Double Suite");
                intent.putExtra("number_of_rooms",editText.getText().toString());
                intent.putExtra("price_per_room","500");
                startActivity(intent);
            }
        });




    }
}