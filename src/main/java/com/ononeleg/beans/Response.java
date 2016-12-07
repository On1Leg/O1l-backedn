package com.ononeleg.beans;

/**
 * Created by ilya on 07/12/2016.
 */
public class Response {

    private final String id;
    private final String apply;
    private final String category;

    public Response(String id, String apply, String category) {
        this.id = id;
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
}
