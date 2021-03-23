package com.example.apisapplication;

public class IDprojec {
    private String id;
    private String lstup;
    private String title;
    private String status;
    private String startdate;
    private String enddate;
    private String description;
    private String benefits;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLstup() { return lstup;}

    public void setLstup(String lstup) {
        this.lstup = lstup;
    }

    public String getTitle(){return title;}

    public void setTitle(String title){this.title= title;}

    public String getStatus(){return status;}

    public void setStatus(String status){this.status= status;}

    public String getStartdate(){return startdate;}
    public void setStartdate(String startdate){this.startdate=startdate;}

    public String getEnddate(){return enddate;}
    public void setEnddate(String enddate){this.enddate=enddate;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String getBenefits(){return benefits;}
    public void setBenefits(String benefits){this.benefits=benefits;}
    @Override
    public String toString(){
        return "Projeto: " + getId()
                +"\n Ultima atualização:" + getLstup() +
                "\n Titulo:" + getTitle() +
                "\n Status do projeto:" + getStatus() +
                "\n Data de sua criação:" + getStartdate() +
                "\n Data de sua finilização:" + getEnddate() +
                "\n Descrição:" + getDescription() +
                "\n Beneficios" + getBenefits();

    }
}
