package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID,String description) {
        this.description = description;
        this.locationID = locationID;
        this.exits = new HashMap< String, Integer>();
        exits.put("Q", 0);

    }
    public void addExits(String description, int locationID){
        exits.put(description,locationID);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
