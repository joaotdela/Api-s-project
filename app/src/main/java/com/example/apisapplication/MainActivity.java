package com.example.apisapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.CharArrayWriter;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private TextView Viewresult;
    public EditText editID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editID = findViewById(R.id.editid);
        Button buttonSearch = findViewById(R.id.btnsearch);
        Button btnup = findViewById(R.id.btnlastup);
        TextView Viewresult = findViewById(R.id.txtteste);


        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Httpserviceid service = new Httpserviceid(editID.getText().toString());
                try {
                    IDprojec retorno = service.execute().get();
                    //Viewresult.setText(retorno.toString());

                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}