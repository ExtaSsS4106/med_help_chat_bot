package com.example.chatbotmed.api;

public class endPoints {

    private String URL = "http://192.168.1.176:8000";
    //authorisation
    private String LOGIN = "/mobile_api/app_functional/login";
    private String REGISTER = "/mobile_api/app_functional/register";
    //friends


    //url
    public void setURL(String url){
        this.URL = url;
    }
    public String getURL(){return this.URL;}
    //authorisation
    public String getLOGINPath(){return this.LOGIN;}
    public String getREGISTERPath(){return this.REGISTER;}


}
