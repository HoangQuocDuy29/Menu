package com.example.menu;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button buttonSendMessage, buttonJson, buttonExitMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonSendMessage = findViewById(R.id.buttonSendMessage);
        buttonJson = findViewById(R.id.buttonJson);
        buttonExitMenu = findViewById(R.id.buttonExitMenu);

        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SendMessageActivity.class);
                startActivity(intent);
            }
        });

        buttonJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivityJson.class);
                startActivity(intent);
            }
        });

        buttonExitMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Thoát ứng dụng
            }
        });
    }
}
