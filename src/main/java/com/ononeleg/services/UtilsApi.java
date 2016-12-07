package com.ononeleg.services;

import com.ononeleg.beans.Offer;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilya on 07/12/2016.
 */
public class UtilsApi {


    public static List<Offer> getUpdatedOffers() {
        RestTemplate restTemplate = new RestTemplate();
       // List<Offer> offers = restTemplate.getForEntity("http://gturnquist-quoters.cfapps.io/api/random", Offer.class);
        List<Offer> offers=new ArrayList<>();
        return offers;
    }
}
