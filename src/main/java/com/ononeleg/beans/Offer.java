package com.ononeleg.beans;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by ilya on 07/12/2016.
 */
public class Offer {

    @Id
    private String id;
    private User user;
    private String content;
    private double price;
    private View view;
    private Date date;
    private long viewCount;



}
