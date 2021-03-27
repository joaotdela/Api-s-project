package com.example.api;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class TechRequest extends AsyncTask<String,Integer,String> {

    String URL;
    Context context;

    TechRequest(Context context){this.context=context;}

    @Override
    protected String doInBackground(String... params) {

        URL = params[0];
        try {
            URL url = new URL(URL);
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept","application/json");

            // read the output from the server
            BufferedReader Bufreader= new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder strbuild = new StringBuilder();

            String line = null;
            while ((line = Bufreader.readLine()) != null) {
                strbuild.append(line + "\n");
            }

            return strbuild.toString();

        }
        catch (Exception data) {
            data.printStackTrace();
            return data.toString();
        }
    }
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        try{
            JSONObject js = new JSONObject(s);
            JSONObject proj = js.getJSONObject("project");

            String ids = proj.getString("id");
           String name = proj.getString("title");
           String description = proj.getString("description");
           System.out.println(ids + name + description);

           Toast.makeText(context, "ID:"+ids +"\n" +"Nome:"+name +"\n"+ "Descrição:" +description, Toast.LENGTH_SHORT).show();

        }catch(JSONException da){
            da.printStackTrace();
        }
    }
}
