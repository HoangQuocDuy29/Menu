package com.example.menu;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivityJson extends AppCompatActivity {

    private Button buttonShowJson;
    private TextView textViewJsonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_json);

        buttonShowJson = findViewById(R.id.buttonShowJson);
        textViewJsonResult = findViewById(R.id.textViewJsonResult);

        buttonShowJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    JSONArray jsonArray = new JSONArray();

                    JSONObject student1 = new JSONObject();
                    student1.put("name", "Nguyen Van A");
                    student1.put("id", "CNTTK15A01");

                    JSONObject student2 = new JSONObject();
                    student2.put("name", "Tran Thi B");
                    student2.put("id", "CNTTK15A02");

                    jsonArray.put(student1);
                    jsonArray.put(student2);

                    textViewJsonResult.setText(jsonArray.toString(4)); // Hiển thị JSON với indent 4
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
