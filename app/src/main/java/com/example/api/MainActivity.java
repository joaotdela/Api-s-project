package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btn_search;
    EditText edit_name;
    String url;
    ListView list;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_search = findViewById(R.id.btnsearch);
        edit_name = findViewById(R.id.etxt_num);
        list = findViewById(R.id.list);


    }
    // on click botão procurar
    public void requestApiButtonClick(View v){
        url = Techportlink();
        TechRequest dictionaryRequest =  new TechRequest(this);
        dictionaryRequest.execute(url);

    }

    private String Techportlink() {
        final String publicKey = "532ZBxMkfZRd8g5mil1betWTAraGOoeRH7w2nhP3";
        final String id = edit_name.getText().toString();
        Long tsLong = System.currentTimeMillis()/1500;
        return "https://api.nasa.gov/techport/api/projects/" + id + "?api_key=" + publicKey;

    }}