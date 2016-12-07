package com.ononeleg.dao;

import com.ononeleg.beans.Request;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ilya on 07/12/2016.
 */
public interface RequestRepository extends MongoRepository<Request, String> {

    //gives the request by the requested name
    public Request findByName(String name);
    //gives the list by the views count
    public List<Request> findByViews(long views);




}
