package com.ononeleg.beans;

import org.springframework.data.annotation.Id;

/**
 * Created by ilya on 07/12/2016.
 */

public class Request {

    @Id
    private String id;
    private final String name;
    private final String content;
    private final long views;
    private final int amount;


    public Request(String name, String content, long views, int amount) {
        this.name = name;
        this.content = content;
        this.views = views;
        this.amount = amount;
    }

    public long getViews() {
        return views;
    }

    public String getId() {
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

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", views='" + views + '\'' +
                ", amount=" + amount +
                '}';
    }
}
