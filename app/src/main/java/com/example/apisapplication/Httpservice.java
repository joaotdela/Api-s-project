package com.example.apisapplication;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Httpservice extends AsyncTask<Void, Void, Lastup> {
    @Override
    protected Lastup doInBackground(Void... voids) {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(" https://api.nasa.gov/techport/api/projects?updatedSince=2021-03-18&api_key=532ZBxMkfZRd8g5mil1betWTAraGOoeRH7w2nhP3");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.connect();

            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                result.append(scanner.next());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(result.toString(), Lastup.class);
    }
    
}
