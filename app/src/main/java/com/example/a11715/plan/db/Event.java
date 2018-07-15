package com.example.a11715.plan.db;

import org.litepal.crud.DataSupport;

public class Event extends DataSupport{
    private String eventname;
    private long eventdate;
    private String eventremark;

    public String getEventName() {
        return eventname;
    }
    public void setEventName(String eventname){
        this.eventname=eventname;
    }
    public long getEventDate(){
        return eventdate;
    }
    public void setEventDate(long eventdate){
        this.eventdate=eventdate;
    }

    public String getEventremark() {
        return eventremark;
    }
    public void setEventremark(String eventremark){
        this.eventremark=eventremark;
    }
}
