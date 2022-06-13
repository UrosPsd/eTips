package com.etips.models;

import java.util.ArrayList;
import java.util.List;

public class QueryResults {
    private List<String> results;

    public QueryResults() {
        this.results = new ArrayList<>();
    }

    public QueryResults(List<String> results) {
        this.results = results;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    public void addResult(String res){
        this.results.add(res);
    }
}
