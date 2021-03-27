package com.example.apisapplication;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Httpserviceid extends AsyncTask <Void, Void, IDprojec> {
    private String IDprojec;

    public Httpserviceid(String IDprojec){
        this.IDprojec=IDprojec;
    }

    @Override
    protected IDprojec doInBackground(Void... voids) {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(" https://api.nasa.gov/techport/api/projects/"+this.IDprojec+"?api_key=DEMO_KEY");
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
        return null;
    }
}
