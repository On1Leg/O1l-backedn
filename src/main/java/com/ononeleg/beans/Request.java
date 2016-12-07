package com.ononeleg.beans;

/**
 * Created by ilya on 07/12/2016.
 */

public class Request {

    private final long id;
    private final String name;
    private final String content;
    private final String views;
    private final int amount;


    public Request(long id, String name, String content, String views, int amount) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.views = views;
        this.amount = amount;
    }

    public String getViews() {
        return views;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
