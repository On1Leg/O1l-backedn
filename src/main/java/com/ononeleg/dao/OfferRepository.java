package com.ononeleg.dao;

import com.ononeleg.beans.Offer;
import com.ononeleg.beans.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ilya on 07/12/2016.
 */
public interface OfferRepository extends MongoRepository<Offer, String> {

    //gives the request by the requested name
    public Offer findByContent(String content);
    //gives the list by the views count
    public List<Offer> findByViewCount(long viewCount);


}

//public interface CustomerRepository extends MongoRepository<Customer, String> {
//
//    public Customer findByFirstName(String firstName);
//    public List<Customer> findByLastName(String lastName);
//
//}