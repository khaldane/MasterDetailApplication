package com.khaldane.masterdetailapp.EndpointContainers;

import java.util.ArrayList;

public class ListingDetailsDisplay {

    ArrayList<Results> results;

    public ListingDetailsDisplay() {
    }

    public ListingDetailsDisplay(ArrayList<Results> results) {
        this.results = results;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }
}
