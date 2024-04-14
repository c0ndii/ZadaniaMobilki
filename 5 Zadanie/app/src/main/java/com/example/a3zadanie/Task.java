package com.example.a3zadanie;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
        category = Category.HOME;
    }

    public Category getCategory() { return category; }
    public void setCategory(Category value) { this.category = value; }
    public Date getDate() {
        return date;
    }
    public void setDate(Date toString) { this.date = toString; }

    public boolean isDone() {
        return done;
    }

    public void setName(String toString) {
        this.name=toString;
    }

    public void setDone(boolean isChecked) {
        this.done=isChecked;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
