package com.example.newgame;


import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;


public class VideoRecord {

    private SimpleStringProperty title;
    private ArrayList<String> keywords;

    private SimpleStringProperty path;


    public VideoRecord(String title, ArrayList<String> list) {
        this.title = new SimpleStringProperty(title);
        this.keywords = list;
    }

    public String getPath() {
        return path.get();
    }

    public SimpleStringProperty pathProperty() {
        return path;
    }

    public void setPath(String path) {
        this.path = new SimpleStringProperty(path);
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public boolean containsKeyword(String searchTerm) {
        for (String keyword : keywords) {
            if (keyword.toLowerCase().contains(searchTerm)) {
                return true;
            }
        }
        return false;
    }
}