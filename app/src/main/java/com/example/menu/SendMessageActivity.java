package com.example.menu;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendMessageActivity extends AppCompatActivity {

    private EditText editTextPhoneNumber, editTextMessageContent;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextMessageContent = findViewById(R.id.editTextMessageContent);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String messageContent = editTextMessageContent.getText().toString();

                if (!phoneNumber.isEmpty() && !messageContent.isEmpty()) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNumber, null, messageContent, null, null);
                    Toast.makeText(SendMessageActivity.this, "Tin nhắn đã được gửi!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SendMessageActivity.this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
