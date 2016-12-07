package com.ononeleg.beans;

import org.springframework.data.annotation.Id;

/**
 * Created by ilya on 07/12/2016.
 */
public class Response {

    @Id
    private String id;
    private final String apply;
    private final String category;

    public Response(String apply, String category) {
        this.apply = apply;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getApply() {
        return apply;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id='" + id + '\'' +
                ", apply='" + apply + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
