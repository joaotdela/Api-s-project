package com.example.apisapplication;

public class Lastup {
    private String id;
    private String lstup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLstup() {
        return lstup;
    }

    public void setLstup(String lstup) {
        this.lstup = lstup;
    }
    @Override
    public String toString(){
        return "Projeto: " + getId()
        +"\n Ultima atualização:" + getLstup();
    }
}
