package com.example.sanakazi.navigationexample.pojos;

import java.util.ArrayList;

/**
 * Created by SanaKazi on 8/26/2016.
 */
public class DataModel {



    private String headerTitle;
    private ArrayList<String> allItemsInSection;


    public DataModel() {

    }
    public DataModel(String headerTitle, ArrayList<String> allItemsInSection) {
        this.headerTitle = headerTitle;
        this.allItemsInSection = allItemsInSection;
    }



    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<String> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<String> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }


}