package com.example.upload1;

public class uploadPDF {
    public String name;
    public String url;

    //Empty constructor
    public uploadPDF() {
    }

    //Parameterized constructor
    public uploadPDF(String name, String url) {
        this.name = name;
        this.url = url;
    }

    //getter function
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
