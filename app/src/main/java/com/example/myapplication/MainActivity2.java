package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView roomTypeEdit, noOfRoomsEdit, pricePerRoomEdit, totalEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        roomTypeEdit = (TextView) findViewById(R.id.roomType);
        noOfRoomsEdit = (TextView) findViewById(R.id.noOfRooms);
        pricePerRoomEdit = (TextView) findViewById(R.id.roomPrice);
        totalEdit = (TextView) findViewById(R.id.totalPrice);

        String roomType = getIntent().getExtras().getString("room_type");
        String noOfRooms = getIntent().getExtras().getString("number_of_rooms");
        String price = getIntent().getExtras().getString("price_per_room");

        roomTypeEdit.setText(roomType);
        noOfRoomsEdit.setText(noOfRooms);
        pricePerRoomEdit.setText(price);
        int totalPrice = Integer.parseInt(price) * Integer.parseInt(noOfRooms);
        totalEdit.setText(String.valueOf(totalPrice));
        Toast.makeText(this, "yess", Toast.LENGTH_SHORT).show();

    }
}